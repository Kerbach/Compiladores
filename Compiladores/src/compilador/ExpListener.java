// Generated from Exp.g by ANTLR 4.7.2

    //import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ExpParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ExpParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExpParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExpParser.FactorContext ctx);
}