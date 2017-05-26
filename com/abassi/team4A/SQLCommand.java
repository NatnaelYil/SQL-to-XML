package com.abassi.team4A;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Defines the definition, fields, and blocks of a command parsed by the system.
 *
 * Contains a list of columns, command definitions (for SQL command generation) and the contents of the FROM and WHERE sections.
 */
public class SQLCommand {
    private String CommandType;

    private boolean lock = false;


    private List<Object> Columns = new ArrayList<>();
    //private List<XMLBlock> XMLBlocks = new ArrayList<>();

    private String FromString;
    private String WhereString;

    public List<Object> getColumns() {
        return Columns;
    }

    public String getFromString() {
        return FromString;
    }

    public String getWhereString() {
        return WhereString;
    }

    public void setLock() {
        lock = true;
    }

    public boolean getLock() {
        return lock;
    }

    void setFromString(String str) {
        FromString = str;
    }

    void setWhereString(String str) {
        WhereString = str;
    }


    void setCommandType(String cmd) {
        CommandType = cmd;
    }


    // public List<XMLBlock> getXMLBlocks() {
    //    return XMLBlocks;
    //}

    String getCommandType() {
        return CommandType;
    }

    private String handleSQLColumn(SQLColumn sqlc, int x) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(sqlc.getColumnName());
        if (sqlc.getAliasName() != null) {
            cmd.append(" AS " + sqlc.getAliasName());
        }
        if (++x < Columns.size()) {
            cmd.append(",");
        }
        return cmd.toString();
    }

    /* Function for handling XML Blocks.
     *
     * Used by the command generator to handle command generation for XML blocks.
     */
    private String handleXMLBlock(XMLBlock xmlb, Stack<XMLBlock> xmls, int x) {
        StringBuilder cmd = new StringBuilder();

            cmd.append(ReadXMLBlock(xmlb, xmls));
            if(++x < this.getColumns().size()) {
                cmd.append(",");
            }
            return cmd.toString();
    }


    /* Generates a new command for Oracle.
     *
     * Builds the command based on the data present within the SQLCommand object. Generally guaranteed to be valid.
     */
    public String constructCommand() {
        Stack<XMLBlock> xmlstack = new Stack<>();
        StringBuilder cmd = new StringBuilder();
        cmd.append(this.getCommandType() + " ");


        int x = 0;
        for(Object objc : Columns) {
            if(objc instanceof SQLColumn) {
                cmd.append(handleSQLColumn((SQLColumn)objc, x++));
            }
            if(objc instanceof XMLBlock) {
                cmd.append(handleXMLBlock((XMLBlock)objc,xmlstack, x++));
            }

        }

        cmd.append(" FROM " + getFromString());
        if(getWhereString() != null) {
            cmd.append(" " + getWhereString());
        }

        return cmd.toString();
    }

    /* Used by the Command Generator to recursively read new XML blocks.
     *
     * This is required to impliment the recusrive blocks in the assignment definition.
     */
    private String ReadXMLBlock(XMLBlock xml, Stack<XMLBlock> stack) {
        stack.push(xml);
        StringBuilder str = new StringBuilder();
        int x = 0;

        for(Object obj : xml.getColumns()) {
            if (obj instanceof SQLColumn) {
                SQLColumn col = (SQLColumn)obj;
                if (col == null || col.getColumnName() == null) { // Required because the unusual comma syntax, for some reason, generates a second column that is null as a result of the trailing commas.
                    continue;
                }
                str.append(col.getColumnName());

                if (col.getAliasName() != null) {
                    str.append(" AS " + col.getAliasName());
                } else if (col.getColumnName().contains("*")) {
                } else {
                    StringTokenizer tok = new StringTokenizer(col.getColumnName(), ".");
                    if(tok.countTokens() > 1) {
                        tok.nextToken();
                        str.append(" AS " + tok.nextToken());
                    }
                    else {
                        str.append(" AS " + col.getColumnName()); //
                    }
                }

            }
            else if(obj instanceof XMLBlock) {
                str.append(ReadXMLBlock((XMLBlock)obj, stack));
                ++x;
            }
            if (++x < xml.getColumns().size()) {
                str.append(",");
            }
        }

        stack.pop();

        return str.toString();
    }
}
