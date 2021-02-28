// Generated from io\onedev\server\u005Cutil\jobmatch\JobMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.jobmatch;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JobMatchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		All=1, OnBranch=2, Is=3, And=4, Or=5, Not=6, LParens=7, RParens=8, Quoted=9, 
		WS=10, Identifier=11;
	public static final int
		RULE_jobMatch = 0, RULE_criteria = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"jobMatch", "criteria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'all'", null, "'is'", "'and'", "'or'", "'not'", "'('", "')'", 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "All", "OnBranch", "Is", "And", "Or", "Not", "LParens", "RParens", 
			"Quoted", "WS", "Identifier"
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
	public String getGrammarFileName() { return "JobMatch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JobMatchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JobMatchContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JobMatchParser.EOF, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode All() { return getToken(JobMatchParser.All, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public JobMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterJobMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitJobMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitJobMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobMatchContext jobMatch() throws RecognitionException {
		JobMatchContext _localctx = new JobMatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jobMatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(4);
				match(WS);
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OnBranch:
			case Not:
			case LParens:
			case Quoted:
				{
				setState(10);
				criteria(0);
				}
				break;
			case All:
				{
				setState(11);
				match(All);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(14);
				match(WS);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
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

	public static class CriteriaContext extends ParserRuleContext {
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
	 
		public CriteriaContext() { }
		public void copyFrom(CriteriaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(JobMatchParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(JobMatchParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitParensCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCriteriaContext extends CriteriaContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode Or() { return getToken(JobMatchParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(JobMatchParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(JobMatchParser.Quoted, i);
		}
		public TerminalNode Is() { return getToken(JobMatchParser.Is, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCriteriaContext extends CriteriaContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode And() { return getToken(JobMatchParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode OnBranch() { return getToken(JobMatchParser.OnBranch, 0); }
		public TerminalNode Quoted() { return getToken(JobMatchParser.Quoted, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(JobMatchParser.Not, 0); }
		public TerminalNode LParens() { return getToken(JobMatchParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(JobMatchParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(JobMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JobMatchParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobMatchListener ) ((JobMatchListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobMatchVisitor ) return ((JobMatchVisitor<? extends T>)visitor).visitNotCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		return criteria(0);
	}

	private CriteriaContext criteria(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CriteriaContext _localctx = new CriteriaContext(_ctx, _parentState);
		CriteriaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_criteria, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OnBranch:
				{
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				((OperatorValueCriteriaContext)_localctx).operator = match(OnBranch);
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					match(WS);
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(29);
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case Quoted:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(WS);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(36);
				((FieldOperatorValueCriteriaContext)_localctx).operator = match(Is);
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(37);
					match(WS);
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(42);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case Not:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(Not);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(44);
					match(WS);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(LParens);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(51);
					match(WS);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				criteria(0);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(58);
					match(WS);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(RParens);
				}
				break;
			case LParens:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(LParens);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(67);
					match(WS);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				criteria(0);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(74);
					match(WS);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(RParens);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(85);
							match(WS);
							}
							}
							setState(88); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(90);
						match(And);
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(91);
							match(WS);
							}
							}
							setState(94); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(96);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(98);
							match(WS);
							}
							}
							setState(101); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(103);
						match(Or);
						setState(105); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(104);
							match(WS);
							}
							}
							setState(107); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(109);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return criteria_sempred((CriteriaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean criteria_sempred(CriteriaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rv\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\5\2\17\n\2\3\2\7\2\22\n\2\f"+
		"\2\16\2\25\13\2\3\2\3\2\3\3\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\3"+
		"\6\3#\n\3\r\3\16\3$\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\3\3\7\3\60\n\3"+
		"\f\3\16\3\63\13\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\7\3>\n\3\f"+
		"\3\16\3A\13\3\3\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\7\3N\n\3"+
		"\f\3\16\3Q\13\3\3\3\3\3\5\3U\n\3\3\3\3\3\6\3Y\n\3\r\3\16\3Z\3\3\3\3\6"+
		"\3_\n\3\r\3\16\3`\3\3\3\3\3\3\6\3f\n\3\r\3\16\3g\3\3\3\3\6\3l\n\3\r\3"+
		"\16\3m\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\2\3\4\4\2\4\2\2\2\u0087\2\t\3\2"+
		"\2\2\4T\3\2\2\2\6\b\7\f\2\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3"+
		"\2\2\2\n\16\3\2\2\2\13\t\3\2\2\2\f\17\5\4\3\2\r\17\7\3\2\2\16\f\3\2\2"+
		"\2\16\r\3\2\2\2\17\23\3\2\2\2\20\22\7\f\2\2\21\20\3\2\2\2\22\25\3\2\2"+
		"\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2"+
		"\3\27\3\3\2\2\2\30\31\b\3\1\2\31\33\7\4\2\2\32\34\7\f\2\2\33\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37U\7\13\2"+
		"\2 \"\7\13\2\2!#\7\f\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3"+
		"\2\2\2&(\7\5\2\2\')\7\f\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+"+
		",\3\2\2\2,U\7\13\2\2-\61\7\b\2\2.\60\7\f\2\2/.\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\7\t\2\2\65\67"+
		"\7\f\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3"+
		"\2\2\2;?\5\4\3\2<>\7\f\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3"+
		"\2\2\2A?\3\2\2\2BC\7\n\2\2CU\3\2\2\2DH\7\t\2\2EG\7\f\2\2FE\3\2\2\2GJ\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KO\5\4\3\2LN\7\f\2\2ML\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\n\2\2SU\3"+
		"\2\2\2T\30\3\2\2\2T \3\2\2\2T-\3\2\2\2TD\3\2\2\2Ur\3\2\2\2VX\f\6\2\2W"+
		"Y\7\f\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\6\2"+
		"\2]_\7\f\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bq\5\4\3"+
		"\7ce\f\5\2\2df\7\f\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2"+
		"\2ik\7\7\2\2jl\7\f\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2oq\5\4\3\6pV\3\2\2\2pc\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\5\3\2"+
		"\2\2tr\3\2\2\2\24\t\16\23\35$*\618?HOTZ`gmpr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}