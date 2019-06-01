// Generated from Sauro.g by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SauroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, WHILE=2, OP_CUR=3, CL_CUR=4, EQ=5, NE=6, GT=7, GE=8, LT=9, LE=10, 
		PLUS=11, MINUS=12, TIMES=13, OVER=14, REMAINDER=15, OP_PAR=16, CL_PAR=17, 
		ATTRIB=18, COMMA=19, COLON=20, PRINT=21, READ_INT=22, READ_STR=23, APPEND=24, 
		LIST=25, OP_BRA=26, CL_BRA=27, DOT=28, LEN=29, STR=30, DEF=31, NUMBER=32, 
		VAR=33, STRING=34, COMMENT=35, NL=36, SPACE=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", "LE", 
			"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", "ATTRIB", 
			"COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "APPEND", "LIST", 
			"OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "DEF", "NUMBER", "VAR", "STRING", 
			"COMMENT", "NL", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "':'", "'print'", "'read_int'", "'read_str'", "'append'", "'list'", 
			"'['", "']'", "'.'", "'len'", "'str'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "WHILE", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", "LT", 
			"LE", "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OP_PAR", "CL_PAR", 
			"ATTRIB", "COMMA", "COLON", "PRINT", "READ_INT", "READ_STR", "APPEND", 
			"LIST", "OP_BRA", "CL_BRA", "DOT", "LEN", "STR", "DEF", "NUMBER", "VAR", 
			"STRING", "COMMENT", "NL", "SPACE"
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


	    private DenterHelper denter = new DenterHelper(NL, SauroParser.INDENT,
	                                                   SauroParser.DEDENT) {
	        @Override
	        public Token pullToken() {
	            return SauroLexer.super.nextToken();
	        }
	    };

	    @Override
	    public Token nextToken() {
	        return denter.nextToken();
	    }


	public SauroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sauro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip();
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\6!\u00b6\n!\r!\16!\u00b7\3\"\6\"\u00bb\n\"\r"+
		"\"\16\"\u00bc\3#\3#\7#\u00c1\n#\f#\16#\u00c4\13#\3#\3#\3$\3$\7$\u00ca"+
		"\n$\f$\16$\u00cd\13$\3$\3$\3%\5%\u00d2\n%\3%\3%\7%\u00d6\n%\f%\16%\u00d9"+
		"\13%\3&\6&\u00dc\n&\r&\16&\u00dd\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\5\3"+
		"\2$$\4\2\f\f\17\17\4\2\13\13\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3"+
		"\2\2\2\5P\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2\17`\3\2"+
		"\2\2\21b\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3"+
		"\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2"+
		"\2)|\3\2\2\2+~\3\2\2\2-\u0084\3\2\2\2/\u008d\3\2\2\2\61\u0096\3\2\2\2"+
		"\63\u009d\3\2\2\2\65\u00a2\3\2\2\2\67\u00a4\3\2\2\29\u00a6\3\2\2\2;\u00a8"+
		"\3\2\2\2=\u00ac\3\2\2\2?\u00b0\3\2\2\2A\u00b5\3\2\2\2C\u00ba\3\2\2\2E"+
		"\u00be\3\2\2\2G\u00c7\3\2\2\2I\u00d1\3\2\2\2K\u00db\3\2\2\2MN\7k\2\2N"+
		"O\7h\2\2O\4\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7g\2\2U\6\3"+
		"\2\2\2VW\7}\2\2W\b\3\2\2\2XY\7\177\2\2Y\n\3\2\2\2Z[\7?\2\2[\\\7?\2\2\\"+
		"\f\3\2\2\2]^\7#\2\2^_\7?\2\2_\16\3\2\2\2`a\7@\2\2a\20\3\2\2\2bc\7@\2\2"+
		"cd\7?\2\2d\22\3\2\2\2ef\7>\2\2f\24\3\2\2\2gh\7>\2\2hi\7?\2\2i\26\3\2\2"+
		"\2jk\7-\2\2k\30\3\2\2\2lm\7/\2\2m\32\3\2\2\2no\7,\2\2o\34\3\2\2\2pq\7"+
		"\61\2\2q\36\3\2\2\2rs\7\'\2\2s \3\2\2\2tu\7*\2\2u\"\3\2\2\2vw\7+\2\2w"+
		"$\3\2\2\2xy\7?\2\2y&\3\2\2\2z{\7.\2\2{(\3\2\2\2|}\7<\2\2}*\3\2\2\2~\177"+
		"\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083,\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7f\2\2\u0088\u0089\7a\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c.\3\2\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090\u0091\7f\2\2\u0091\u0092\7a\2\2"+
		"\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\60\3\2"+
		"\2\2\u0096\u0097\7c\2\2\u0097\u0098\7r\2\2\u0098\u0099\7r\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7f\2\2\u009c\62\3\2\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5"+
		"8\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af>\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7h\2\2\u00b3@\3\2\2\2\u00b4\u00b6\4\62;\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8B\3\2\2\2\u00b9\u00bb\4c|\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bdD\3\2\2\2\u00be"+
		"\u00c2\7$\2\2\u00bf\u00c1\n\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6F\3\2\2\2\u00c7\u00cb\7%\2\2\u00c8"+
		"\u00ca\n\3\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\b$\2\2\u00cfH\3\2\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7\7\f\2\2\u00d4\u00d6"+
		"\7\"\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8J\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\t\4\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b&\3\2\u00e0L\3\2\2\2\n\2\u00b7"+
		"\u00bc\u00c2\u00cb\u00d1\u00d7\u00dd\4\3$\2\3&\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}