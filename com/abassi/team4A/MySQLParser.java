// Generated from C:/Users/robin.NOIGLLADO/IdeaProjects/AbassiProject/src/com/abassi/team4A\MySQLParser.g4 by ANTLR 4.5.3
package com.abassi.team4A;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, XOR=6, IS=7, AS=8, NULL=9, DISTINCT=10, 
		LIKE=11, IN=12, EXISTS=13, ALL=14, ANY=15, TRUE=16, FALSE=17, DIVIDE=18, 
		MOD=19, BETWEEN=20, REGEXP=21, STRQUOTE=22, STRDOUBLEQUOTE=23, PLUS=24, 
		MINUS=25, NEGATION=26, VERTBAR=27, BITAND=28, POWER_OP=29, BINARY=30, 
		SHIFT_LEFT=31, SHIFT_RIGHT=32, ESCAPE=33, ASTERISK=34, RPAREN=35, LPAREN=36, 
		RBRACK=37, LBRACK=38, COLON=39, ALL_FIELDS=40, EQ=41, LTH=42, GTH=43, 
		NOT_EQ=44, NOT=45, LET=46, GET=47, SEMI=48, COMMA=49, DOT=50, COLLATE=51, 
		INNER=52, OUTER=53, JOIN=54, COUNT=55, CROSS=56, USING=57, INDEX=58, KEY=59, 
		ORDER=60, GROUP=61, BY=62, FOR=63, USE=64, IGNORE=65, SUM=66, AVG=67, 
		MIN=68, MAX=69, PARTITION=70, STRAIGHT_JOIN=71, NATURAL=72, LEFT=73, RIGHT=74, 
		OJ=75, ON=76, ID=77, INT=78, NEWLINE=79, WS=80, USER_VAR=81, STRING_LITERAL=82;
	public static final int
		RULE_stat = 0, RULE_schema_name = 1, RULE_select_clause = 2, RULE_val_distinct = 3, 
		RULE_table_name = 4, RULE_table_alias = 5, RULE_col_compress = 6, RULE_xml_compress = 7, 
		RULE_column_name = 8, RULE_aggegrate = 9, RULE_column_value = 10, RULE_aggegrate_column_name = 11, 
		RULE_xml_column_value = 12, RULE_xml_column_name = 13, RULE_xml_column_alias = 14, 
		RULE_xml_block = 15, RULE_column_block = 16, RULE_xml_list_clause = 17, 
		RULE_xml_tag = 18, RULE_column_name_alias = 19, RULE_index_name = 20, 
		RULE_column_list = 21, RULE_column_list_clause = 22, RULE_from_clause = 23, 
		RULE_select_key = 24, RULE_where_clause = 25, RULE_expression = 26, RULE_element = 27, 
		RULE_element_column_name = 28, RULE_right_element = 29, RULE_left_element = 30, 
		RULE_target_element = 31, RULE_relational_op = 32, RULE_expr_op = 33, 
		RULE_between_op = 34, RULE_is_or_is_not = 35, RULE_simple_expression = 36, 
		RULE_table_references = 37, RULE_table_reference = 38, RULE_table_factor1 = 39, 
		RULE_table_factor2 = 40, RULE_table_factor3 = 41, RULE_table_factor4 = 42, 
		RULE_table_atom = 43, RULE_join_clause = 44, RULE_join_condition = 45, 
		RULE_index_hint_list = 46, RULE_index_options = 47, RULE_index_hint = 48, 
		RULE_index_list = 49, RULE_partition_clause = 50, RULE_partition_names = 51, 
		RULE_partition_name = 52, RULE_subquery_alias = 53, RULE_subquery = 54;
	public static final String[] ruleNames = {
		"stat", "schema_name", "select_clause", "val_distinct", "table_name", 
		"table_alias", "col_compress", "xml_compress", "column_name", "aggegrate", 
		"column_value", "aggegrate_column_name", "xml_column_value", "xml_column_name", 
		"xml_column_alias", "xml_block", "column_block", "xml_list_clause", "xml_tag", 
		"column_name_alias", "index_name", "column_list", "column_list_clause", 
		"from_clause", "select_key", "where_clause", "expression", "element", 
		"element_column_name", "right_element", "left_element", "target_element", 
		"relational_op", "expr_op", "between_op", "is_or_is_not", "simple_expression", 
		"table_references", "table_reference", "table_factor1", "table_factor2", 
		"table_factor3", "table_factor4", "table_atom", "join_clause", "join_condition", 
		"index_hint_list", "index_options", "index_hint", "index_list", "partition_clause", 
		"partition_names", "partition_name", "subquery_alias", "subquery"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'''", "'\"'", 
		"'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'binary'", "'<<'", "'>>'", 
		"'escape'", "'*'", "')'", "'('", "']'", "'['", "':'", "'.*'", "'='", "'<'", 
		"'>'", "'!='", "'not'", "'<='", "'>='", "';'", "','", "'.'", "'collate'", 
		"'inner'", "'outer'", "'join'", null, "'cross'", "'using'", "'index'", 
		"'key'", "'order'", "'group'", "'by'", "'for'", "'use'", "'ignore'", null, 
		null, null, null, "'partition'", "'straight_join'", "'natural'", "'left'", 
		"'right'", "'oj'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "XOR", "IS", "AS", "NULL", 
		"DISTINCT", "LIKE", "IN", "EXISTS", "ALL", "ANY", "TRUE", "FALSE", "DIVIDE", 
		"MOD", "BETWEEN", "REGEXP", "STRQUOTE", "STRDOUBLEQUOTE", "PLUS", "MINUS", 
		"NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", 
		"ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", 
		"ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", "GET", "SEMI", 
		"COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", "COUNT", "CROSS", 
		"USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", "IGNORE", 
		"SUM", "AVG", "MIN", "MAX", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", 
		"RIGHT", "OJ", "ON", "ID", "INT", "NEWLINE", "WS", "USER_VAR", "STRING_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public List<Select_clauseContext> select_clause() {
			return getRuleContexts(Select_clauseContext.class);
		}
		public Select_clauseContext select_clause(int i) {
			return getRuleContext(Select_clauseContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(MySQLParser.SEMI, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				select_clause();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			setState(116);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(115);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public Val_distinctContext val_distinct() {
			return getRuleContext(Val_distinctContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_clause(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SELECT);
			setState(122);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(121);
				val_distinct();
				}
			}

			setState(124);
			column_list_clause();
			setState(127);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(125);
				match(FROM);
				setState(126);
				table_references();
				}
			}

			setState(130);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(129);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Val_distinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public Val_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterVal_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitVal_distinct(this);
		}
	}

	public final Val_distinctContext val_distinct() throws RecognitionException {
		Val_distinctContext _localctx = new Val_distinctContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_val_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_compressContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MySQLParser.PLUS, 0); }
		public Col_compressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_compress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterCol_compress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitCol_compress(this);
		}
	}

	public final Col_compressContext col_compress() throws RecognitionException {
		Col_compressContext _localctx = new Col_compressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_col_compress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_compressContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MySQLParser.PLUS, 0); }
		public Xml_compressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_compress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_compress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_compress(this);
		}
	}

	public final Xml_compressContext xml_compress() throws RecognitionException {
		Xml_compressContext _localctx = new Xml_compressContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_xml_compress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Column_valueContext column_value() {
			return getRuleContext(Column_valueContext.class,0);
		}
		public Col_compressContext col_compress() {
			return getRuleContext(Col_compressContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public Column_name_aliasContext column_name_alias() {
			return getRuleContext(Column_name_aliasContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(142);
				col_compress();
				}
			}

			setState(145);
			column_value();
			setState(148);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(146);
				match(AS);
				setState(147);
				column_name_alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggegrateContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MySQLParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(MySQLParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(MySQLParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(MySQLParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(MySQLParser.COUNT, 0); }
		public AggegrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggegrate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterAggegrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitAggegrate(this);
		}
	}

	public final AggegrateContext aggegrate() throws RecognitionException {
		AggegrateContext _localctx = new AggegrateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aggegrate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (COUNT - 55)) | (1L << (SUM - 55)) | (1L << (AVG - 55)) | (1L << (MIN - 55)) | (1L << (MAX - 55)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public AggegrateContext aggegrate() {
			return getRuleContext(AggegrateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Aggegrate_column_nameContext aggegrate_column_name() {
			return getRuleContext(Aggegrate_column_nameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(MySQLParser.ASTERISK, 0); }
		public Column_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_value(this);
		}
	}

	public final Column_valueContext column_value() throws RecognitionException {
		Column_valueContext _localctx = new Column_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_column_value);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(152);
						schema_name();
						setState(153);
						match(DOT);
						}
						break;
					}
					setState(157);
					match(ID);
					setState(158);
					match(DOT);
					}
					break;
				}
				setState(161);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				aggegrate();
				setState(163);
				match(LPAREN);
				setState(164);
				aggegrate_column_name();
				setState(165);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(167);
						schema_name();
						setState(168);
						match(DOT);
						}
						break;
					}
					setState(172);
					match(ID);
					setState(173);
					match(DOT);
					}
				}

				setState(176);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggegrate_column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Aggegrate_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggegrate_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterAggegrate_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitAggegrate_column_name(this);
		}
	}

	public final Aggegrate_column_nameContext aggegrate_column_name() throws RecognitionException {
		Aggegrate_column_nameContext _localctx = new Aggegrate_column_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggegrate_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(179);
					schema_name();
					setState(180);
					match(DOT);
					}
					break;
				}
				setState(184);
				match(ID);
				setState(185);
				match(DOT);
				}
				break;
			}
			setState(188);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_column_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Xml_column_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_column_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_column_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_column_value(this);
		}
	}

	public final Xml_column_valueContext xml_column_value() throws RecognitionException {
		Xml_column_valueContext _localctx = new Xml_column_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_xml_column_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(190);
					schema_name();
					setState(191);
					match(DOT);
					}
					break;
				}
				setState(195);
				match(ID);
				setState(196);
				match(DOT);
				}
				break;
			}
			setState(199);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_column_nameContext extends ParserRuleContext {
		public Xml_column_valueContext xml_column_value() {
			return getRuleContext(Xml_column_valueContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public Xml_column_aliasContext xml_column_alias() {
			return getRuleContext(Xml_column_aliasContext.class,0);
		}
		public Xml_blockContext xml_block() {
			return getRuleContext(Xml_blockContext.class,0);
		}
		public Xml_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_column_name(this);
		}
	}

	public final Xml_column_nameContext xml_column_name() throws RecognitionException {
		Xml_column_nameContext _localctx = new Xml_column_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_xml_column_name);
		int _la;
		try {
			setState(207);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				xml_column_value();
				setState(204);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(202);
					match(AS);
					setState(203);
					xml_column_alias();
					}
				}

				}
				break;
			case LTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				xml_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_column_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Xml_column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_column_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_column_alias(this);
		}
	}

	public final Xml_column_aliasContext xml_column_alias() throws RecognitionException {
		Xml_column_aliasContext _localctx = new Xml_column_aliasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_xml_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_blockContext extends ParserRuleContext {
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public Xml_tagContext xml_tag() {
			return getRuleContext(Xml_tagContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Xml_list_clauseContext xml_list_clause() {
			return getRuleContext(Xml_list_clauseContext.class,0);
		}
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public Xml_compressContext xml_compress() {
			return getRuleContext(Xml_compressContext.class,0);
		}
		public Xml_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_block(this);
		}
	}

	public final Xml_blockContext xml_block() throws RecognitionException {
		Xml_blockContext _localctx = new Xml_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xml_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LTH);
			setState(213);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(212);
				xml_compress();
				}
			}

			setState(215);
			xml_tag();
			setState(216);
			match(COMMA);
			setState(217);
			xml_list_clause();
			setState(218);
			match(COMMA);
			setState(219);
			match(GTH);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(220);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_blockContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Xml_blockContext xml_block() {
			return getRuleContext(Xml_blockContext.class,0);
		}
		public Column_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_block(this);
		}
	}

	public final Column_blockContext column_block() throws RecognitionException {
		Column_blockContext _localctx = new Column_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_block);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case PLUS:
			case ASTERISK:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				column_name();
				}
				break;
			case LTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				xml_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_list_clauseContext extends ParserRuleContext {
		public List<Xml_column_nameContext> xml_column_name() {
			return getRuleContexts(Xml_column_nameContext.class);
		}
		public Xml_column_nameContext xml_column_name(int i) {
			return getRuleContext(Xml_column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Xml_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_list_clause(this);
		}
	}

	public final Xml_list_clauseContext xml_list_clause() throws RecognitionException {
		Xml_list_clauseContext _localctx = new Xml_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_xml_list_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			xml_column_name();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(COMMA);
					setState(229);
					xml_column_name();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_tagContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Xml_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterXml_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitXml_tag(this);
		}
	}

	public final Xml_tagContext xml_tag() throws RecognitionException {
		Xml_tagContext _localctx = new Xml_tagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_xml_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Column_name_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_name_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_name_alias(this);
		}
	}

	public final Column_name_aliasContext column_name_alias() throws RecognitionException {
		Column_name_aliasContext _localctx = new Column_name_aliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_column_name_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LPAREN);
			setState(242);
			column_name();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243);
				match(COMMA);
				setState(244);
				column_name();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_list_clauseContext extends ParserRuleContext {
		public List<Column_blockContext> column_block() {
			return getRuleContexts(Column_blockContext.class);
		}
		public Column_blockContext column_block(int i) {
			return getRuleContext(Column_blockContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Column_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterColumn_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitColumn_list_clause(this);
		}
	}

	public final Column_list_clauseContext column_list_clause() throws RecognitionException {
		Column_list_clauseContext _localctx = new Column_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			column_block();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				column_block();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FROM);
			setState(261);
			table_name();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				table_name();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_keyContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public Select_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSelect_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSelect_key(this);
		}
	}

	public final Select_keyContext select_key() throws RecognitionException {
		Select_keyContext _localctx = new Select_keyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(SELECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(WHERE);
			setState(272);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			simple_expression();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					expr_op();
					setState(276);
					simple_expression();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode USER_VAR() { return getToken(MySQLParser.USER_VAR, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MySQLParser.STRING_LITERAL, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public Element_column_nameContext element_column_name() {
			return getRuleContext(Element_column_nameContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_element);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(USER_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(285);
				match(STRING_LITERAL);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				element_column_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MySQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MySQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Element_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterElement_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitElement_column_name(this);
		}
	}

	public final Element_column_nameContext element_column_name() throws RecognitionException {
		Element_column_nameContext _localctx = new Element_column_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_element_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(290);
					schema_name();
					setState(291);
					match(DOT);
					}
					break;
				}
				setState(295);
				match(ID);
				setState(296);
				match(DOT);
				}
				break;
			}
			setState(299);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRight_element(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitLeft_element(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTarget_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTarget_element(this);
		}
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitExpr_op(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterBetween_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitBetween_op(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(BETWEEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIs_or_is_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIs_or_is_not(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_is_or_is_not);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(IS);
				setState(315);
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simple_expression);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				left_element();
				setState(319);
				relational_op();
				setState(320);
				right_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				target_element();
				setState(323);
				between_op();
				setState(324);
				left_element();
				setState(325);
				match(AND);
				setState(326);
				right_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				target_element();
				setState(329);
				is_or_is_not();
				setState(330);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_references(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			table_reference();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (COMMA - 49)) | (1L << (INNER - 49)) | (1L << (JOIN - 49)) | (1L << (CROSS - 49)) | (1L << (STRAIGHT_JOIN - 49)) | (1L << (NATURAL - 49)) | (1L << (LEFT - 49)) | (1L << (RIGHT - 49)))) != 0)) {
				{
				setState(338);
				switch (_input.LA(1)) {
				case COMMA:
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					table_reference();
					}
					}
					break;
				case INNER:
				case JOIN:
				case CROSS:
				case STRAIGHT_JOIN:
				case NATURAL:
				case LEFT:
				case RIGHT:
					{
					setState(337);
					join_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_reference(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_table_reference);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				table_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor1Context extends ParserRuleContext {
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor1(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			table_factor2();
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(349);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(348);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(351);
				match(JOIN);
				setState(352);
				table_atom();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(353);
					join_condition();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor2Context extends ParserRuleContext {
		public Table_factor3Context table_factor3() {
			return getRuleContext(Table_factor3Context.class,0);
		}
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLParser.STRAIGHT_JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor2(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_factor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			table_factor3();
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(359);
				match(STRAIGHT_JOIN);
				setState(360);
				table_atom();
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(361);
					match(ON);
					setState(362);
					expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_factor4Context> table_factor4() {
			return getRuleContexts(Table_factor4Context.class);
		}
		public Table_factor4Context table_factor4(int i) {
			return getRuleContext(Table_factor4Context.class,i);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor3(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			table_factor4();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(370);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(369);
					match(OUTER);
					}
				}

				setState(372);
				match(JOIN);
				setState(373);
				table_factor4();
				setState(374);
				join_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor4Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public Table_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_factor4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_factor4(this);
		}
	}

	public final Table_factor4Context table_factor4() throws RecognitionException {
		Table_factor4Context _localctx = new Table_factor4Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_table_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			table_atom();
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(379);
				match(NATURAL);
				setState(384);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(380);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(382);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(381);
						match(OUTER);
						}
					}

					}
				}

				setState(386);
				match(JOIN);
				setState(387);
				table_atom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_atomContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Index_hint_listContext index_hint_list() {
			return getRuleContext(Index_hint_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_aliasContext subquery_alias() {
			return getRuleContext(Subquery_aliasContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public TerminalNode OJ() { return getToken(MySQLParser.OJ, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterTable_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitTable_atom(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_atom);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(390);
				table_name();
				setState(392);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(391);
					partition_clause();
					}
				}

				setState(395);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(394);
					table_alias();
					}
				}

				setState(398);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(397);
					index_hint_list();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(400);
				subquery();
				setState(401);
				subquery_alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(403);
				match(LPAREN);
				setState(404);
				table_references();
				setState(405);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(407);
				match(OJ);
				setState(408);
				table_reference();
				setState(409);
				match(LEFT);
				setState(410);
				match(OUTER);
				setState(411);
				match(JOIN);
				setState(412);
				table_reference();
				setState(413);
				match(ON);
				setState(414);
				expression();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLParser.STRAIGHT_JOIN, 0); }
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Table_factor4Context table_factor4() {
			return getRuleContext(Table_factor4Context.class,0);
		}
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLParser.NATURAL, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_join_clause);
		int _la;
		try {
			setState(449);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(419);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(418);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(421);
				match(JOIN);
				setState(422);
				table_atom();
				setState(424);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(423);
					join_condition();
					}
				}

				}
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(426);
				match(STRAIGHT_JOIN);
				setState(427);
				table_atom();
				setState(430);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(428);
					match(ON);
					setState(429);
					expression();
					}
				}

				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(434);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(433);
					match(OUTER);
					}
				}

				setState(436);
				match(JOIN);
				setState(437);
				table_factor4();
				setState(438);
				join_condition();
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(440);
				match(NATURAL);
				setState(445);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(441);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(443);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(442);
						match(OUTER);
						}
					}

					}
				}

				setState(447);
				match(JOIN);
				setState(448);
				table_atom();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterJoin_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitJoin_condition(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_join_condition);
		int _la;
		try {
			setState(463);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(451);
				match(ON);
				setState(452);
				expression();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) {
					{
					{
					setState(453);
					expr_op();
					setState(454);
					expression();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(461);
				match(USING);
				setState(462);
				column_list();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint_list(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_index_hint_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			index_hint();
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(466);
					match(COMMA);
					setState(467);
					index_hint();
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(MySQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(482);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(474);
				match(FOR);
				setState(480);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(475);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(476);
					match(ORDER);
					setState(477);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(478);
					match(GROUP);
					setState(479);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(MySQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_hint(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_index_hint);
		int _la;
		try {
			setState(498);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(USE);
				setState(485);
				index_options();
				setState(486);
				match(LPAREN);
				setState(488);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(487);
					index_list();
					}
				}

				setState(490);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(IGNORE);
				setState(493);
				index_options();
				setState(494);
				match(LPAREN);
				setState(495);
				index_list();
				setState(496);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterIndex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitIndex_list(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			index_name();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				index_name();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_clause(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(PARTITION);
			setState(509);
			match(LPAREN);
			setState(510);
			partition_names();
			setState(511);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_names(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			partition_name();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(514);
				match(COMMA);
				setState(515);
				partition_name();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitPartition_name(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subquery_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public Subquery_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery_alias(this);
		}
	}

	public final Subquery_aliasContext subquery_alias() throws RecognitionException {
		Subquery_aliasContext _localctx = new Subquery_aliasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subquery_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MySQLParser.LPAREN, 0); }
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MySQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLParserListener ) ((MySQLParserListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(LPAREN);
			setState(526);
			select_clause();
			setState(527);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0214\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2r\n\2\r\2\16\2s\3\2\5\2"+
		"w\n\2\3\3\3\3\3\4\3\4\5\4}\n\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\5\4\u0085"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n\u0092\n\n\3\n\3\n"+
		"\3\n\5\n\u0097\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u009e\n\f\3\f\3\f\5\f\u00a2"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\3\f\5\f\u00b1"+
		"\n\f\3\f\5\f\u00b4\n\f\3\r\3\r\3\r\5\r\u00b9\n\r\3\r\3\r\5\r\u00bd\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\5\16\u00c4\n\16\3\16\3\16\5\16\u00c8\n\16\3\16"+
		"\3\16\3\17\3\17\3\17\5\17\u00cf\n\17\3\17\5\17\u00d2\n\17\3\20\3\20\3"+
		"\21\3\21\5\21\u00d8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e0\n\21"+
		"\3\22\3\22\5\22\u00e4\n\22\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec"+
		"\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00f8\n"+
		"\27\f\27\16\27\u00fb\13\27\3\27\3\27\3\30\3\30\3\30\7\30\u0102\n\30\f"+
		"\30\16\30\u0105\13\30\3\31\3\31\3\31\3\31\7\31\u010b\n\31\f\31\16\31\u010e"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0119\n\34\f"+
		"\34\16\34\u011c\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u0123\n\35\3\36\3"+
		"\36\3\36\5\36\u0128\n\36\3\36\3\36\5\36\u012c\n\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u013f\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u014f\n&\3\'\3\'\3\'\3\'\7\'\u0155\n\'\f"+
		"\'\16\'\u0158\13\'\3(\3(\5(\u015c\n(\3)\3)\5)\u0160\n)\3)\3)\3)\5)\u0165"+
		"\n)\5)\u0167\n)\3*\3*\3*\3*\3*\5*\u016e\n*\5*\u0170\n*\3+\3+\3+\5+\u0175"+
		"\n+\3+\3+\3+\3+\5+\u017b\n+\3,\3,\3,\3,\5,\u0181\n,\5,\u0183\n,\3,\3,"+
		"\5,\u0187\n,\3-\3-\5-\u018b\n-\3-\5-\u018e\n-\3-\5-\u0191\n-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01a3\n-\3.\5.\u01a6\n.\3."+
		"\3.\3.\5.\u01ab\n.\3.\3.\3.\3.\5.\u01b1\n.\3.\3.\5.\u01b5\n.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u01be\n.\5.\u01c0\n.\3.\3.\5.\u01c4\n.\3/\3/\3/\3/\3/"+
		"\7/\u01cb\n/\f/\16/\u01ce\13/\3/\3/\5/\u01d2\n/\3\60\3\60\3\60\7\60\u01d7"+
		"\n\60\f\60\16\60\u01da\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01e3"+
		"\n\61\5\61\u01e5\n\61\3\62\3\62\3\62\3\62\5\62\u01eb\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u01f5\n\62\3\63\3\63\3\63\7\63\u01fa"+
		"\n\63\f\63\16\63\u01fd\13\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7"+
		"\65\u0207\n\65\f\65\16\65\u020a\13\65\3\66\3\66\3\67\3\67\38\38\38\38"+
		"\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\b\4\299DG\4\2+.\60\61\4\2\6\b//\4\2\66"+
		"\66::\3\2KL\3\2<=\u0226\2q\3\2\2\2\4x\3\2\2\2\6z\3\2\2\2\b\u0086\3\2\2"+
		"\2\n\u0088\3\2\2\2\f\u008a\3\2\2\2\16\u008c\3\2\2\2\20\u008e\3\2\2\2\22"+
		"\u0091\3\2\2\2\24\u0098\3\2\2\2\26\u00b3\3\2\2\2\30\u00bc\3\2\2\2\32\u00c7"+
		"\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00d5\3\2\2\2\"\u00e3\3\2"+
		"\2\2$\u00e5\3\2\2\2&\u00ed\3\2\2\2(\u00ef\3\2\2\2*\u00f1\3\2\2\2,\u00f3"+
		"\3\2\2\2.\u00fe\3\2\2\2\60\u0106\3\2\2\2\62\u010f\3\2\2\2\64\u0111\3\2"+
		"\2\2\66\u0114\3\2\2\28\u0122\3\2\2\2:\u012b\3\2\2\2<\u012f\3\2\2\2>\u0131"+
		"\3\2\2\2@\u0133\3\2\2\2B\u0135\3\2\2\2D\u0137\3\2\2\2F\u0139\3\2\2\2H"+
		"\u013e\3\2\2\2J\u014e\3\2\2\2L\u0150\3\2\2\2N\u015b\3\2\2\2P\u015d\3\2"+
		"\2\2R\u0168\3\2\2\2T\u0171\3\2\2\2V\u017c\3\2\2\2X\u01a2\3\2\2\2Z\u01c3"+
		"\3\2\2\2\\\u01d1\3\2\2\2^\u01d3\3\2\2\2`\u01db\3\2\2\2b\u01f4\3\2\2\2"+
		"d\u01f6\3\2\2\2f\u01fe\3\2\2\2h\u0203\3\2\2\2j\u020b\3\2\2\2l\u020d\3"+
		"\2\2\2n\u020f\3\2\2\2pr\5\6\4\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2tv\3\2\2\2uw\7\62\2\2vu\3\2\2\2vw\3\2\2\2w\3\3\2\2\2xy\7O\2\2y\5\3\2"+
		"\2\2z|\7\3\2\2{}\5\b\5\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0081\5.\30\2"+
		"\177\u0080\7\4\2\2\u0080\u0082\5L\'\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5\64\33\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\f\2\2\u0087\t\3\2\2\2\u0088"+
		"\u0089\7O\2\2\u0089\13\3\2\2\2\u008a\u008b\7O\2\2\u008b\r\3\2\2\2\u008c"+
		"\u008d\7\32\2\2\u008d\17\3\2\2\2\u008e\u008f\7\32\2\2\u008f\21\3\2\2\2"+
		"\u0090\u0092\5\16\b\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0096\5\26\f\2\u0094\u0095\7\n\2\2\u0095\u0097\5(\25\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099"+
		"\t\2\2\2\u0099\25\3\2\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7\64\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\7O\2\2\u00a0\u00a2\7\64\2\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00b4\7O\2\2\u00a4\u00a5\5\24"+
		"\13\2\u00a5\u00a6\7&\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7%\2\2\u00a8"+
		"\u00b4\3\2\2\2\u00a9\u00aa\5\4\3\2\u00aa\u00ab\7\64\2\2\u00ab\u00ad\3"+
		"\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7O\2\2\u00af\u00b1\7\64\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7$\2\2\u00b3\u00a1\3\2\2\2\u00b3"+
		"\u00a4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\5\4\3"+
		"\2\u00b6\u00b7\7\64\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7O\2\2\u00bb\u00bd\7\64"+
		"\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7O\2\2\u00bf\31\3\2\2\2\u00c0\u00c1\5\4\3\2\u00c1\u00c2\7\64\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c8\7\64\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7O\2\2\u00ca\33\3\2\2\2"+
		"\u00cb\u00ce\5\32\16\2\u00cc\u00cd\7\n\2\2\u00cd\u00cf\5\36\20\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5 "+
		"\21\2\u00d1\u00cb\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d4"+
		"\7O\2\2\u00d4\37\3\2\2\2\u00d5\u00d7\7,\2\2\u00d6\u00d8\5\20\t\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5&"+
		"\24\2\u00da\u00db\7\63\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\63\2\2\u00dd"+
		"\u00df\7-\2\2\u00de\u00e0\7\63\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0!\3\2\2\2\u00e1\u00e4\5\22\n\2\u00e2\u00e4\5 \21\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00ea\5\34\17\2\u00e6"+
		"\u00e7\7\63\2\2\u00e7\u00e9\5\34\17\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb%\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7O\2\2\u00ee\'\3\2\2\2\u00ef\u00f0\7O\2\2\u00f0"+
		")\3\2\2\2\u00f1\u00f2\7O\2\2\u00f2+\3\2\2\2\u00f3\u00f4\7&\2\2\u00f4\u00f9"+
		"\5\22\n\2\u00f5\u00f6\7\63\2\2\u00f6\u00f8\5\22\n\2\u00f7\u00f5\3\2\2"+
		"\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7%\2\2\u00fd-\3\2\2\2\u00fe\u0103"+
		"\5\"\22\2\u00ff\u0100\7\63\2\2\u0100\u0102\5\"\22\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104/"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\4\2\2\u0107\u010c\5\n\6\2\u0108"+
		"\u0109\7\63\2\2\u0109\u010b\5\n\6\2\u010a\u0108\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\61\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7\3\2\2\u0110\63\3\2\2\2\u0111\u0112\7\5\2"+
		"\2\u0112\u0113\5\66\34\2\u0113\65\3\2\2\2\u0114\u011a\5J&\2\u0115\u0116"+
		"\5D#\2\u0116\u0117\5J&\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\67\3\2\2"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0123\7S\2\2\u011e\u0123\7O\2\2\u011f\u0123"+
		"\7T\2\2\u0120\u0123\7P\2\2\u0121\u0123\5:\36\2\u0122\u011d\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u01239\3\2\2\2\u0124\u0125\5\4\3\2\u0125\u0126\7\64\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\7O\2\2\u012a\u012c\7\64\2\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7O\2\2\u012e;\3\2\2\2\u012f\u0130"+
		"\58\35\2\u0130=\3\2\2\2\u0131\u0132\58\35\2\u0132?\3\2\2\2\u0133\u0134"+
		"\58\35\2\u0134A\3\2\2\2\u0135\u0136\t\3\2\2\u0136C\3\2\2\2\u0137\u0138"+
		"\t\4\2\2\u0138E\3\2\2\2\u0139\u013a\7\26\2\2\u013aG\3\2\2\2\u013b\u013f"+
		"\7\t\2\2\u013c\u013d\7\t\2\2\u013d\u013f\7/\2\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013fI\3\2\2\2\u0140\u0141\5> \2\u0141\u0142\5B\"\2\u0142"+
		"\u0143\5<\37\2\u0143\u014f\3\2\2\2\u0144\u0145\5@!\2\u0145\u0146\5F$\2"+
		"\u0146\u0147\5> \2\u0147\u0148\7\6\2\2\u0148\u0149\5<\37\2\u0149\u014f"+
		"\3\2\2\2\u014a\u014b\5@!\2\u014b\u014c\5H%\2\u014c\u014d\7\13\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0140\3\2\2\2\u014e\u0144\3\2\2\2\u014e\u014a\3\2"+
		"\2\2\u014fK\3\2\2\2\u0150\u0156\5N(\2\u0151\u0152\7\63\2\2\u0152\u0155"+
		"\5N(\2\u0153\u0155\5Z.\2\u0154\u0151\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157M\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015c\5P)\2\u015a\u015c\5X-\2\u015b\u0159\3"+
		"\2\2\2\u015b\u015a\3\2\2\2\u015cO\3\2\2\2\u015d\u0166\5R*\2\u015e\u0160"+
		"\t\5\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\78\2\2\u0162\u0164\5X-\2\u0163\u0165\5\\/\2\u0164\u0163\3\2\2\2"+
		"\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167Q\3\2\2\2\u0168\u016f\5T+\2\u0169\u016a\7I\2\2\u016a\u016d"+
		"\5X-\2\u016b\u016c\7N\2\2\u016c\u016e\5\66\34\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170S\3\2\2\2\u0171\u017a\5V,\2\u0172\u0174\t\6\2\2\u0173\u0175"+
		"\7\67\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0177\78\2\2\u0177\u0178\5V,\2\u0178\u0179\5\\/\2\u0179\u017b\3"+
		"\2\2\2\u017a\u0172\3\2\2\2\u017a\u017b\3\2\2\2\u017bU\3\2\2\2\u017c\u0186"+
		"\5X-\2\u017d\u0182\7J\2\2\u017e\u0180\t\6\2\2\u017f\u0181\7\67\2\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u017e\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\78\2\2\u0185"+
		"\u0187\5X-\2\u0186\u017d\3\2\2\2\u0186\u0187\3\2\2\2\u0187W\3\2\2\2\u0188"+
		"\u018a\5\n\6\2\u0189\u018b\5f\64\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5\f\7\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0191\5^\60\2\u0190\u018f\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u01a3\3\2\2\2\u0192\u0193\5n8\2\u0193\u0194"+
		"\5l\67\2\u0194\u01a3\3\2\2\2\u0195\u0196\7&\2\2\u0196\u0197\5L\'\2\u0197"+
		"\u0198\7%\2\2\u0198\u01a3\3\2\2\2\u0199\u019a\7M\2\2\u019a\u019b\5N(\2"+
		"\u019b\u019c\7K\2\2\u019c\u019d\7\67\2\2\u019d\u019e\78\2\2\u019e\u019f"+
		"\5N(\2\u019f\u01a0\7N\2\2\u01a0\u01a1\5\66\34\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u0188\3\2\2\2\u01a2\u0192\3\2\2\2\u01a2\u0195\3\2\2\2\u01a2\u0199\3\2"+
		"\2\2\u01a3Y\3\2\2\2\u01a4\u01a6\t\5\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\78\2\2\u01a8\u01aa\5X-\2\u01a9"+
		"\u01ab\5\\/\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01c4\3\2"+
		"\2\2\u01ac\u01ad\7I\2\2\u01ad\u01b0\5X-\2\u01ae\u01af\7N\2\2\u01af\u01b1"+
		"\5\66\34\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01c4\3\2\2\2"+
		"\u01b2\u01b4\t\6\2\2\u01b3\u01b5\7\67\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\78\2\2\u01b7\u01b8\5V,\2\u01b8"+
		"\u01b9\5\\/\2\u01b9\u01c4\3\2\2\2\u01ba\u01bf\7J\2\2\u01bb\u01bd\t\6\2"+
		"\2\u01bc\u01be\7\67\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c2\78\2\2\u01c2\u01c4\5X-\2\u01c3\u01a5\3\2\2\2\u01c3\u01ac"+
		"\3\2\2\2\u01c3\u01b2\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c4[\3\2\2\2\u01c5"+
		"\u01c6\7N\2\2\u01c6\u01cc\5\66\34\2\u01c7\u01c8\5D#\2\u01c8\u01c9\5\66"+
		"\34\2\u01c9\u01cb\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d2\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d0\7;\2\2\u01d0\u01d2\5,\27\2\u01d1\u01c5\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2]\3\2\2\2\u01d3\u01d8\5b\62\2\u01d4\u01d5\7\63\2\2"+
		"\u01d5\u01d7\5b\62\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9_\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01e4\t\7\2\2\u01dc\u01e2\7A\2\2\u01dd\u01e3\78\2\2\u01de\u01df\7>\2"+
		"\2\u01df\u01e3\7@\2\2\u01e0\u01e1\7?\2\2\u01e1\u01e3\7@\2\2\u01e2\u01dd"+
		"\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01dc\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5a\3\2\2\2\u01e6\u01e7\7B\2\2\u01e7"+
		"\u01e8\5`\61\2\u01e8\u01ea\7&\2\2\u01e9\u01eb\5d\63\2\u01ea\u01e9\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7%\2\2\u01ed"+
		"\u01f5\3\2\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\5`\61\2\u01f0\u01f1\7&\2"+
		"\2\u01f1\u01f2\5d\63\2\u01f2\u01f3\7%\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01e6"+
		"\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f5c\3\2\2\2\u01f6\u01fb\5*\26\2\u01f7"+
		"\u01f8\7\63\2\2\u01f8\u01fa\5*\26\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3"+
		"\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fce\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u01ff\7H\2\2\u01ff\u0200\7&\2\2\u0200\u0201\5h\65\2\u0201"+
		"\u0202\7%\2\2\u0202g\3\2\2\2\u0203\u0208\5j\66\2\u0204\u0205\7\63\2\2"+
		"\u0205\u0207\5j\66\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209i\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\7O\2\2\u020ck\3\2\2\2\u020d\u020e\7O\2\2\u020em\3\2\2\2\u020f\u0210"+
		"\7&\2\2\u0210\u0211\5\6\4\2\u0211\u0212\7%\2\2\u0212o\3\2\2\2Bsv|\u0081"+
		"\u0084\u0091\u0096\u009d\u00a1\u00ac\u00b0\u00b3\u00b8\u00bc\u00c3\u00c7"+
		"\u00ce\u00d1\u00d7\u00df\u00e3\u00ea\u00f9\u0103\u010c\u011a\u0122\u0127"+
		"\u012b\u013e\u014e\u0154\u0156\u015b\u015f\u0164\u0166\u016d\u016f\u0174"+
		"\u017a\u0180\u0182\u0186\u018a\u018d\u0190\u01a2\u01a5\u01aa\u01b0\u01b4"+
		"\u01bd\u01bf\u01c3\u01cc\u01d1\u01d8\u01e2\u01e4\u01ea\u01f4\u01fb\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}