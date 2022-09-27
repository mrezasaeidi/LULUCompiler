package antlr;

// Generated from /media/F/compiler/test/FinalProject/finalProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class finalProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, REAL=2, BOOLEAN=3, OF=4, ARRAY=5, START=6, END=7, DECLARE=8, 
		MODULE=9, DRIVER=10, PROGRAM=11, GET_VALUE=12, PRINT=13, USE=14, WITH=15, 
		PARAMETERS=16, TRUE=17, FALSE=18, TAKES=19, INPUT=20, RETURNS=21, AND=22, 
		OR=23, FOR=24, IN=25, SWITCH=26, CASE=27, BREAK=28, DEFAULT=29, WHILE=30, 
		PLUSE=31, MINUS=32, MUL=33, DIV=34, LT=35, LE=36, GE=37, GT=38, EQ=39, 
		NE=40, DEF=41, ENDDEF=42, COLON=43, RANGEOP=44, SEMICOL=45, COMMA=46, 
		ASSIGNOP=47, SQBO=48, SQBC=49, BO=50, BC=51, COMMENTMAR=52, WHITESPACE=53, 
		ID=54, NUM=55, RNUM=56;
	public static final int
		RULE_program = 0, RULE_moduleDeclarations = 1, RULE_moduleDeclaration = 2, 
		RULE_otherModules = 3, RULE_driverModule = 4, RULE_module = 5, RULE_ret = 6, 
		RULE_input_plist = 7, RULE_output_plist = 8, RULE_dataType = 9, RULE_type = 10, 
		RULE_moduleDef = 11, RULE_statements = 12, RULE_statement = 13, RULE_ioStmt = 14, 
		RULE_var = 15, RULE_whichId = 16, RULE_simpleStmt = 17, RULE_assignmentStmt = 18, 
		RULE_whichStmt = 19, RULE_lvalueIDStmt = 20, RULE_lvalueARRStmt = 21, 
		RULE_index = 22, RULE_moduleReuseStmt = 23, RULE_optional = 24, RULE_idList = 25, 
		RULE_expression = 26, RULE_arithmeticExpr = 27, RULE_term = 28, RULE_factor = 29, 
		RULE_op = 30, RULE_booleanExpr = 31, RULE_logicalOp = 32, RULE_relationalOp = 33, 
		RULE_declareStmt = 34, RULE_conditionalStmt = 35, RULE_caseStmt = 36, 
		RULE_value = 37, RULE_myDefault = 38, RULE_iterativeStmt = 39, RULE_range = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "moduleDeclarations", "moduleDeclaration", "otherModules", 
			"driverModule", "module", "ret", "input_plist", "output_plist", "dataType", 
			"type", "moduleDef", "statements", "statement", "ioStmt", "var", "whichId", 
			"simpleStmt", "assignmentStmt", "whichStmt", "lvalueIDStmt", "lvalueARRStmt", 
			"index", "moduleReuseStmt", "optional", "idList", "expression", "arithmeticExpr", 
			"term", "factor", "op", "booleanExpr", "logicalOp", "relationalOp", "declareStmt", 
			"conditionalStmt", "caseStmt", "value", "myDefault", "iterativeStmt", 
			"range"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'real'", "'boolean'", "'of'", "'array'", "'start'", 
			"'end'", "'declare'", "'module'", "'driver'", "'program'", "'get_value'", 
			"'print'", "'use'", "'with'", "'parameters'", "'true'", "'false'", "'takes'", 
			"'input'", "'returns'", "'and'", "'or'", "'for'", "'in'", "'switch'", 
			"'case'", "'break'", "'default'", "'while'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'<='", "'>='", "'>'", "'=='", "'!='", "'<<'", "'>>'", "':'", 
			"'..'", "';'", "','", "':='", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "REAL", "BOOLEAN", "OF", "ARRAY", "START", "END", "DECLARE", 
			"MODULE", "DRIVER", "PROGRAM", "GET_VALUE", "PRINT", "USE", "WITH", "PARAMETERS", 
			"TRUE", "FALSE", "TAKES", "INPUT", "RETURNS", "AND", "OR", "FOR", "IN", 
			"SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "PLUSE", "MINUS", "MUL", 
			"DIV", "LT", "LE", "GE", "GT", "EQ", "NE", "DEF", "ENDDEF", "COLON", 
			"RANGEOP", "SEMICOL", "COMMA", "ASSIGNOP", "SQBO", "SQBC", "BO", "BC", 
			"COMMENTMAR", "WHITESPACE", "ID", "NUM", "RNUM"
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
	public String getGrammarFileName() { return "finalProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public finalProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ModuleDeclarationsContext moduleDeclarations() {
			return getRuleContext(ModuleDeclarationsContext.class,0);
		}
		public List<OtherModulesContext> otherModules() {
			return getRuleContexts(OtherModulesContext.class);
		}
		public OtherModulesContext otherModules(int i) {
			return getRuleContext(OtherModulesContext.class,i);
		}
		public DriverModuleContext driverModule() {
			return getRuleContext(DriverModuleContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			moduleDeclarations();
			setState(83);
			otherModules();
			setState(84);
			driverModule();
			setState(85);
			otherModules();
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

	public static class ModuleDeclarationsContext extends ParserRuleContext {
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public ModuleDeclarationsContext moduleDeclarations() {
			return getRuleContext(ModuleDeclarationsContext.class,0);
		}
		public ModuleDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterModuleDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitModuleDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitModuleDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationsContext moduleDeclarations() throws RecognitionException {
		ModuleDeclarationsContext _localctx = new ModuleDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleDeclarations);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				moduleDeclaration();
				setState(88);
				moduleDeclarations();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(finalProjectParser.DECLARE, 0); }
		public TerminalNode MODULE() { return getToken(finalProjectParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(DECLARE);
			setState(94);
			match(MODULE);
			setState(95);
			match(ID);
			setState(96);
			match(SEMICOL);
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

	public static class OtherModulesContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public OtherModulesContext otherModules() {
			return getRuleContext(OtherModulesContext.class,0);
		}
		public OtherModulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherModules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterOtherModules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitOtherModules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitOtherModules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherModulesContext otherModules() throws RecognitionException {
		OtherModulesContext _localctx = new OtherModulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_otherModules);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				module();
				setState(99);
				otherModules();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DriverModuleContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(finalProjectParser.DEF, 0); }
		public TerminalNode DRIVER() { return getToken(finalProjectParser.DRIVER, 0); }
		public TerminalNode PROGRAM() { return getToken(finalProjectParser.PROGRAM, 0); }
		public TerminalNode ENDDEF() { return getToken(finalProjectParser.ENDDEF, 0); }
		public ModuleDefContext moduleDef() {
			return getRuleContext(ModuleDefContext.class,0);
		}
		public DriverModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_driverModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterDriverModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitDriverModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitDriverModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DriverModuleContext driverModule() throws RecognitionException {
		DriverModuleContext _localctx = new DriverModuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_driverModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DEF);
			setState(105);
			match(DRIVER);
			setState(106);
			match(PROGRAM);
			setState(107);
			match(ENDDEF);
			setState(108);
			moduleDef();
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(finalProjectParser.DEF, 0); }
		public TerminalNode MODULE() { return getToken(finalProjectParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode ENDDEF() { return getToken(finalProjectParser.ENDDEF, 0); }
		public TerminalNode TAKES() { return getToken(finalProjectParser.TAKES, 0); }
		public TerminalNode INPUT() { return getToken(finalProjectParser.INPUT, 0); }
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public Input_plistContext input_plist() {
			return getRuleContext(Input_plistContext.class,0);
		}
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ModuleDefContext moduleDef() {
			return getRuleContext(ModuleDefContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DEF);
			setState(111);
			match(MODULE);
			setState(112);
			match(ID);
			setState(113);
			match(ENDDEF);
			setState(114);
			match(TAKES);
			setState(115);
			match(INPUT);
			setState(116);
			match(SQBO);
			setState(117);
			input_plist(0);
			setState(118);
			match(SQBC);
			setState(119);
			match(SEMICOL);
			setState(120);
			ret();
			setState(121);
			moduleDef();
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(finalProjectParser.RETURNS, 0); }
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public Output_plistContext output_plist() {
			return getRuleContext(Output_plistContext.class,0);
		}
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ret);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(RETURNS);
				setState(124);
				match(SQBO);
				setState(125);
				output_plist(0);
				setState(126);
				match(SQBC);
				setState(127);
				match(SEMICOL);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Input_plistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode COLON() { return getToken(finalProjectParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public Input_plistContext input_plist() {
			return getRuleContext(Input_plistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(finalProjectParser.COMMA, 0); }
		public Input_plistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_plist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterInput_plist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitInput_plist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitInput_plist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_plistContext input_plist() throws RecognitionException {
		return input_plist(0);
	}

	private Input_plistContext input_plist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Input_plistContext _localctx = new Input_plistContext(_ctx, _parentState);
		Input_plistContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_input_plist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			match(ID);
			setState(134);
			match(COLON);
			setState(135);
			dataType();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Input_plistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_input_plist);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					match(COMMA);
					setState(139);
					match(ID);
					setState(140);
					match(COLON);
					setState(141);
					dataType();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Output_plistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode COLON() { return getToken(finalProjectParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Output_plistContext output_plist() {
			return getRuleContext(Output_plistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(finalProjectParser.COMMA, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public Output_plistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_plist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterOutput_plist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitOutput_plist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitOutput_plist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_plistContext output_plist() throws RecognitionException {
		return output_plist(0);
	}

	private Output_plistContext output_plist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Output_plistContext _localctx = new Output_plistContext(_ctx, _parentState);
		Output_plistContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_output_plist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			match(ID);
			setState(149);
			match(COLON);
			setState(150);
			type();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Output_plistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_output_plist);
					setState(152);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(153);
					match(COMMA);
					setState(154);
					match(ID);
					setState(155);
					match(COLON);
					setState(156);
					dataType();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(finalProjectParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(finalProjectParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(finalProjectParser.BOOLEAN, 0); }
		public TerminalNode ARRAY() { return getToken(finalProjectParser.ARRAY, 0); }
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public TerminalNode OF() { return getToken(finalProjectParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataType);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(REAL);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(BOOLEAN);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(ARRAY);
				setState(166);
				match(SQBO);
				setState(167);
				range();
				setState(168);
				match(SQBC);
				setState(169);
				match(OF);
				setState(170);
				type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(finalProjectParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(finalProjectParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(finalProjectParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ModuleDefContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(finalProjectParser.START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(finalProjectParser.END, 0); }
		public ModuleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterModuleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitModuleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitModuleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDefContext moduleDef() throws RecognitionException {
		ModuleDefContext _localctx = new ModuleDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moduleDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(START);
			setState(177);
			statements();
			setState(178);
			match(END);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case GET_VALUE:
			case PRINT:
			case USE:
			case FOR:
			case SWITCH:
			case WHILE:
			case SQBO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				statement();
				setState(181);
				statements();
				}
				break;
			case END:
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public IoStmtContext ioStmt() {
			return getRuleContext(IoStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public ConditionalStmtContext conditionalStmt() {
			return getRuleContext(ConditionalStmtContext.class,0);
		}
		public IterativeStmtContext iterativeStmt() {
			return getRuleContext(IterativeStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET_VALUE:
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				ioStmt();
				}
				break;
			case USE:
			case SQBO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				simpleStmt();
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				declareStmt();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				conditionalStmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				iterativeStmt();
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

	public static class IoStmtContext extends ParserRuleContext {
		public TerminalNode GET_VALUE() { return getToken(finalProjectParser.GET_VALUE, 0); }
		public TerminalNode BO() { return getToken(finalProjectParser.BO, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode BC() { return getToken(finalProjectParser.BC, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public TerminalNode PRINT() { return getToken(finalProjectParser.PRINT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterIoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitIoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitIoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStmtContext ioStmt() throws RecognitionException {
		IoStmtContext _localctx = new IoStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ioStmt);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(GET_VALUE);
				setState(194);
				match(BO);
				setState(195);
				match(ID);
				setState(196);
				match(BC);
				setState(197);
				match(SEMICOL);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(PRINT);
				setState(199);
				match(BO);
				setState(200);
				var();
				setState(201);
				match(BC);
				setState(202);
				match(SEMICOL);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public WhichIdContext whichId() {
			return getRuleContext(WhichIdContext.class,0);
		}
		public TerminalNode NUM() { return getToken(finalProjectParser.NUM, 0); }
		public TerminalNode RNUM() { return getToken(finalProjectParser.RNUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				setState(207);
				whichId();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(NUM);
				}
				break;
			case RNUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(RNUM);
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

	public static class WhichIdContext extends ParserRuleContext {
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public WhichIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whichId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterWhichId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitWhichId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitWhichId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhichIdContext whichId() throws RecognitionException {
		WhichIdContext _localctx = new WhichIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whichId);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(SQBO);
				setState(213);
				match(ID);
				setState(214);
				match(SQBC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SimpleStmtContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public ModuleReuseStmtContext moduleReuseStmt() {
			return getRuleContext(ModuleReuseStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleStmt);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				assignmentStmt();
				}
				break;
			case USE:
			case SQBO:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				moduleReuseStmt();
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public WhichStmtContext whichStmt() {
			return getRuleContext(WhichStmtContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			whichStmt();
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

	public static class WhichStmtContext extends ParserRuleContext {
		public LvalueIDStmtContext lvalueIDStmt() {
			return getRuleContext(LvalueIDStmtContext.class,0);
		}
		public LvalueARRStmtContext lvalueARRStmt() {
			return getRuleContext(LvalueARRStmtContext.class,0);
		}
		public WhichStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whichStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterWhichStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitWhichStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitWhichStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhichStmtContext whichStmt() throws RecognitionException {
		WhichStmtContext _localctx = new WhichStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whichStmt);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				lvalueIDStmt();
				}
				break;
			case SQBO:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				lvalueARRStmt();
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

	public static class LvalueIDStmtContext extends ParserRuleContext {
		public TerminalNode ASSIGNOP() { return getToken(finalProjectParser.ASSIGNOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public LvalueIDStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalueIDStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterLvalueIDStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitLvalueIDStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitLvalueIDStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueIDStmtContext lvalueIDStmt() throws RecognitionException {
		LvalueIDStmtContext _localctx = new LvalueIDStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lvalueIDStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ASSIGNOP);
			setState(230);
			expression();
			setState(231);
			match(SEMICOL);
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

	public static class LvalueARRStmtContext extends ParserRuleContext {
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public TerminalNode ASSIGNOP() { return getToken(finalProjectParser.ASSIGNOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public LvalueARRStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalueARRStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterLvalueARRStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitLvalueARRStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitLvalueARRStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueARRStmtContext lvalueARRStmt() throws RecognitionException {
		LvalueARRStmtContext _localctx = new LvalueARRStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lvalueARRStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(SQBO);
			setState(234);
			index();
			setState(235);
			match(SQBC);
			setState(236);
			match(ASSIGNOP);
			setState(237);
			expression();
			setState(238);
			match(SEMICOL);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(finalProjectParser.NUM, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ModuleReuseStmtContext extends ParserRuleContext {
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public TerminalNode USE() { return getToken(finalProjectParser.USE, 0); }
		public TerminalNode MODULE() { return getToken(finalProjectParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode WITH() { return getToken(finalProjectParser.WITH, 0); }
		public TerminalNode PARAMETERS() { return getToken(finalProjectParser.PARAMETERS, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public ModuleReuseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleReuseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterModuleReuseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitModuleReuseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitModuleReuseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleReuseStmtContext moduleReuseStmt() throws RecognitionException {
		ModuleReuseStmtContext _localctx = new ModuleReuseStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_moduleReuseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			optional();
			setState(243);
			match(USE);
			setState(244);
			match(MODULE);
			setState(245);
			match(ID);
			setState(246);
			match(WITH);
			setState(247);
			match(PARAMETERS);
			setState(248);
			idList(0);
			setState(249);
			match(SEMICOL);
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

	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode SQBO() { return getToken(finalProjectParser.SQBO, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode SQBC() { return getToken(finalProjectParser.SQBC, 0); }
		public TerminalNode ASSIGNOP() { return getToken(finalProjectParser.ASSIGNOP, 0); }
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_optional);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQBO:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(SQBO);
				setState(252);
				idList(0);
				setState(253);
				match(SQBC);
				setState(254);
				match(ASSIGNOP);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(finalProjectParser.COMMA, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		return idList(0);
	}

	private IdListContext idList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdListContext _localctx = new IdListContext(_ctx, _parentState);
		IdListContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_idList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_idList);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					match(COMMA);
					setState(264);
					match(ID);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				arithmeticExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				booleanExpr(0);
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

	public static class ArithmeticExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitArithmeticExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		return arithmeticExpr(0);
	}

	private ArithmeticExprContext arithmeticExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, _parentState);
		ArithmeticExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_arithmeticExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpr);
					setState(277);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(278);
					op();
					setState(279);
					term(0);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					op();
					setState(291);
					factor();
					}
					} 
				}
				setState(297);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode BO() { return getToken(finalProjectParser.BO, 0); }
		public ArithmeticExprContext arithmeticExpr() {
			return getRuleContext(ArithmeticExprContext.class,0);
		}
		public TerminalNode BC() { return getToken(finalProjectParser.BC, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BO:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(BO);
				setState(299);
				arithmeticExpr(0);
				setState(300);
				match(BC);
				}
				break;
			case ID:
			case NUM:
			case RNUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				var();
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUSE() { return getToken(finalProjectParser.PLUSE, 0); }
		public TerminalNode MINUS() { return getToken(finalProjectParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(finalProjectParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(finalProjectParser.DIV, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSE) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class BooleanExprContext extends ParserRuleContext {
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public TerminalNode BO() { return getToken(finalProjectParser.BO, 0); }
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public TerminalNode BC() { return getToken(finalProjectParser.BC, 0); }
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_booleanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(308);
				arithmeticExpr(0);
				setState(309);
				relationalOp();
				setState(310);
				arithmeticExpr(0);
				}
				break;
			case 2:
				{
				setState(312);
				match(BO);
				setState(313);
				booleanExpr(0);
				setState(314);
				match(BC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
					setState(318);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(319);
					logicalOp();
					setState(320);
					booleanExpr(4);
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(finalProjectParser.AND, 0); }
		public TerminalNode OR() { return getToken(finalProjectParser.OR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(finalProjectParser.LT, 0); }
		public TerminalNode LE() { return getToken(finalProjectParser.LE, 0); }
		public TerminalNode GT() { return getToken(finalProjectParser.GT, 0); }
		public TerminalNode GE() { return getToken(finalProjectParser.GE, 0); }
		public TerminalNode EQ() { return getToken(finalProjectParser.EQ, 0); }
		public TerminalNode NE() { return getToken(finalProjectParser.NE, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class DeclareStmtContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(finalProjectParser.DECLARE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(finalProjectParser.COLON, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitDeclareStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitDeclareStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(DECLARE);
			setState(332);
			idList(0);
			setState(333);
			match(COLON);
			setState(334);
			dataType();
			setState(335);
			match(SEMICOL);
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

	public static class ConditionalStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(finalProjectParser.SWITCH, 0); }
		public TerminalNode BO() { return getToken(finalProjectParser.BO, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode BC() { return getToken(finalProjectParser.BC, 0); }
		public TerminalNode START() { return getToken(finalProjectParser.START, 0); }
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public MyDefaultContext myDefault() {
			return getRuleContext(MyDefaultContext.class,0);
		}
		public TerminalNode END() { return getToken(finalProjectParser.END, 0); }
		public ConditionalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterConditionalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitConditionalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitConditionalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStmtContext conditionalStmt() throws RecognitionException {
		ConditionalStmtContext _localctx = new ConditionalStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(SWITCH);
			setState(338);
			match(BO);
			setState(339);
			match(ID);
			setState(340);
			match(BC);
			setState(341);
			match(START);
			setState(342);
			caseStmt();
			setState(343);
			myDefault();
			setState(344);
			match(END);
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

	public static class CaseStmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(finalProjectParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(finalProjectParser.COLON, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(finalProjectParser.BREAK, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CASE);
			setState(347);
			value();
			setState(348);
			match(COLON);
			setState(349);
			statements();
			setState(350);
			match(BREAK);
			setState(351);
			match(SEMICOL);
			setState(352);
			caseStmt();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(finalProjectParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(finalProjectParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(finalProjectParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class MyDefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(finalProjectParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(finalProjectParser.COLON, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(finalProjectParser.BREAK, 0); }
		public TerminalNode SEMICOL() { return getToken(finalProjectParser.SEMICOL, 0); }
		public MyDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterMyDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitMyDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitMyDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyDefaultContext myDefault() throws RecognitionException {
		MyDefaultContext _localctx = new MyDefaultContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_myDefault);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(DEFAULT);
				setState(357);
				match(COLON);
				setState(358);
				statements();
				setState(359);
				match(BREAK);
				setState(360);
				match(SEMICOL);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IterativeStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(finalProjectParser.FOR, 0); }
		public TerminalNode BO() { return getToken(finalProjectParser.BO, 0); }
		public TerminalNode ID() { return getToken(finalProjectParser.ID, 0); }
		public TerminalNode IN() { return getToken(finalProjectParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode BC() { return getToken(finalProjectParser.BC, 0); }
		public TerminalNode START() { return getToken(finalProjectParser.START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(finalProjectParser.END, 0); }
		public TerminalNode WHILE() { return getToken(finalProjectParser.WHILE, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public IterativeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterIterativeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitIterativeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitIterativeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeStmtContext iterativeStmt() throws RecognitionException {
		IterativeStmtContext _localctx = new IterativeStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iterativeStmt);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(FOR);
				setState(366);
				match(BO);
				setState(367);
				match(ID);
				setState(368);
				match(IN);
				setState(369);
				range();
				setState(370);
				match(BC);
				setState(371);
				match(START);
				setState(372);
				statements();
				setState(373);
				match(END);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(WHILE);
				setState(376);
				match(BO);
				setState(377);
				booleanExpr(0);
				setState(378);
				match(BC);
				setState(379);
				match(START);
				setState(380);
				statements();
				setState(381);
				match(END);
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(finalProjectParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(finalProjectParser.NUM, i);
		}
		public TerminalNode RANGEOP() { return getToken(finalProjectParser.RANGEOP, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof finalProjectListener ) ((finalProjectListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof finalProjectVisitor ) return ((finalProjectVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(NUM);
			setState(386);
			match(RANGEOP);
			setState(387);
			match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return input_plist_sempred((Input_plistContext)_localctx, predIndex);
		case 8:
			return output_plist_sempred((Output_plistContext)_localctx, predIndex);
		case 25:
			return idList_sempred((IdListContext)_localctx, predIndex);
		case 27:
			return arithmeticExpr_sempred((ArithmeticExprContext)_localctx, predIndex);
		case 28:
			return term_sempred((TermContext)_localctx, predIndex);
		case 31:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean input_plist_sempred(Input_plistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean output_plist_sempred(Output_plistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean idList_sempred(IdListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmeticExpr_sempred(ArithmeticExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00c2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00cf\n\20\3\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\22\3"+
		"\22\3\22\3\22\5\22\u00db\n\22\3\23\3\23\5\23\u00df\n\23\3\24\3\24\3\24"+
		"\3\25\3\25\5\25\u00e6\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0104\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u010c\n\33\f\33\16\33\u010f\13\33\3\34\3\34\5\34\u0113\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u011c\n\35\f\35\16\35\u011f\13\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0128\n\36\f\36\16\36\u012b\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u0132\n\37\3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u013f\n!\3!\3!\3!\3!\7!\u0145\n!\f!\16!\u0148\13!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u016e\n(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0182\n)\3*\3*\3*\3*\3*\2\b\20\22\64"+
		"8:@+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPR\2\b\3\2\3\5\3\289\3\2!$\3\2\30\31\3\2%*\4\2\23\2499\2\u017b"+
		"\2T\3\2\2\2\4]\3\2\2\2\6_\3\2\2\2\bh\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16"+
		"\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u0095\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0"+
		"\3\2\2\2\30\u00b2\3\2\2\2\32\u00ba\3\2\2\2\34\u00c1\3\2\2\2\36\u00ce\3"+
		"\2\2\2 \u00d4\3\2\2\2\"\u00da\3\2\2\2$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u00e7\3\2\2\2,\u00eb\3\2\2\2.\u00f2\3\2\2\2\60\u00f4\3\2\2\2"+
		"\62\u0103\3\2\2\2\64\u0105\3\2\2\2\66\u0112\3\2\2\28\u0114\3\2\2\2:\u0120"+
		"\3\2\2\2<\u0131\3\2\2\2>\u0133\3\2\2\2@\u013e\3\2\2\2B\u0149\3\2\2\2D"+
		"\u014b\3\2\2\2F\u014d\3\2\2\2H\u0153\3\2\2\2J\u015c\3\2\2\2L\u0164\3\2"+
		"\2\2N\u016d\3\2\2\2P\u0181\3\2\2\2R\u0183\3\2\2\2TU\5\4\3\2UV\5\b\5\2"+
		"VW\5\n\6\2WX\5\b\5\2X\3\3\2\2\2YZ\5\6\4\2Z[\5\4\3\2[^\3\2\2\2\\^\3\2\2"+
		"\2]Y\3\2\2\2]\\\3\2\2\2^\5\3\2\2\2_`\7\n\2\2`a\7\13\2\2ab\78\2\2bc\7/"+
		"\2\2c\7\3\2\2\2de\5\f\7\2ef\5\b\5\2fi\3\2\2\2gi\3\2\2\2hd\3\2\2\2hg\3"+
		"\2\2\2i\t\3\2\2\2jk\7+\2\2kl\7\f\2\2lm\7\r\2\2mn\7,\2\2no\5\30\r\2o\13"+
		"\3\2\2\2pq\7+\2\2qr\7\13\2\2rs\78\2\2st\7,\2\2tu\7\25\2\2uv\7\26\2\2v"+
		"w\7\62\2\2wx\5\20\t\2xy\7\63\2\2yz\7/\2\2z{\5\16\b\2{|\5\30\r\2|\r\3\2"+
		"\2\2}~\7\27\2\2~\177\7\62\2\2\177\u0080\5\22\n\2\u0080\u0081\7\63\2\2"+
		"\u0081\u0082\7/\2\2\u0082\u0085\3\2\2\2\u0083\u0085\3\2\2\2\u0084}\3\2"+
		"\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\b\t\1\2\u0087\u0088"+
		"\78\2\2\u0088\u0089\7-\2\2\u0089\u008a\5\24\13\2\u008a\u0092\3\2\2\2\u008b"+
		"\u008c\f\4\2\2\u008c\u008d\7\60\2\2\u008d\u008e\78\2\2\u008e\u008f\7-"+
		"\2\2\u008f\u0091\5\24\13\2\u0090\u008b\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\21\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0096\b\n\1\2\u0096\u0097\78\2\2\u0097\u0098\7-\2\2\u0098\u0099"+
		"\5\26\f\2\u0099\u00a1\3\2\2\2\u009a\u009b\f\4\2\2\u009b\u009c\7\60\2\2"+
		"\u009c\u009d\78\2\2\u009d\u009e\7-\2\2\u009e\u00a0\5\24\13\2\u009f\u009a"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00af\7\3\2\2\u00a5\u00af\7\4\2"+
		"\2\u00a6\u00af\7\5\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7\62\2\2\u00a9"+
		"\u00aa\5R*\2\u00aa\u00ab\7\63\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\5\26"+
		"\f\2\u00ad\u00af\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae"+
		"\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b1\t\2\2"+
		"\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\32\16\2\u00b4\u00b5"+
		"\7\t\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\5\32\16\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00c2\5\36\20\2\u00bd\u00c2\5$\23\2\u00be"+
		"\u00c2\5F$\2\u00bf\u00c2\5H%\2\u00c0\u00c2\5P)\2\u00c1\u00bc\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\7\64\2\2\u00c5"+
		"\u00c6\78\2\2\u00c6\u00c7\7\65\2\2\u00c7\u00cf\7/\2\2\u00c8\u00c9\7\17"+
		"\2\2\u00c9\u00ca\7\64\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\65\2\2\u00cc"+
		"\u00cd\7/\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c8\3\2"+
		"\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\78\2\2\u00d1\u00d5\5\"\22\2\u00d2\u00d5"+
		"\79\2\2\u00d3\u00d5\7:\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7\62\2\2\u00d7\u00d8\78\2\2"+
		"\u00d8\u00db\7\63\2\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db#\3\2\2\2\u00dc\u00df\5&\24\2\u00dd\u00df\5\60\31\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df%\3\2\2\2\u00e0\u00e1\78\2\2\u00e1"+
		"\u00e2\5(\25\2\u00e2\'\3\2\2\2\u00e3\u00e6\5*\26\2\u00e4\u00e6\5,\27\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e8\7"+
		"\61\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea\7/\2\2\u00ea+\3\2\2\2\u00eb"+
		"\u00ec\7\62\2\2\u00ec\u00ed\5.\30\2\u00ed\u00ee\7\63\2\2\u00ee\u00ef\7"+
		"\61\2\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\7/\2\2\u00f1-\3\2\2\2\u00f2"+
		"\u00f3\t\3\2\2\u00f3/\3\2\2\2\u00f4\u00f5\5\62\32\2\u00f5\u00f6\7\20\2"+
		"\2\u00f6\u00f7\7\13\2\2\u00f7\u00f8\78\2\2\u00f8\u00f9\7\21\2\2\u00f9"+
		"\u00fa\7\22\2\2\u00fa\u00fb\5\64\33\2\u00fb\u00fc\7/\2\2\u00fc\61\3\2"+
		"\2\2\u00fd\u00fe\7\62\2\2\u00fe\u00ff\5\64\33\2\u00ff\u0100\7\63\2\2\u0100"+
		"\u0101\7\61\2\2\u0101\u0104\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3"+
		"\2\2\2\u0103\u0102\3\2\2\2\u0104\63\3\2\2\2\u0105\u0106\b\33\1\2\u0106"+
		"\u0107\78\2\2\u0107\u010d\3\2\2\2\u0108\u0109\f\4\2\2\u0109\u010a\7\60"+
		"\2\2\u010a\u010c\78\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\65\3\2\2\2\u010f\u010d\3\2\2"+
		"\2\u0110\u0113\58\35\2\u0111\u0113\5@!\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\67\3\2\2\2\u0114\u0115\b\35\1\2\u0115\u0116\5:\36\2\u0116"+
		"\u011d\3\2\2\2\u0117\u0118\f\4\2\2\u0118\u0119\5> \2\u0119\u011a\5:\36"+
		"\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e9\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\b\36\1\2\u0121\u0122\5<\37\2\u0122\u0129\3\2\2\2\u0123\u0124\f"+
		"\4\2\2\u0124\u0125\5> \2\u0125\u0126\5<\37\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0123\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a;\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\64\2\2\u012d\u012e"+
		"\58\35\2\u012e\u012f\7\65\2\2\u012f\u0132\3\2\2\2\u0130\u0132\5 \21\2"+
		"\u0131\u012c\3\2\2\2\u0131\u0130\3\2\2\2\u0132=\3\2\2\2\u0133\u0134\t"+
		"\4\2\2\u0134?\3\2\2\2\u0135\u0136\b!\1\2\u0136\u0137\58\35\2\u0137\u0138"+
		"\5D#\2\u0138\u0139\58\35\2\u0139\u013f\3\2\2\2\u013a\u013b\7\64\2\2\u013b"+
		"\u013c\5@!\2\u013c\u013d\7\65\2\2\u013d\u013f\3\2\2\2\u013e\u0135\3\2"+
		"\2\2\u013e\u013a\3\2\2\2\u013f\u0146\3\2\2\2\u0140\u0141\f\5\2\2\u0141"+
		"\u0142\5B\"\2\u0142\u0143\5@!\6\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2"+
		"\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147A"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\t\5\2\2\u014aC\3\2\2\2\u014b"+
		"\u014c\t\6\2\2\u014cE\3\2\2\2\u014d\u014e\7\n\2\2\u014e\u014f\5\64\33"+
		"\2\u014f\u0150\7-\2\2\u0150\u0151\5\24\13\2\u0151\u0152\7/\2\2\u0152G"+
		"\3\2\2\2\u0153\u0154\7\34\2\2\u0154\u0155\7\64\2\2\u0155\u0156\78\2\2"+
		"\u0156\u0157\7\65\2\2\u0157\u0158\7\b\2\2\u0158\u0159\5J&\2\u0159\u015a"+
		"\5N(\2\u015a\u015b\7\t\2\2\u015bI\3\2\2\2\u015c\u015d\7\35\2\2\u015d\u015e"+
		"\5L\'\2\u015e\u015f\7-\2\2\u015f\u0160\5\32\16\2\u0160\u0161\7\36\2\2"+
		"\u0161\u0162\7/\2\2\u0162\u0163\5J&\2\u0163K\3\2\2\2\u0164\u0165\t\7\2"+
		"\2\u0165M\3\2\2\2\u0166\u0167\7\37\2\2\u0167\u0168\7-\2\2\u0168\u0169"+
		"\5\32\16\2\u0169\u016a\7\36\2\2\u016a\u016b\7/\2\2\u016b\u016e\3\2\2\2"+
		"\u016c\u016e\3\2\2\2\u016d\u0166\3\2\2\2\u016d\u016c\3\2\2\2\u016eO\3"+
		"\2\2\2\u016f\u0170\7\32\2\2\u0170\u0171\7\64\2\2\u0171\u0172\78\2\2\u0172"+
		"\u0173\7\33\2\2\u0173\u0174\5R*\2\u0174\u0175\7\65\2\2\u0175\u0176\7\b"+
		"\2\2\u0176\u0177\5\32\16\2\u0177\u0178\7\t\2\2\u0178\u0182\3\2\2\2\u0179"+
		"\u017a\7 \2\2\u017a\u017b\7\64\2\2\u017b\u017c\5@!\2\u017c\u017d\7\65"+
		"\2\2\u017d\u017e\7\b\2\2\u017e\u017f\5\32\16\2\u017f\u0180\7\t\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u016f\3\2\2\2\u0181\u0179\3\2\2\2\u0182Q\3\2\2\2"+
		"\u0183\u0184\79\2\2\u0184\u0185\7.\2\2\u0185\u0186\79\2\2\u0186S\3\2\2"+
		"\2\31]h\u0084\u0092\u00a1\u00ae\u00ba\u00c1\u00ce\u00d4\u00da\u00de\u00e5"+
		"\u0103\u010d\u0112\u011d\u0129\u0131\u013e\u0146\u016d\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}