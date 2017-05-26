package com.abassi.team4A;

import com.sun.rowset.CachedRowSetImpl;
import org.antlr.runtime.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.sql.*;
import java.io.*;
import java.util.*;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import static java.lang.Thread.sleep;

public class Main {

    /* Driver enumerator for driver selection. */
    public enum DRIVER {
        ORACLE, SQLITE
    }

    public static void main(String args[]) throws SQLException {
        String username;
        String password;
        String sqlquery;
        String val;
        int input;
        Scanner keyboardInput;
        SQLXMLParser parse = new SQLXMLParser();
        SQLCommand sqlc;
        XMLBlock dbblock;
        DRIVER drv = DRIVER.ORACLE;
        String sqliteFileName = null;
        Connection conn = null;
        keyboardInput = new Scanner(System.in);
        XmlSchemaGen xmlschema = null;
        File lastXML = new File("lastXML.xml");

        System.out.println("Welcome to Team A4 - SQL To XML Program");
        System.out.println("Robin Hall");
        System.out.println("Jeremiah Akins");
        System.out.println("Mohammed Salman Khan");
        System.out.println("Jesus Madrigal");
        System.out.println("Natnael Mengesha");
        System.out.println("\n");


        if (args.length >= 2) {
            if (args[0].toLowerCase().compareTo("sqlite") == 0) {
                sqliteFileName = args[1];
                drv = DRIVER.SQLITE;
            } else {
                System.out.println("Invalid command line arguments. Please enter a valid driver name and try again");
                System.exit(5);
            }
        }



        switch (drv) {
            case ORACLE:
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver load failed. Please make sure the driver is installed or included with this package.");
                System.exit(2);
            }

            System.out.println("Enter Server Connection URI ('default' for olympia):");
            String connectionstring = keyboardInput.nextLine();

            if(connectionstring.compareTo("default") == 0) {
                connectionstring = "olympia.unfcsd.unf.edu:1521";
            }

            System.out.println("Enter Oracle Username: ");
            username = keyboardInput.nextLine();
            //username = "mengeshan";

            System.out.println("Enter Oracle Password: ");
            Console cons = System.console();
            password = new String(cons.readPassword());

            // password = "n73866";
            try {
                conn = DriverManager.getConnection("jdbc:oracle:thin:@" + connectionstring + ":dworcl", username, password);
            }
            catch (SQLException e) {
                System.out.println("Connection Error: " + e.getMessage());
                System.exit(6);
            }
            break;
            case SQLITE:
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver load failed. Please make sure the driver is installed or included with this package.");
                System.exit(2);
            }
            if (new File(sqliteFileName).exists()) {
                conn = DriverManager.getConnection("jdbc:sqlite:" + sqliteFileName);
            } else {
                System.out.println("SQLite Database " + sqliteFileName + " does not exist. Check the file name and try again.");
                System.exit(3);
            }
            break;
            default:
                System.out.println("Invalid or unsupported driver. Exiting.");
                System.exit(4);
        }

        Statement stmt = conn.createStatement();

        // For storing last query.
        DOMSource storedxml = null;


        List<String> tables = getTables(drv, conn);
        Main.displayMenu();

        while (true) {


            try {

                System.out.print("MENU (0 to show again) > ");
                input = keyboardInput.nextInt();
                keyboardInput.nextLine();
                switch (input) {

                    case 1:
                        // Spool up the XML parser.
                        System.out.print("SQLXML > ");
                        val = keyboardInput.nextLine();

                        if (!val.isEmpty()) { // Don't pass a blank string to the parser. Wastes time.
                            sqlc = parse.GetCommandFromString(val);
                            if(sqlc == null) {
                                break;
                            }
                            sqlquery = sqlc.constructCommand();
                            ResultSet results = stmt.executeQuery(sqlquery);
                            CachedRowSet rset = new CachedRowSetImpl();
                            rset.populate(results);
                            results.close();

                            List<Integer> Compress = GetCompressableColumn(sqlc, 0);
                            if(Compress.isEmpty()) {
                                storedxml = buildXML(rset, sqlc);
                            }
                            else {
                                storedxml = BuildCompressedXML(rset, sqlc);
                            }
                            rset.close();

                            if(!lastXML.createNewFile()) {
                                lastXML.delete();
                                lastXML.createNewFile();
                            }

                            lastXML.deleteOnExit();

                            TransformerFactory transformerfactory = TransformerFactory.newInstance();
                            Transformer transformer = transformerfactory.newTransformer();
                            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                            StreamResult filePrinter = new StreamResult(lastXML);
                            transformer.transform(storedxml, filePrinter);

                            // Now to build the xsd.

                            xmlschema = new XmlSchemaGen(lastXML);
                            System.out.println("Query successful.");
                            System.out.println("Use Commands 4 to show XML, and 5 to show XSD.");

                        }
                        break;
                    case 2:
                        System.out.println("========== TABLES ==========");
                        for(String str : tables) {
                            System.out.println(str);
                        }
                        break;
                    case 3:
                        System.out.println("\nEnter table name:");
                        System.out.print("TABLENAME > ");
                        DescribeTable(keyboardInput.next(), drv, conn);
                        break;
                    case 4:
                        if(storedxml == null) {
                            System.out.println("A query has not been run. Run a query before running this command.");
                        }
                        else {
                            TransformerFactory transformerfactory = TransformerFactory.newInstance();
                            Transformer transformer = transformerfactory.newTransformer();
                            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                            StreamResult consolePrinter = new StreamResult(System.out);

                            transformer.transform(storedxml, consolePrinter);
                        }
                        break;
                    case 5:
                        if(storedxml == null || xmlschema == null) {
                            System.out.println("A query has not been run. Run a query before running this command.");
                            break;
                        }

                        xmlschema.printXsdFormat();
                        break;
                    case 6:
                        if(storedxml == null) {
                            System.out.println("A query has not been run. Run a query before running this command.");
                        }
                        else {
                            System.out.println("Enter the name of the new file (no .xml extension)");
                            String filename = keyboardInput.nextLine();
                            if(filename.isEmpty()) {
                                System.out.println("Save cancelled.");
                                break;
                            }

                            TransformerFactory transformerfactory = TransformerFactory.newInstance();
                            Transformer transformer = transformerfactory.newTransformer();
                            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                            StreamResult filePrinter = new StreamResult(new File(filename + ".xml"));

                            transformer.transform(storedxml, filePrinter);

                            System.out.println("Save successful.");
                        }
                        break;
                    case 7:
                        if(storedxml == null || xmlschema == null) {
                            System.out.println("A query has not been run. Run a query before running this command.");
                            break;
                        }

                        System.out.println("Enter the name of the new file (no .xsd extension)");
                        String filename = keyboardInput.nextLine();

                        if(filename.isEmpty()) {
                            System.out.println("Save cancelled.");
                            break;
                        }


                        xmlschema.writeFile(filename + ".xsd");
                        System.out.println("Save successful.");
                        break;
                    case 8:
                        displayHelp();
                        keyboardInput.next();
                        break;
                    case 9:
                        System.out.println("Exiting.");
                        lastXML.deleteOnExit();
                        stmt.close();
                        System.exit(0);
                        break;
                    case 0:
                        displayMenu();
                        break;
                    default:
                        System.err.println("(The option does not exist. Press ENTER to continue.)\n");
                        keyboardInput.nextLine();
                }
                keyboardInput.reset();
            } catch (Exception exception) {
                System.err.println("An error has occurred: ");
                if(exception.getMessage() == null) {
                    System.err.println(exception.toString());
                }
                System.err.println(exception.getMessage());

                System.out.println("Press ENTER to continue.");
                keyboardInput.nextLine();
                keyboardInput.reset();
            }
        }

    }

    /*
     *  Get a list of tables from the database, accessable by the user. This statement differs depending on database type.
     */
    private static List<String> getTables(DRIVER drv, Connection conn) throws SQLException {
        Statement stmt;
        ResultSet results;
        int colcount;
        ResultSetMetaData rsmd;
        List<String> list = new LinkedList<String>();
        System.out.println("========== TABLES ==========");
        switch(drv) {
            case ORACLE:
                stmt = conn.createStatement();
                results = stmt.executeQuery("SELECT table_name FROM user_tables");

                rsmd = results.getMetaData();
                colcount = rsmd.getColumnCount();

                while(results.next()) {
                    for(int i = 1; i <= colcount; i++) {
                        System.out.println(results.getString(i));
                        list.add(results.getString(i));
                    }
                }
                break;
            case SQLITE:
                stmt = conn.createStatement();
                results = stmt.executeQuery("SELECT name FROM sqlite_master where type='table'");

                rsmd = results.getMetaData();
                colcount = rsmd.getColumnCount();

                while(results.next()) {
                    for(int i = 1; i <= colcount; i++) {
                        System.out.println(results.getString(i));
                        list.add(results.getString(i));
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("============================\n");
        return list;
    }

    /* Code for describing an SQL table. This will usually be handled differently depending on database type. */
    private static void DescribeTable(String tbl, DRIVER drv, Connection conn) throws SQLException {
        PreparedStatement stmt;
        ResultSet results;
        int colcount;
        ResultSetMetaData rsmd;
        List<String> list = new LinkedList<String>();

        String header = "========== COLUMNS FOR TABLE " + tbl + " ==========";

        switch(drv) {
            case ORACLE:
                stmt = conn.prepareStatement("SELECT * FROM " + tbl.toUpperCase()); // These should be parameterized but JDBC seems to think otherwise. I'm not going to fight with it at the last minute.
                //stmt.setString(1, tbl);
                results = stmt.executeQuery();

                rsmd = results.getMetaData();
                colcount = rsmd.getColumnCount();


                System.out.println(header);
                results.next();
                    for (int i = 1; i <= colcount; i++) {
                        System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
                    }
                    results.close();
                break;
            case SQLITE:
                stmt = conn.prepareStatement("PRAGMA table_info(" + tbl + ")");
                //stmt.setString(1, tbl);
                results = stmt.executeQuery();

                rsmd = results.getMetaData();
                colcount = rsmd.getColumnCount();

                System.out.println(header);
                while(results.next()) {
                        System.out.println(results.getString(2) + " " + results.getString(3));
                }
                results.close();
                break;
            default:
                break;
        }
        for(int x = 0; x < header.length(); x++) {
            System.out.print("=");
        }
        System.out.println();
    }

    /* Display the help text. Nothing more, nothingless. */
    private static void displayHelp() {
        System.out.println("========== HELP ==========");
        System.out.println("1. Execute Command: Enter a modified SQL statement in the next line");
        System.out.println("Examples of these statements can be found in the documentation\n");
        System.out.println("2. Get the list of tables that can be read from the database");
        System.out.println("3. Get column and type information for a table");
        System.out.println("4. Display XML of last query: Display the XML from the previously entered query");
        System.out.println("5. Display XSD of last query: Display the XSD from the previously entered query");
        System.out.println("6. Save XML of last query: Save the XML from the last query to disk");
        System.out.println("7. Save XSD of last query: Save the XSD from the last query to disk");
        System.out.println("8. Help: Print this text.");
        System.out.println("9. Exit the program");
        System.out.println("0. Reprint the menu");
    }

    /*
     * Prints the menu used in the main function.
     */
    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("==============================");
        System.out.println("1: Execute command");
        System.out.println("2: Print available tables");
        System.out.println("3: Describe a table");
        System.out.println("4: Display XML of last query");
        System.out.println("5: Display XSD of last query");
        System.out.println("6: Save XML of last query");
        System.out.println("7: Save XSD of last query");
        System.out.println("8: Help");
        System.out.println("9: Exit");
        System.out.println("==============================");
    } //End displayMenu()

    /*
     * Get a list of column numbers that are compressable. Only one is used because the compression is theoretically limited to only a single column.
     */
    public static List<Integer> GetCompressableColumn(Object obj, int ColumnNumber) {
        List<Integer> CompressableColumns = new LinkedList<Integer>();

        if (obj instanceof SQLCommand) {
            SQLCommand cmd = (SQLCommand) obj;

            for (Object obj2 : cmd.getColumns()) {
                if (obj2 instanceof SQLColumn) {
                    SQLColumn col = (SQLColumn) obj2;
                    if (col.getCompress()) {
                        CompressableColumns.add(ColumnNumber);
                    }
                } else if (obj2 instanceof XMLBlock) {
                    XMLBlock xml = (XMLBlock) obj2;
                    if (xml.getCompress()) {
                        CompressableColumns.add(ColumnNumber);
                    }
                    CompressableColumns.addAll(GetCompressableColumn(xml, ColumnNumber));
                }
                ColumnNumber++;
            }
        }
        if (obj instanceof XMLBlock) {
            XMLBlock xmlb = (XMLBlock) obj;

            for (Object obj2 : xmlb.getColumns()) {
                if (obj2 instanceof SQLColumn) {
                    SQLColumn col = (SQLColumn) obj2;
                    if (col.getCompress()) {
                        CompressableColumns.add(ColumnNumber);
                    }
                    continue;
                } else if (obj2 instanceof XMLBlock) {
                    XMLBlock xml = (XMLBlock) obj2;
                    if (xml.getCompress()) {
                        CompressableColumns.add(ColumnNumber);
                    }
                    CompressableColumns.addAll(GetCompressableColumn(xml, ColumnNumber));
                }
                ColumnNumber++;
            }
        }
        return CompressableColumns;
    }

    /* Build a set of unique values in each column, for compression. */
    private static LinkedList<LinkedList<String>> BuildUniqueSetList(CachedRowSet results, List<Integer> compressables) throws SQLException {
        LinkedList<LinkedList<String>> Uniques = new LinkedList<>();

        for(Integer nmb : compressables) { // Any set before these column numbers must be unique.
            Boolean exists;
            LinkedList<String> lst = new LinkedList<>();
            results.beforeFirst();
            while(results.next()) {
                exists = false;
                for(String str : lst) {
                    for(int x = 0; x < nmb; x++) {
                        if (str.compareTo(results.getString(x + 1)) == 0) {
                            exists = true;
                        }
                    }
                }
                if(!exists) {
                    for(int x = 0; x < nmb; x++) {
                        lst.add(results.getString(x+1));
                    }
                }
            }
            Uniques.add(lst);
        }
        return Uniques;
    }


    /*
     * Builds the compressed XML document, if the compressable tag is present.
     */
    private static DOMSource BuildCompressedXML(CachedRowSet results, SQLCommand cmd) throws SQLException, ParserConfigurationException {
        try {

            List<Integer> compress = GetCompressableColumn(cmd, 0);
            LinkedList<LinkedList<String>> uniques = BuildUniqueSetList(results, compress); // Get a list of unique values that link to this value.

            ResultSetMetaData sqlmetadata = results.getMetaData();
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();

            LinkedList<DBColumn> columnNames = new LinkedList<DBColumn>();

            for (int x = 1; x <= sqlmetadata.getColumnCount(); x++) {
                columnNames.add(new DBColumn(sqlmetadata.getTableName(x), sqlmetadata.getColumnName(x)));
            }

            // Start building the XML doc. Do it hierarchally.
            Element rootElement = doc.createElement("ThisQuery");
            doc.appendChild(rootElement);

            results.beforeFirst();


            int startCompression = compress.get(compress.size()-1); // Get last element, since that is the column we are going to care about.


            // Hack Hackity Hack Hack
            HashMap<String, Element> elementlist = new HashMap<>();

            for (int x = 0; x < uniques.size(); x++) {
                for (int y = 0; y < uniques.get(x).size(); y++) {
                    Element record = doc.createElement("A_Record");
                    int selColumn = 0;
                    for (Object obj : cmd.getColumns()) {
                        if (selColumn > startCompression) {
                            break;
                        }
                        if (obj instanceof SQLColumn) {
                            SQLColumn col = (SQLColumn) obj;
                            StringTokenizer token = new StringTokenizer(col.getColumnName(), ".");

                            if (col.getAliasName() == null) {
                                Element ColumnElement = doc.createElement(columnNames.get(selColumn).getColumnName());
                                Attr tblName = doc.createAttribute("table");
                                Attr colName = doc.createAttribute("column");

                                if (token.countTokens() > 1) {
                                    tblName.setValue(token.nextToken());
                                    colName.setValue(token.nextToken());
                                } else {
                                    tblName.setValue("N/P");
                                    colName.setValue(token.nextToken());
                                }

                                ColumnElement.setAttributeNode(colName);
                                ColumnElement.setAttributeNode(tblName);

                                ColumnElement.appendChild(doc.createTextNode(uniques.get(x).get(y)));

                                record.appendChild(ColumnElement);

                            }
                            else {
                                Element ColumnElement = doc.createElement(col.getAliasName().toUpperCase());
                                Attr tblName = doc.createAttribute("table");
                                Attr colName = doc.createAttribute("column");

                                if (token.countTokens() > 1) {
                                    tblName.setValue(token.nextToken());
                                    colName.setValue(token.nextToken());
                                } else {
                                    tblName.setValue("N/P");
                                    colName.setValue(token.nextToken());
                                }

                                ColumnElement.setAttributeNode(colName);
                                ColumnElement.setAttributeNode(tblName);

                                ColumnElement.appendChild(doc.createTextNode(uniques.get(x).get(y)));

                                record.appendChild(ColumnElement);
                            }
                            elementlist.put(record.getTextContent(), record);
                        }

                    }
                }
            }

            while (results.next()) {
                int selColumn = 0;
                Element attach; // Store the attached column.

                attach = elementlist.get(results.getString(1));


                for(Object obj : cmd.getColumns()) {
                    if(selColumn < startCompression) {
                        selColumn++;
                        continue;
                    }

                    if (obj instanceof SQLColumn) {
                        SQLColumn col = (SQLColumn) obj;
                        StringTokenizer token = new StringTokenizer(col.getColumnName(), ".");

                        if (col.getAliasName() == null) {
                            Element ColumnElement = doc.createElement(columnNames.get(selColumn).getColumnName());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(colName);
                            ColumnElement.setAttributeNode(tblName);

                            ColumnElement.appendChild(doc.createTextNode(results.getString(columnNames.get(selColumn).getColumnName())));

                            attach.appendChild(ColumnElement);

                        } else {
                            Element ColumnElement = doc.createElement(col.getAliasName().toUpperCase());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(colName);
                            ColumnElement.setAttributeNode(tblName);

                            ColumnElement.appendChild(doc.createTextNode(results.getString(columnNames.get(selColumn).getColumnName())));

                            attach.appendChild(ColumnElement);
                        }
                    } else if (obj instanceof XMLBlock) { // It's XMLBlock time!
                        XMLBlock xml = (XMLBlock) obj;
                            attach.appendChild(GenBlockXML(xml, selColumn, doc, columnNames, results));
                    }
                    selColumn++;


                }

            }

            for(Element ele : elementlist.values()) {
                rootElement.appendChild(ele);
            }

            DOMSource source = new DOMSource(doc);

            System.out.println(doc.getTextContent());

            return source;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /* Build the XML structure and return the DOMSource. */
    private static DOMSource buildXML(CachedRowSet sqlresults, SQLCommand cmd) {
        try {
            ResultSetMetaData sqlmetadata = sqlresults.getMetaData();
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();

            LinkedList<DBColumn> columnNames = new LinkedList<>();

            for (int x = 1; x <= sqlmetadata.getColumnCount(); x++) {
                columnNames.add(new DBColumn(sqlmetadata.getTableName(x), sqlmetadata.getColumnName(x)));
            }


            Element rootElement = doc.createElement("ThisQuery");
            doc.appendChild(rootElement);


            while (sqlresults.next()) { // You better bring it.
                int selColumn = 0;
                Element recordElement = doc.createElement("A_Record");
                rootElement.appendChild(recordElement);

                for (Object obj : cmd.getColumns()) {
                    if (obj instanceof SQLColumn) {
                        SQLColumn col = (SQLColumn) obj;
                        StringTokenizer token = new StringTokenizer(col.getColumnName(), ".");

                        if (col.getAliasName() == null) {
                            Element ColumnElement = doc.createElement(columnNames.get(selColumn).getColumnName());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if(token.countTokens() >= 3) {
                                token.nextToken(); // If we have a schema name, we need to move to the next token to skip over it (So that the XML generates properly.)
                            }

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(colName);
                            ColumnElement.setAttributeNode(tblName);

                            ColumnElement.appendChild(doc.createTextNode(sqlresults.getString(columnNames.get(selColumn).getColumnName())));

                            recordElement.appendChild(ColumnElement);

                        } else {
                            Element ColumnElement = doc.createElement(col.getAliasName().toUpperCase());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(colName);
                            ColumnElement.setAttributeNode(tblName);

                            ColumnElement.appendChild(doc.createTextNode(sqlresults.getString(columnNames.get(selColumn).getColumnName())));

                            recordElement.appendChild(ColumnElement);
                        }
                    } else if (obj instanceof XMLBlock) { // It's XMLBlock time!
                        XMLBlock xml = (XMLBlock) obj;
                        if(!xml.getCompress()) {
                            recordElement.appendChild(GenBlockXML(xml, selColumn, doc, columnNames, sqlresults));
                        }
                        }
                        selColumn++;
                    }

                }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            return new DOMSource(doc);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /* Generate the XML element for an XML Block. */
    private static Element GenBlockXML(XMLBlock xml, int selColumn, Document doc, List<DBColumn> cols, CachedRowSet results) throws SQLException {
        {
            try {
                Element xmlElement = doc.createElement(xml.getBlockName());

                //if (xml.getCompress()) {

                //}

                for (Object obj : xml.getColumns()) {
                    if (obj instanceof SQLColumn) {
                        SQLColumn col = (SQLColumn) obj;
                        StringTokenizer token = new StringTokenizer(col.getColumnName(), ".");
                        System.out.println(col.getAliasName());

                        if (col.getAliasName() == null) {

                            Element ColumnElement = doc.createElement(cols.get(selColumn).getColumnName());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(tblName);
                            //System.out.println("Added Attrib:" + tblName.getTextContent());
                            ColumnElement.setAttributeNode(colName);
                            //System.out.println("Added Attrib:" + colName.getTextContent());
                            ColumnElement.appendChild(doc.createTextNode(results.getString(cols.get(selColumn).getColumnName())));
                            //System.out.println("Added Data:" + ColumnElement.getTextContent());

                            xmlElement.appendChild(ColumnElement);
                            //System.out.println("Added \"XML Record\"");

                        } else {
                            Element ColumnElement = doc.createElement(col.getAliasName().toUpperCase());
                            Attr tblName = doc.createAttribute("table");
                            Attr colName = doc.createAttribute("column");

                            if (token.countTokens() > 1) {
                                tblName.setValue(token.nextToken());
                                colName.setValue(token.nextToken());
                            } else {
                                tblName.setValue("N/P");
                                colName.setValue(token.nextToken());
                            }

                            ColumnElement.setAttributeNode(tblName);
                            ColumnElement.setAttributeNode(colName);
                            ColumnElement.appendChild(doc.createTextNode(results.getString(cols.get(selColumn).getColumnName())));

                            xmlElement.appendChild(ColumnElement);
                        }
                    } else if (obj instanceof XMLBlock) {
                        xmlElement.appendChild(GenBlockXML((XMLBlock)obj, selColumn, doc, cols, results));
                    }
                selColumn++;


                }
                return xmlElement;
            } catch (Exception e) {
                throw(e);
            }
        }
    }
}