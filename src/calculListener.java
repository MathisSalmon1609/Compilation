// Generated from /home/etud/o2171038/IdeaProjects/Multiplat_TD1/src/calcul.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculParser}.
 */
public interface calculListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(calculParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(calculParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(calculParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(calculParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(calculParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(calculParser.OpContext ctx);
}