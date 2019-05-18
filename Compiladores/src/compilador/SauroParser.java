// Generated from Sauro.g by ANTLR 4.7.2

    //import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, OP_CUR=3, CL_CUR=4, EQ=5, NE=6, GT=7, GE=8, LT=9, LE=10, 
		PLUS=11, MINUS=12, TIMES=13, OVER=14, REMAINDER=15, OP_PAR=16, CL_PAR=17, 
		ATTRIB=18, COMMA=19, COLON=20, PRINT=21, READ_INT=22, READ_STR=23, APPEND=24, 
		LIST=25, OP_BRA=26, CL_BRA=27, DOT=28, LEN=29, STR=30, NUMBER=31, VAR=32, 
		STRING=33, COMMENT=34, NL=35, SPACE=36, INDENT=37, DEDENT=38;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_print = 3, 
		RULE_st_new_list = 4, RULE_st_list_append = 5, RULE_st_list_attrib = 6, 
		RULE_st_attrib = 7, RULE_st_if = 8, RULE_st_while = 9, RULE_expression = 10, 
		RULE_term = 11, RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_print", "st_new_list", "st_list_append", 
			"st_list_attrib", "st_attrib", "st_if", "st_while", "expression", "term", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "':'", "'print'", "'read_int'", "'read_str'", "'append'", "'list'", 
			"'['", "']'", "'.'", "'len'", "'str'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", 
			"LE", "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "APPEND", 
			"LIST", "OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "NUMBER", "VAR", "STRING", 
			"COMMENT", "NL", "SPACE", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Sauro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private static int stack_cur, stack_max, if_counter;
	    private static int if_count = 0;
	    private static int while_count = 0;
	    private static boolean has_error = false;

	    public static void emit (String bytecode, int delta)
	    {
	        System.out.println("    " + bytecode);
	        stack_cur += delta;
	        if(stack_cur > stack_max)
	        {
	            stack_max = stack_cur;
	        }
	    }

	    private static ArrayList<String> symbol_table;
	    private static ArrayList<Character> type_table;

	    public static void main(String[] args) throws Exception
	    {
	        CharStream input = CharStreams.fromStream(System.in);
	        SauroLexer lexer = new SauroLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        SauroParser parser = new SauroParser(tokens);

	        has_error = false;

	        // Tabela de Símbolos
	        symbol_table = new ArrayList<String>();
	        type_table = new ArrayList<Character>();

	        symbol_table.add("args");
	        type_table.add('-');
	        
	        parser.program();
	        System.out.println("; symbols: " + symbol_table);

	        if(has_error == true)
			{
	            System.err.println("Existem erros que precisam ser corrigidos!");
	            System.exit(1);
			}
	    }

	public SauroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println(".source Test.j");
			            System.out.println(".class  public Test");
			            System.out.println(".super  java/lang/Object");
			            System.out.println("\n.method public <init>()V");
			            System.out.println("    aload_0");
			            System.out.println("    invokenonvirtual java/lang/Object/<init>()V");
			            System.out.println("    return");
			            System.out.println(".end method");
			        
			setState(27);
			main();
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println("\n.method public static main([Ljava/lang/String;)V");
			        
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );

			            System.out.println("        return");
			            System.out.println(".limit locals " + symbol_table.size());
			            System.out.println(".limit stack " + stack_max);
			            System.out.println(".end method");
			        
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

	public static class StatementContext extends ParserRuleContext {
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_new_listContext st_new_list() {
			return getRuleContext(St_new_listContext.class,0);
		}
		public St_list_appendContext st_list_append() {
			return getRuleContext(St_list_appendContext.class,0);
		}
		public St_list_attribContext st_list_attrib() {
			return getRuleContext(St_list_attribContext.class,0);
		}
		public TerminalNode NL() { return getToken(SauroParser.NL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				st_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				st_attrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				st_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				st_new_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				st_list_append();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				st_list_attrib();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(44);
				match(NL);
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

	public static class St_printContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode PRINT() { return getToken(SauroParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SauroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SauroParser.COMMA, i);
		}
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_print(this);
		}
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PRINT);
			setState(48);
			match(OP_PAR);
			 
			            emit("    getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
			        
			setState(50);
			((St_printContext)_localctx).e1 = expression();
			 
			            if (((St_printContext)_localctx).e1.type == 'i')
			            {
			                emit("    invokevirtual java/io/PrintStream/print(I)V", - 2); 
			            }
			            else
			            {
			                emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 1); 
			            }
			        
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);

				            emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				            emit("    ldc \" \" ", + 1); 
				            emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V", - 1); 
				            emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1); 
				        
				setState(54);
				((St_printContext)_localctx).e2 = expression();
				 
				            if (((St_printContext)_localctx).e2.type == 'i')
				            {
				                emit("    invokevirtual java/io/PrintStream/print(I)V\n", - 2); 
				            }
				            else
				            {
				                emit("    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", - 1); 
				            }
				        
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(CL_PAR);
			 
			            emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
			            emit("    invokevirtual java/io/PrintStream/println()V", - 1);
			        
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

	public static class St_new_listContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public TerminalNode LIST() { return getToken(SauroParser.LIST, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public St_new_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_new_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_new_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_new_list(this);
		}
	}

	public final St_new_listContext st_new_list() throws RecognitionException {
		St_new_listContext _localctx = new St_new_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st_new_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((St_new_listContext)_localctx).VAR = match(VAR);

			            symbol_table.add((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			            int address = symbol_table.indexOf((((St_new_listContext)_localctx).VAR!=null?((St_new_listContext)_localctx).VAR.getText():null));
			        
			setState(67);
			match(ATTRIB);
			setState(68);
			match(LIST);
			setState(69);
			match(OP_PAR);
			setState(70);
			match(CL_PAR);

			            emit("    new List", 1);
			            emit("    dup", 1);
			            emit("    invokespecial List/<init>()V", - 1);

			            emit("    astore " + address + "\n", - 1);
			        
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

	public static class St_list_appendContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode DOT() { return getToken(SauroParser.DOT, 0); }
		public TerminalNode APPEND() { return getToken(SauroParser.APPEND, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_list_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_append(this);
		}
	}

	public final St_list_appendContext st_list_append() throws RecognitionException {
		St_list_appendContext _localctx = new St_list_appendContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_list_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((St_list_appendContext)_localctx).VAR = match(VAR);

			            int address = symbol_table.indexOf((((St_list_appendContext)_localctx).VAR!=null?((St_list_appendContext)_localctx).VAR.getText():null));
			            emit("    aload " + address + "\n", - 1);
			        
			setState(75);
			match(DOT);
			setState(76);
			match(APPEND);
			setState(77);
			match(OP_PAR);
			setState(78);
			((St_list_appendContext)_localctx).e = expression();
			setState(79);
			match(CL_PAR);

			            emit("    invokevirtual List/append(I)V", - 2);
			        
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

	public static class St_list_attribContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public St_list_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_list_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_list_attrib(this);
		}
	}

	public final St_list_attribContext st_list_attrib() throws RecognitionException {
		St_list_attribContext _localctx = new St_list_attribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_list_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((St_list_attribContext)_localctx).VAR = match(VAR);

			            int address = symbol_table.indexOf((((St_list_attribContext)_localctx).VAR!=null?((St_list_attribContext)_localctx).VAR.getText():null));
			            emit("    aload " + address + "\n", - 1);
			        
			setState(84);
			match(OP_BRA);
			setState(85);
			((St_list_attribContext)_localctx).e1 = expression();
			setState(86);
			match(CL_BRA);
			setState(87);
			match(ATTRIB);
			setState(88);
			((St_list_attribContext)_localctx).e2 = expression();

			            emit("    invokevirtual List/set(II)V", - 3);
			        
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

	public static class St_attribContext extends ParserRuleContext {
		public Token VAR;
		public ExpressionContext e;
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode ATTRIB() { return getToken(SauroParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(92);
			match(ATTRIB);
			setState(93);
			((St_attribContext)_localctx).e = expression();

			            if (!symbol_table.contains((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null)))
			            {
			                symbol_table.add((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			                if(((St_attribContext)_localctx).e.type == 'i')
			                {
			                    type_table.add('i');
			                }
			                else
			                {
			                    type_table.add('a');
			                }
			            }
			            int address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            
			            if (((St_attribContext)_localctx).e.type == 'i')
			            {
			                if(type_table.get(symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null))) == 'i')
			                {
			                    emit("    istore " + address + "\n", - 1);
			                }
			                else
			                {
			                    System.err.println("A variável " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) + " está com o tipo incorreto! [Linha " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getLine():0) + "]");
			                    has_error = true;
			                }
			            }
			            else
			            {
			                if(type_table.get(symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null))) == 'a')
			                {
			                    emit("    astore " + address + "\n", - 1);
			                }
			                else
			                {
			                    System.err.println("A variável " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null) + " está com o tipo incorreto! [Linha " + (((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getLine():0) + "]");
			                    has_error=true;
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

	public static class St_ifContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode IF() { return getToken(SauroParser.IF, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SauroParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SauroParser.NE, 0); }
		public TerminalNode GT() { return getToken(SauroParser.GT, 0); }
		public TerminalNode GE() { return getToken(SauroParser.GE, 0); }
		public TerminalNode LT() { return getToken(SauroParser.LT, 0); }
		public TerminalNode LE() { return getToken(SauroParser.LE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            if_count++;
			            int if_local = if_count;
			        
			setState(97);
			match(IF);
			setState(98);
			((St_ifContext)_localctx).e1 = expression();
			setState(99);
			((St_ifContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((St_ifContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			((St_ifContext)_localctx).e2 = expression();

			            if(((St_ifContext)_localctx).e1.type == 'i' && ((St_ifContext)_localctx).e2.type == 'i')
			            {
			                if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == EQ) { emit("\nif_icmpne NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == NE) { emit("\nif_icmpeq NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == GT) { emit("\nif_icmple NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == GE) { emit("\nif_icmplt NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == LT) { emit("\nif_icmpge NOT_IF_" + if_count, -2); }
			                else if ((((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getType():0) == LE) { emit("\nif_icmpgt NOT_IF_" + if_count, -2); }
			            }
			            else
			            {
			                System.err.println("Não é possível realizar operações entre variáveis de tipos diferentes,  você utilizou " + (((St_ifContext)_localctx).e1!=null?_input.getText(((St_ifContext)_localctx).e1.start,((St_ifContext)_localctx).e1.stop):null) + " e " + (((St_ifContext)_localctx).e2!=null?_input.getText(((St_ifContext)_localctx).e2.start,((St_ifContext)_localctx).e2.stop):null) + "! [Linha " + (((St_ifContext)_localctx).op!=null?((St_ifContext)_localctx).op.getLine():0) + "]");
			                has_error = true;
			            }
			        
			setState(102);
			match(COLON);
			setState(103);
			match(INDENT);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				statement();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(109);
			match(DEDENT);
			 System.out.println("NOT_IF_" + if_local + ":"); 
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

	public static class St_whileContext extends ParserRuleContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode WHILE() { return getToken(SauroParser.WHILE, 0); }
		public TerminalNode COLON() { return getToken(SauroParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(SauroParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SauroParser.DEDENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SauroParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SauroParser.NE, 0); }
		public TerminalNode GT() { return getToken(SauroParser.GT, 0); }
		public TerminalNode GE() { return getToken(SauroParser.GE, 0); }
		public TerminalNode LT() { return getToken(SauroParser.LT, 0); }
		public TerminalNode LE() { return getToken(SauroParser.LE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            while_count++;
			            int while_local = while_count;
			            System.out.println("BEGIN_WHILE_" + while_local + ":"); 
			        
			setState(113);
			match(WHILE);
			setState(114);
			((St_whileContext)_localctx).e1 = expression();
			setState(115);
			((St_whileContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
				((St_whileContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			((St_whileContext)_localctx).e2 = expression();

						if(((St_whileContext)_localctx).e1.type == 'i' && ((St_whileContext)_localctx).e2.type == 'i')
						{
			                     if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == EQ) { emit("\nif_icmpne END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == NE) { emit("\nif_icmpeq END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == GT) { emit("\nif_icmple END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == GE) { emit("\nif_icmplt END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == LT) { emit("\nif_icmpge END_WHILE_" + while_count, -2); }
			                else if ((((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getType():0) == LE) { emit("\nif_icmpgt END_WHILE_" + while_count, -2); }		
						}
						else
						{
							System.err.println("Não é possível realizar operações entre variáveis de tipos diferentes,  você utilizou " + (((St_whileContext)_localctx).e1!=null?_input.getText(((St_whileContext)_localctx).e1.start,((St_whileContext)_localctx).e1.stop):null) + " e " + (((St_whileContext)_localctx).e2!=null?_input.getText(((St_whileContext)_localctx).e2.start,((St_whileContext)_localctx).e2.stop):null) + "! [Linha " + (((St_whileContext)_localctx).op!=null?((St_whileContext)_localctx).op.getLine():0) + "]");
							has_error = true;
						}
					
			setState(118);
			match(COLON);
			setState(119);
			match(INDENT);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VAR) | (1L << NL))) != 0) );
			setState(125);
			match(DEDENT);

			            emit("    goto BEGIN_WHILE_" + while_local, 1);
			            System.out.println("END_WHILE_" + while_local + ":");
			        
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
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SauroParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SauroParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SauroParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SauroParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((ExpressionContext)_localctx).t1 = term();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(129);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				((ExpressionContext)_localctx).t2 = term();

				            if(((ExpressionContext)_localctx).t1.type == 'i' && ((ExpressionContext)_localctx).t2.type == 'i')
				            {
				                if ((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS)
				                { 
				                    emit("iadd", - 1); 
				                }
				                else
				                {
				                    emit("isub", - 1);
				                }
				            }
				            else
				            {
				                System.err.println("Não é possível realizar operações entre variáveis de tipos diferentes,  você utilizou " + (((ExpressionContext)_localctx).t1!=null?_input.getText(((ExpressionContext)_localctx).t1.start,((ExpressionContext)_localctx).t1.stop):null) + " e " + (((ExpressionContext)_localctx).t2!=null?_input.getText(((ExpressionContext)_localctx).t2.start,((ExpressionContext)_localctx).t2.stop):null) + "! [Linha " + (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0) + "]");
				                has_error = true;
				            }
				        
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).t1.type;
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

	public static class TermContext extends ParserRuleContext {
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SauroParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SauroParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(SauroParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(SauroParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(SauroParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(SauroParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((TermContext)_localctx).f1 = factor();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(141);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				((TermContext)_localctx).f2 = factor();

				            if((((TermContext)_localctx).f1.type == 'i') && (((TermContext)_localctx).f2.type == 'i'))
				            {
				                if      ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) {emit("    imul", - 1);}    
				                else if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER)  {emit("    idiv", - 1);}    
				                else                        {emit("    irem", - 1);}    
				            }
				            else
				            {
				                System.err.println("Não é possível realizar operações entre variáveis de tipos diferentes,  você utilizou " + (((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null) + " e " + (((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null) + "! [Linha " + (((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getLine():0) + "]");
				                has_error = true;
				            } 
				        
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type;
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

	public static class FactorContext extends ParserRuleContext {
		public char type;
		public Token NUMBER;
		public ExpressionContext e;
		public Token VAR;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
		public TerminalNode OP_BRA() { return getToken(SauroParser.OP_BRA, 0); }
		public TerminalNode CL_BRA() { return getToken(SauroParser.CL_BRA, 0); }
		public TerminalNode READ_INT() { return getToken(SauroParser.READ_INT, 0); }
		public TerminalNode READ_STR() { return getToken(SauroParser.READ_STR, 0); }
		public TerminalNode STRING() { return getToken(SauroParser.STRING, 0); }
		public TerminalNode LEN() { return getToken(SauroParser.LEN, 0); }
		public TerminalNode STR() { return getToken(SauroParser.STR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SauroListener ) ((SauroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				                ((FactorContext)_localctx).type =  'i';
				                emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				            
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(OP_PAR);
				setState(155);
				((FactorContext)_localctx).e = expression();
				setState(156);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  ((FactorContext)_localctx).e.type;
				            
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((FactorContext)_localctx).VAR = match(VAR);

				                ((FactorContext)_localctx).type =  'i';
				                int address = symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null));
				                emit("    aload " + address, + 1);
				            
				setState(161);
				match(OP_BRA);
				setState(162);
				expression();

				                emit("    invokevirtual List/get(I)I", - 1);
				                emit("    invokevirtual java/io/PrintStream/println(I)V", - 1);
				            
				setState(164);
				match(CL_BRA);
				}
				break;
			case READ_INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(READ_INT);
				setState(167);
				match(OP_PAR);
				setState(168);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    invokestatic Runtime/readInt()I", +1);
				            
				}
				break;
			case READ_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(READ_STR);
				setState(171);
				match(OP_PAR);
				setState(172);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    invokestatic Runtime/readString()Ljava/lang/String;", - 1);
				            
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				((FactorContext)_localctx).STRING = match(STRING);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    ldc "+ (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), + 1); 
				            
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(LEN);
				setState(177);
				match(OP_PAR);
				setState(178);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(179);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'i';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/len()I", - 1);
				            
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(STR);
				setState(182);
				match(OP_PAR);
				setState(183);
				((FactorContext)_localctx).VAR = match(VAR);
				setState(184);
				match(CL_PAR);

				                ((FactorContext)_localctx).type =  'a';
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				                emit("    invokevirtual List/str()Ljava/lang/String;", - 1);
				            
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\6\3\"\n\3\r\3\16\3#"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\6\nl\n\n\r\n\16\nm\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\6\13|\n\13\r\13\16\13}\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0094\n\r\f\r\16\r\u0097\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00bd\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\7"+
		"\f\3\2\r\16\3\2\17\21\2\u00c5\2\34\3\2\2\2\4\37\3\2\2\2\6/\3\2\2\2\b\61"+
		"\3\2\2\2\nC\3\2\2\2\fK\3\2\2\2\16T\3\2\2\2\20]\3\2\2\2\22b\3\2\2\2\24"+
		"r\3\2\2\2\26\u0082\3\2\2\2\30\u008e\3\2\2\2\32\u00bc\3\2\2\2\34\35\b\2"+
		"\1\2\35\36\5\4\3\2\36\3\3\2\2\2\37!\b\3\1\2 \"\5\6\4\2! \3\2\2\2\"#\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\3\1\2&\5\3\2\2\2\'\60\5\b\5\2"+
		"(\60\5\20\t\2)\60\5\22\n\2*\60\5\24\13\2+\60\5\n\6\2,\60\5\f\7\2-\60\5"+
		"\16\b\2.\60\7%\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2"+
		"/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62\7\27\2\2\62\63\7\22"+
		"\2\2\63\64\b\5\1\2\64\65\5\26\f\2\65=\b\5\1\2\66\67\7\25\2\2\678\b\5\1"+
		"\289\5\26\f\29:\b\5\1\2:<\3\2\2\2;\66\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\23\2\2AB\b\5\1\2B\t\3\2\2\2CD\7\"\2\2D"+
		"E\b\6\1\2EF\7\24\2\2FG\7\33\2\2GH\7\22\2\2HI\7\23\2\2IJ\b\6\1\2J\13\3"+
		"\2\2\2KL\7\"\2\2LM\b\7\1\2MN\7\36\2\2NO\7\32\2\2OP\7\22\2\2PQ\5\26\f\2"+
		"QR\7\23\2\2RS\b\7\1\2S\r\3\2\2\2TU\7\"\2\2UV\b\b\1\2VW\7\34\2\2WX\5\26"+
		"\f\2XY\7\35\2\2YZ\7\24\2\2Z[\5\26\f\2[\\\b\b\1\2\\\17\3\2\2\2]^\7\"\2"+
		"\2^_\7\24\2\2_`\5\26\f\2`a\b\t\1\2a\21\3\2\2\2bc\b\n\1\2cd\7\3\2\2de\5"+
		"\26\f\2ef\t\2\2\2fg\5\26\f\2gh\b\n\1\2hi\7\26\2\2ik\7\'\2\2jl\5\6\4\2"+
		"kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7(\2\2pq\b\n\1\2"+
		"q\23\3\2\2\2rs\b\13\1\2st\7\4\2\2tu\5\26\f\2uv\t\2\2\2vw\5\26\f\2wx\b"+
		"\13\1\2xy\7\26\2\2y{\7\'\2\2z|\5\6\4\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}"+
		"~\3\2\2\2~\177\3\2\2\2\177\u0080\7(\2\2\u0080\u0081\b\13\1\2\u0081\25"+
		"\3\2\2\2\u0082\u0089\5\30\r\2\u0083\u0084\t\3\2\2\u0084\u0085\5\30\r\2"+
		"\u0085\u0086\b\f\1\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\b\f\1\2\u008d\27\3\2\2\2\u008e\u0095\5\32\16"+
		"\2\u008f\u0090\t\4\2\2\u0090\u0091\5\32\16\2\u0091\u0092\b\r\1\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\b\r\1\2\u0099\31\3\2\2\2\u009a\u009b\7!\2\2\u009b\u00bd\b\16\1"+
		"\2\u009c\u009d\7\22\2\2\u009d\u009e\5\26\f\2\u009e\u009f\7\23\2\2\u009f"+
		"\u00a0\b\16\1\2\u00a0\u00bd\3\2\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\b"+
		"\16\1\2\u00a3\u00a4\7\34\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\b\16\1\2"+
		"\u00a6\u00a7\7\35\2\2\u00a7\u00bd\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa"+
		"\7\22\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00bd\b\16\1\2\u00ac\u00ad\7\31\2"+
		"\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\7\23\2\2\u00af\u00bd\b\16\1\2\u00b0"+
		"\u00b1\7#\2\2\u00b1\u00bd\b\16\1\2\u00b2\u00b3\7\37\2\2\u00b3\u00b4\7"+
		"\22\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00bd\b\16\1\2"+
		"\u00b7\u00b8\7 \2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb"+
		"\7\23\2\2\u00bb\u00bd\b\16\1\2\u00bc\u009a\3\2\2\2\u00bc\u009c\3\2\2\2"+
		"\u00bc\u00a1\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00b0"+
		"\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\33\3\2\2\2\n#/"+
		"=m}\u0089\u0095\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}