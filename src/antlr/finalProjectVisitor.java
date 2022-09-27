package antlr;

// Generated from /media/F/compiler/test/FinalProject/finalProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link finalProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface finalProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(finalProjectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclarations(finalProjectParser.ModuleDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(finalProjectParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#otherModules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherModules(finalProjectParser.OtherModulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#driverModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDriverModule(finalProjectParser.DriverModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(finalProjectParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(finalProjectParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#input_plist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_plist(finalProjectParser.Input_plistContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#output_plist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_plist(finalProjectParser.Output_plistContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(finalProjectParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(finalProjectParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#moduleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDef(finalProjectParser.ModuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(finalProjectParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(finalProjectParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#ioStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoStmt(finalProjectParser.IoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(finalProjectParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#whichId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhichId(finalProjectParser.WhichIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(finalProjectParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(finalProjectParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#whichStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhichStmt(finalProjectParser.WhichStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#lvalueIDStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueIDStmt(finalProjectParser.LvalueIDStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#lvalueARRStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueARRStmt(finalProjectParser.LvalueARRStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(finalProjectParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#moduleReuseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleReuseStmt(finalProjectParser.ModuleReuseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(finalProjectParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(finalProjectParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(finalProjectParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(finalProjectParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(finalProjectParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(finalProjectParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(finalProjectParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(finalProjectParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(finalProjectParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(finalProjectParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(finalProjectParser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#conditionalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStmt(finalProjectParser.ConditionalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmt(finalProjectParser.CaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(finalProjectParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#myDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyDefault(finalProjectParser.MyDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#iterativeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeStmt(finalProjectParser.IterativeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link finalProjectParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(finalProjectParser.RangeContext ctx);
}