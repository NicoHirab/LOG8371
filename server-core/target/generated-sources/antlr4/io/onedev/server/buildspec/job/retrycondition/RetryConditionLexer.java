// Generated from io\onedev\server\buildspec\job\retrycondition\RetryCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.retrycondition;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RetryConditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Never=1, Contains=2, Is=3, IsEmpty=4, And=5, Or=6, Not=7, LParens=8, RParens=9, 
		Quoted=10, WS=11, Identifier=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Never", "Contains", "Is", "IsEmpty", "And", "Or", "Not", "LParens", 
			"RParens", "Quoted", "WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'never'", "'contains'", "'is'", null, "'and'", "'or'", "'not'", 
			"'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Never", "Contains", "Is", "IsEmpty", "And", "Or", "Not", "LParens", 
			"RParens", "Quoted", "WS", "Identifier"
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


	public RetryConditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RetryCondition.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\62\n\5\r\5\16\5\63\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\6\13O\n\13\r\13\16\13P\3\13\3\13\3\f\3\f\3"+
		"\r\6\rX\n\r\r\r\16\rY\3P\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\3\2\4\4\2$$^^\t\2--//\61=C\\^^aac|\2^\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33"+
		"\3\2\2\2\5!\3\2\2\2\7*\3\2\2\2\t-\3\2\2\2\13;\3\2\2\2\r?\3\2\2\2\17B\3"+
		"\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27T\3\2\2\2\31W\3\2\2\2\33"+
		"\34\7p\2\2\34\35\7g\2\2\35\36\7x\2\2\36\37\7g\2\2\37 \7t\2\2 \4\3\2\2"+
		"\2!\"\7e\2\2\"#\7q\2\2#$\7p\2\2$%\7v\2\2%&\7c\2\2&\'\7k\2\2\'(\7p\2\2"+
		"()\7u\2\2)\6\3\2\2\2*+\7k\2\2+,\7u\2\2,\b\3\2\2\2-.\7k\2\2./\7u\2\2/\61"+
		"\3\2\2\2\60\62\5\27\f\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\7g\2\2\66\67\7o\2\2\678\7r\2\289\7v\2\29"+
		":\7{\2\2:\n\3\2\2\2;<\7c\2\2<=\7p\2\2=>\7f\2\2>\f\3\2\2\2?@\7q\2\2@A\7"+
		"t\2\2A\16\3\2\2\2BC\7p\2\2CD\7q\2\2DE\7v\2\2E\20\3\2\2\2FG\7*\2\2G\22"+
		"\3\2\2\2HI\7+\2\2I\24\3\2\2\2JN\7$\2\2KL\7^\2\2LO\13\2\2\2MO\n\2\2\2N"+
		"K\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QR\3\2\2\2RS\7$\2\2S"+
		"\26\3\2\2\2TU\7\"\2\2U\30\3\2\2\2VX\t\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\32\3\2\2\2\7\2\63NPY\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}