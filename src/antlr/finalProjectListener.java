package antlr;

// Generated from /media/F/compiler/test/FinalProject/finalProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link finalProjectParser}.
 */
public interface finalProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(finalProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(finalProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarations(finalProjectParser.ModuleDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarations(finalProjectParser.ModuleDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(finalProjectParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(finalProjectParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#otherModules}.
	 * @param ctx the parse tree
	 */
	void enterOtherModules(finalProjectParser.OtherModulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#otherModules}.
	 * @param ctx the parse tree
	 */
	void exitOtherModules(finalProjectParser.OtherModulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#driverModule}.
	 * @param ctx the parse tree
	 */
	void enterDriverModule(finalProjectParser.DriverModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#driverModule}.
	 * @param ctx the parse tree
	 */
	void exitDriverModule(finalProjectParser.DriverModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(finalProjectParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(finalProjectParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(finalProjectParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(finalProjectParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#input_plist}.
	 * @param ctx the parse tree
	 */
	void enterInput_plist(finalProjectParser.Input_plistContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#input_plist}.
	 * @param ctx the parse tree
	 */
	void exitInput_plist(finalProjectParser.Input_plistContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#output_plist}.
	 * @param ctx the parse tree
	 */
	void enterOutput_plist(finalProjectParser.Output_plistContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#output_plist}.
	 * @param ctx the parse tree
	 */
	void exitOutput_plist(finalProjectParser.Output_plistContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(finalProjectParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(finalProjectParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(finalProjectParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(finalProjectParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void enterModuleDef(finalProjectParser.ModuleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void exitModuleDef(finalProjectParser.ModuleDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(finalProjectParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(finalProjectParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(finalProjectParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(finalProjectParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#ioStmt}.
	 * @param ctx the parse tree
	 */
	void enterIoStmt(finalProjectParser.IoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#ioStmt}.
	 * @param ctx the parse tree
	 */
	void exitIoStmt(finalProjectParser.IoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(finalProjectParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(finalProjectParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#whichId}.
	 * @param ctx the parse tree
	 */
	void enterWhichId(finalProjectParser.WhichIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#whichId}.
	 * @param ctx the parse tree
	 */
	void exitWhichId(finalProjectParser.WhichIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(finalProjectParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(finalProjectParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(finalProjectParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(finalProjectParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#whichStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhichStmt(finalProjectParser.WhichStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#whichStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhichStmt(finalProjectParser.WhichStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#lvalueIDStmt}.
	 * @param ctx the parse tree
	 */
	void enterLvalueIDStmt(finalProjectParser.LvalueIDStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#lvalueIDStmt}.
	 * @param ctx the parse tree
	 */
	void exitLvalueIDStmt(finalProjectParser.LvalueIDStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#lvalueARRStmt}.
	 * @param ctx the parse tree
	 */
	void enterLvalueARRStmt(finalProjectParser.LvalueARRStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#lvalueARRStmt}.
	 * @param ctx the parse tree
	 */
	void exitLvalueARRStmt(finalProjectParser.LvalueARRStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(finalProjectParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(finalProjectParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#moduleReuseStmt}.
	 * @param ctx the parse tree
	 */
	void enterModuleReuseStmt(finalProjectParser.ModuleReuseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#moduleReuseStmt}.
	 * @param ctx the parse tree
	 */
	void exitModuleReuseStmt(finalProjectParser.ModuleReuseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(finalProjectParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(finalProjectParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(finalProjectParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(finalProjectParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(finalProjectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(finalProjectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(finalProjectParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(finalProjectParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(finalProjectParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(finalProjectParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(finalProjectParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(finalProjectParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(finalProjectParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(finalProjectParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(finalProjectParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(finalProjectParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(finalProjectParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(finalProjectParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(finalProjectParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(finalProjectParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(finalProjectParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(finalProjectParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStmt(finalProjectParser.ConditionalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStmt(finalProjectParser.ConditionalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(finalProjectParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(finalProjectParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(finalProjectParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(finalProjectParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#myDefault}.
	 * @param ctx the parse tree
	 */
	void enterMyDefault(finalProjectParser.MyDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#myDefault}.
	 * @param ctx the parse tree
	 */
	void exitMyDefault(finalProjectParser.MyDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#iterativeStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterativeStmt(finalProjectParser.IterativeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#iterativeStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterativeStmt(finalProjectParser.IterativeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link finalProjectParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(finalProjectParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link finalProjectParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(finalProjectParser.RangeContext ctx);
}