// Generated from Sauro.g by ANTLR 4.7.2

    //import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SauroParser}.
 */
public interface SauroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SauroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SauroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SauroParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SauroParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SauroParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SauroParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SauroParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_print}.
	 * @param ctx the parse tree
	 */
	void enterSt_print(SauroParser.St_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_print}.
	 * @param ctx the parse tree
	 */
	void exitSt_print(SauroParser.St_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void enterSt_attrib(SauroParser.St_attribContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void exitSt_attrib(SauroParser.St_attribContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_if}.
	 * @param ctx the parse tree
	 */
	void enterSt_if(SauroParser.St_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_if}.
	 * @param ctx the parse tree
	 */
	void exitSt_if(SauroParser.St_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SauroParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SauroParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_while}.
	 * @param ctx the parse tree
	 */
	void enterSt_while(SauroParser.St_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_while}.
	 * @param ctx the parse tree
	 */
	void exitSt_while(SauroParser.St_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SauroParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SauroParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SauroParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SauroParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SauroParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SauroParser.FactorContext ctx);
}