// Generated from /media/F/compiler/test/FinalProject/finalProject.g4 by ANTLR 4.7.2
package antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tablecreator.DataType;
import tablecreator.TableVM;
import tablecreator.Utils;

import java.awt.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides an empty implementation of {@link finalProjectListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class finalProjectBaseListener implements finalProjectListener {

    finalProjectParser parser;
    HashMap<String, HashMap<String, TableVM>> symbolTable;
    String currentScope;
    List<String> idListStack;
    DataType declareDataType;
    String currentValue = 0 + "";
    List<Exception> errors;
    boolean isArray = false;
    boolean isBoolean = false;

    public finalProjectBaseListener(finalProjectParser parser) {
        this.parser = parser;
        symbolTable = new HashMap<>();
        idListStack = new ArrayList<>();
        errors = new ArrayList<>();
    }

    public HashMap<String, HashMap<String, TableVM>> getSymbolTable() {
        return symbolTable;
    }

    public List<Exception> getErrors() {
        return errors;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProgram(finalProjectParser.ProgramContext ctx) {
        currentScope = "program";
        if (symbolTable.get(currentScope) == null) {
            symbolTable.put(currentScope, new HashMap<>());
        } else {
            errors.add(new Exception("scope is already exist."));
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProgram(finalProjectParser.ProgramContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterModuleDeclarations(finalProjectParser.ModuleDeclarationsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitModuleDeclarations(finalProjectParser.ModuleDeclarationsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterModuleDeclaration(finalProjectParser.ModuleDeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitModuleDeclaration(finalProjectParser.ModuleDeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOtherModules(finalProjectParser.OtherModulesContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOtherModules(finalProjectParser.OtherModulesContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDriverModule(finalProjectParser.DriverModuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDriverModule(finalProjectParser.DriverModuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterModule(finalProjectParser.ModuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitModule(finalProjectParser.ModuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRet(finalProjectParser.RetContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRet(finalProjectParser.RetContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterInput_plist(finalProjectParser.Input_plistContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitInput_plist(finalProjectParser.Input_plistContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOutput_plist(finalProjectParser.Output_plistContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOutput_plist(finalProjectParser.Output_plistContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDataType(finalProjectParser.DataTypeContext ctx) {
        if (ctx.ARRAY() == null) {
            declareDataType = Utils.getDataTypeFromString(ctx.getChild(0).getText(), false);
            currentValue = "undefined";
        } else {
            int start = Integer.valueOf(ctx.range().NUM(0).getText());
            int end = Integer.valueOf(ctx.range().NUM(1).getText());
            currentValue = Math.abs(start - end) + 1 + "";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDataType(finalProjectParser.DataTypeContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterType(finalProjectParser.TypeContext ctx) {
        declareDataType = Utils.getDataTypeFromString(ctx.getChild(0).getText(), true);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitType(finalProjectParser.TypeContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterModuleDef(finalProjectParser.ModuleDefContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitModuleDef(finalProjectParser.ModuleDefContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStatements(finalProjectParser.StatementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatements(finalProjectParser.StatementsContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStatement(finalProjectParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatement(finalProjectParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIoStmt(finalProjectParser.IoStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIoStmt(finalProjectParser.IoStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterVar(finalProjectParser.VarContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitVar(finalProjectParser.VarContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWhichId(finalProjectParser.WhichIdContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWhichId(finalProjectParser.WhichIdContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSimpleStmt(finalProjectParser.SimpleStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSimpleStmt(finalProjectParser.SimpleStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAssignmentStmt(finalProjectParser.AssignmentStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAssignmentStmt(finalProjectParser.AssignmentStmtContext ctx) {
        if (!isArray) {
            HashMap<String, TableVM> current = symbolTable.get(currentScope);
            if (!isBoolean) {
                if (current.containsKey(ctx.ID().getText())) {
                    TableVM tableVM = current.get(ctx.ID().getText());
                    String expression = Utils.getExpression(currentValue, symbolTable.get(currentScope),errors);
                    try {
                        ScriptEngineManager mgr = new ScriptEngineManager();
                        ScriptEngine engine = mgr.getEngineByName("JavaScript");
                        currentValue = engine.eval(expression).toString();
                    } catch (ScriptException e) { }


                    tableVM.setValue(currentValue);
                    current.put(tableVM.getName(), tableVM);
                } else {
                    errors.add(new Exception("\"" + ctx.ID().getText() + "\" doesn't declared."));
                }
            } else {
                TableVM tableVM = current.get(ctx.ID().getText());
                tableVM.setValue(currentValue);
                current.put(tableVM.getName(), tableVM);
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterWhichStmt(finalProjectParser.WhichStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitWhichStmt(finalProjectParser.WhichStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLvalueIDStmt(finalProjectParser.LvalueIDStmtContext ctx) {
        isArray = false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLvalueIDStmt(finalProjectParser.LvalueIDStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLvalueARRStmt(finalProjectParser.LvalueARRStmtContext ctx) {
        isArray = true;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLvalueARRStmt(finalProjectParser.LvalueARRStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIndex(finalProjectParser.IndexContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIndex(finalProjectParser.IndexContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterModuleReuseStmt(finalProjectParser.ModuleReuseStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitModuleReuseStmt(finalProjectParser.ModuleReuseStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOptional(finalProjectParser.OptionalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOptional(finalProjectParser.OptionalContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIdList(finalProjectParser.IdListContext ctx) {
        idListStack.add(ctx.ID().getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIdList(finalProjectParser.IdListContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpression(finalProjectParser.ExpressionContext ctx) {
//        if (ctx.arithmeticExpr()!=null){
//
//        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpression(finalProjectParser.ExpressionContext ctx) {
        if (ctx.arithmeticExpr() != null) {
            currentValue = ctx.arithmeticExpr().getText();
            isBoolean = false;
        } else if (ctx.booleanExpr() != null) {
            isBoolean = true;
            currentValue = ctx.booleanExpr().getText();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArithmeticExpr(finalProjectParser.ArithmeticExprContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArithmeticExpr(finalProjectParser.ArithmeticExprContext ctx) {
        currentValue = ctx.getText();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTerm(finalProjectParser.TermContext ctx) {
//        stringBuilder = new StringBuilder();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTerm(finalProjectParser.TermContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFactor(finalProjectParser.FactorContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFactor(finalProjectParser.FactorContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterOp(finalProjectParser.OpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitOp(finalProjectParser.OpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBooleanExpr(finalProjectParser.BooleanExprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBooleanExpr(finalProjectParser.BooleanExprContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLogicalOp(finalProjectParser.LogicalOpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLogicalOp(finalProjectParser.LogicalOpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRelationalOp(finalProjectParser.RelationalOpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRelationalOp(finalProjectParser.RelationalOpContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclareStmt(finalProjectParser.DeclareStmtContext ctx) {
        idListStack.clear();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclareStmt(finalProjectParser.DeclareStmtContext ctx) {
        HashMap<String, TableVM> current = symbolTable.get(currentScope);
        for (String key : idListStack) {
            if (current.containsKey(key)) {
                errors.add(new Exception("\"" + key + "\" is already declared."));
            } else {
                current.put(key, new TableVM(key, declareDataType, currentValue));
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterConditionalStmt(finalProjectParser.ConditionalStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitConditionalStmt(finalProjectParser.ConditionalStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterCaseStmt(finalProjectParser.CaseStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitCaseStmt(finalProjectParser.CaseStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterValue(finalProjectParser.ValueContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitValue(finalProjectParser.ValueContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMyDefault(finalProjectParser.MyDefaultContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMyDefault(finalProjectParser.MyDefaultContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterIterativeStmt(finalProjectParser.IterativeStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitIterativeStmt(finalProjectParser.IterativeStmtContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRange(finalProjectParser.RangeContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRange(finalProjectParser.RangeContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}