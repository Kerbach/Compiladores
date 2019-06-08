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
	 * Enter a parse tree produced by {@link SauroParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SauroParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SauroParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SauroParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SauroParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SauroParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SauroParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by {@link SauroParser#st_call}.
	 * @param ctx the parse tree
	 */
	void enterSt_call(SauroParser.St_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_call}.
	 * @param ctx the parse tree
	 */
	void exitSt_call(SauroParser.St_callContext ctx);
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
	 * Enter a parse tree produced by {@link SauroParser#st_new_list}.
	 * @param ctx the parse tree
	 */
	void enterSt_new_list(SauroParser.St_new_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_new_list}.
	 * @param ctx the parse tree
	 */
	void exitSt_new_list(SauroParser.St_new_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_list_append}.
	 * @param ctx the parse tree
	 */
	void enterSt_list_append(SauroParser.St_list_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_list_append}.
	 * @param ctx the parse tree
	 */
	void exitSt_list_append(SauroParser.St_list_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SauroParser#st_list_attrib}.
	 * @param ctx the parse tree
	 */
	void enterSt_list_attrib(SauroParser.St_list_attribContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_list_attrib}.
	 * @param ctx the parse tree
	 */
	void exitSt_list_attrib(SauroParser.St_list_attribContext ctx);
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
	 * Enter a parse tree produced by {@link SauroParser#st_return}.
	 * @param ctx the parse tree
	 */
	void enterSt_return(SauroParser.St_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SauroParser#st_return}.
	 * @param ctx the parse tree
	 */
	void exitSt_return(SauroParser.St_returnContext ctx);
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