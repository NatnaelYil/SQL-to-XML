package com.abassi.team4A;



import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

/**
 * Created by robin on 11/23/2016.
 */

/* Object: SQLXMLParser
 * This object houses the parser objects and will process commands
 */
public class SQLXMLParser {


    SQLXMLParser() {

    }

    /* This function gets an SQLCommand from the loaded string. */
    public SQLCommand GetCommandFromString(String val) {
        try {
            MySQLLexer lexer;
            MySQLParser parser;
            CommonTokenStream tokens;
            MySQLParser.StatContext statementContext;
            MySQLListener listener;
            ParseTreeWalker walker;

            lexer = new MySQLLexer(new ANTLRInputStream(val));

            tokens = new CommonTokenStream(lexer);

            parser = new MySQLParser(tokens);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(new ParseErrorListener());
            parser.addErrorListener(new ParseErrorListener());

            statementContext = parser.stat();

            ParseTreeWalker prsWalker = new ParseTreeWalker();

            listener = new MySQLListener();

            prsWalker.walk(listener, statementContext);

            System.out.println(listener.getCmd().constructCommand());

            return listener.getCmd();
        }
        catch(Exception e) { // Catch all generic exceptions; for now.
            System.out.println("Syntax Error: " + e.getMessage());
            return null;
        }
    }

    class ParseErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new ParseException(msg, e, line);
        }
    }

    class ParseException extends RuntimeException {
        int line;
        public ParseException(String message, Throwable cause, int line) {
            super(message, cause);
            this.line = line;
        }
    }

    class MySQLListener extends MySQLParserBaseListener {
        private SQLCommand cmd;
        private SQLColumn ActiveColumn;
        private XMLBlock ActiveXMLBlock;
        private StringBuilder ClauseBuilder;
        private boolean InSubquery;

        private Stack<XMLBlock> XMLStack = new Stack<>();

        public String GetFullText(ParserRuleContext ctx) {
            if(ctx.getStart() == null || ctx.getStop() == null || ctx.getStart().getStartIndex() < 0 || ctx.getStop().getStopIndex() < 0) {
                return ctx.getText();
            }

            return ctx.getStart().getInputStream().getText(Interval.of(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex()));
        }

        @Override
        public void exitTable_references(MySQLParser.Table_referencesContext ctx) {
            cmd.setFromString(GetFullText(ctx));
            ClauseBuilder = null;
        }

        @Override
        public void exitWhere_clause(MySQLParser.Where_clauseContext ctx) {
            String where_string = GetFullText(ctx);
            cmd.setWhereString(where_string);
        }

        @Override
        public void exitColumn_list_clause(MySQLParser.Column_list_clauseContext ctx) {
            cmd.setLock();
        }

        @Override
        public void enterColumn_value(MySQLParser.Column_valueContext ctx) {
            String ColName = ctx.getText();

            ActiveColumn.setColumnName(ColName);
        }

        @Override
        public void enterColumn_name(MySQLParser.Column_nameContext ctx) {
            ActiveColumn = new SQLColumn();
        }

        @Override
        public void exitColumn_name(MySQLParser.Column_nameContext ctx) {
            if(!cmd.getLock()) {
                cmd.getColumns().add(ActiveColumn);
            }
            ActiveColumn = null;

        }

        @Override
        public void enterColumn_name_alias(MySQLParser.Column_name_aliasContext ctx) {
            String AliasName = ctx.getText();
            ActiveColumn.setAliasName(AliasName);
        }



        @Override
        public void enterXml_block(MySQLParser.Xml_blockContext ctx) {

            if(ActiveXMLBlock != null) {
                // Because he wants us to be able to nest these things for no reason other then adding needless complexity, we need to store them.
                XMLStack.push(ActiveXMLBlock);
                ActiveXMLBlock = new XMLBlock();
            }
            else {
                ActiveXMLBlock = new XMLBlock();
            }
        }

        @Override
        public void exitXml_block(MySQLParser.Xml_blockContext ctx) {
            if(!XMLStack.isEmpty()) {
                ActiveXMLBlock.getColumns().removeAll(Collections.singleton(null));
                XMLBlock previous = XMLStack.pop();
                previous.getColumns().add(ActiveXMLBlock);
                ActiveXMLBlock = previous;
            }
            else {
                ActiveXMLBlock.getColumns().removeAll(Collections.singleton(null));
                if(!cmd.getLock()) {
                    cmd.getColumns().add(ActiveXMLBlock);
                }
                ActiveXMLBlock = null;
            }
        }

        @Override
        public void enterXml_column_name(MySQLParser.Xml_column_nameContext ctx) {
            ActiveColumn = new SQLColumn();
        }

        @Override
        public void enterXml_compress(MySQLParser.Xml_compressContext ctx) {
            ActiveXMLBlock.setCompress(true);
        }

        @Override
        public void enterCol_compress(MySQLParser.Col_compressContext ctx) {
            ActiveColumn.setCompress(true);
        }


        @Override
        public void enterXml_tag(MySQLParser.Xml_tagContext ctx) {
            String XMLTag = ctx.getText();
            ActiveXMLBlock.setBlockName(XMLTag);
        }

        @Override
        public void exitXml_column_name(MySQLParser.Xml_column_nameContext ctx) {
            ActiveXMLBlock.getColumns().add(ActiveColumn);
            ActiveColumn = null;

        }

        @Override
        public void enterXml_column_value(MySQLParser.Xml_column_valueContext ctx) {
            String ColumnName = ctx.getText();
            ActiveColumn.setColumnName(ColumnName);
        }

        @Override
        public void enterXml_column_alias(MySQLParser.Xml_column_aliasContext ctx) {
            String AliasName = ctx.getText();
            ActiveColumn.setAliasName(AliasName);
        }

        @Override
        public void enterStat(MySQLParser.StatContext ctx) {
            cmd = new SQLCommand();
            cmd.setCommandType("SELECT");
        }

        @Override
        public void enterSubquery(MySQLParser.SubqueryContext ctx) {
            this.InSubquery = true;
        }

        @Override
        public void enterVal_distinct(MySQLParser.Val_distinctContext ctx) {
            cmd.setCommandType("SELECT DISTINCT");
        }

        public SQLCommand getCmd() {
            return cmd;
        }

    }






}
