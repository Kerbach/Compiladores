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
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OP_PAR=6, CL_PAR=7, ATTRIB=8, 
		PRINT=9, NUMBER=10, VAR=11, SPACE=12;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_statement = 2, RULE_st_print = 3, 
		RULE_st_attrib = 4, RULE_expression = 5, RULE_term = 6, RULE_factor = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "statement", "st_print", "st_attrib", "expression", 
			"term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "PRINT", "NUMBER", "VAR", "SPACE"
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


	    private static int stack_cur, stack_max;

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

	    public static void main(String[] args) throws Exception
	    {
	        CharStream input = CharStreams.fromStream(System.in);
	        SauroLexer lexer = new SauroLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        SauroParser parser = new SauroParser(tokens);

	        // Tabela de Símbolos
	        symbol_table = new ArrayList<String>();
	        symbol_table.add("args");
	        parser.program();
	        System.out.println("; symbols: " + symbol_table);
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
			        
			setState(17);
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
			        
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT || _la==VAR );

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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				st_print();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				st_attrib();
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

	public static class St_printContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SauroParser.PRINT, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			emit("\n        getstatic java/lang/System/out Ljava/io/PrintStream;", + 1);
			setState(32);
			match(PRINT);
			setState(33);
			match(OP_PAR);
			setState(34);
			expression();
			setState(35);
			match(CL_PAR);
			emit("\n        invokevirtual java/io/PrintStream/println(I)V\n", - 2);
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
		enterRule(_localctx, 8, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((St_attribContext)_localctx).VAR = match(VAR);
			setState(39);
			match(ATTRIB);
			setState(40);
			expression();

			            if (!symbol_table.contains((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null)))
			            {
			                symbol_table.add((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            }
			            int address = symbol_table.indexOf((((St_attribContext)_localctx).VAR!=null?((St_attribContext)_localctx).VAR.getText():null));
			            
			            emit("    istore " + address + "\n", - 1);
			        
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
		public Token op;
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
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			term();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(44);
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
				setState(45);
				term();
				emit(((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getType():0) == PLUS) ? "iadd" : "    isub", - 1);
				}
				}
				setState(52);
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

	public static class TermContext extends ParserRuleContext {
		public Token op;
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			factor();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(54);
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
				setState(55);
				factor();
				 
				                if      ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES) {emit("    imul", - 1);}    
				                else if ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER)  {emit("    idiv", - 1);}    
				                else                        {emit("    irem", - 1);}    
				            
				}
				}
				setState(62);
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

	public static class FactorContext extends ParserRuleContext {
		public Token NUMBER;
		public Token VAR;
		public TerminalNode NUMBER() { return getToken(SauroParser.NUMBER, 0); }
		public TerminalNode OP_PAR() { return getToken(SauroParser.OP_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(SauroParser.CL_PAR, 0); }
		public TerminalNode VAR() { return getToken(SauroParser.VAR, 0); }
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
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 emit("    ldc "+ (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), + 1); 
				}
				break;
			case OP_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(OP_PAR);
				setState(66);
				expression();
				setState(67);
				match(CL_PAR);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				((FactorContext)_localctx).VAR = match(VAR);

				            if(!symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)))
				            { 
				                System.err.println("Variable " + (((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null) + " not declared.\n"); 
				                System.exit(1);
				            }
				            if(symbol_table.contains((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)))
				            {
				                emit("    iload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
				            }
				            else
				            {
				                emit("    aload " + symbol_table.indexOf((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null)), + 1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\6\3\30\n\3\r\3\16\3\31\3\3\3\3\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\63\n\7\f\7\16\7\66"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tJ\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\3\4\3\2\5\7"+
		"\2I\2\22\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n(\3\2\2\2\f-\3"+
		"\2\2\2\16\67\3\2\2\2\20I\3\2\2\2\22\23\b\2\1\2\23\24\5\4\3\2\24\3\3\2"+
		"\2\2\25\27\b\3\1\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\b\3\1\2\34\5\3\2\2\2\35 \5\b\5"+
		"\2\36 \5\n\6\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\b\5\1\2\"#\7"+
		"\13\2\2#$\7\b\2\2$%\5\f\7\2%&\7\t\2\2&\'\b\5\1\2\'\t\3\2\2\2()\7\r\2\2"+
		")*\7\n\2\2*+\5\f\7\2+,\b\6\1\2,\13\3\2\2\2-\64\5\16\b\2./\t\2\2\2/\60"+
		"\5\16\b\2\60\61\b\7\1\2\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\r\3\2\2\2\66\64\3\2\2\2\67>\5\20\t\289\t\3\2"+
		"\29:\5\20\t\2:;\b\b\1\2;=\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?\17\3\2\2\2@>\3\2\2\2AB\7\f\2\2BJ\b\t\1\2CD\7\b\2\2DE\5\f\7\2EF\7"+
		"\t\2\2FJ\3\2\2\2GH\7\r\2\2HJ\b\t\1\2IA\3\2\2\2IC\3\2\2\2IG\3\2\2\2J\21"+
		"\3\2\2\2\7\31\37\64>I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}