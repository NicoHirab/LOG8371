// Generated from io\onedev\server\u005Cutil\reviewrequirement\ReviewRequirement.g4 by ANTLR 4.7.2
package io.onedev.server.util.reviewrequirement;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReviewRequirementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReviewRequirementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReviewRequirementParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(ReviewRequirementParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReviewRequirementParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(ReviewRequirementParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReviewRequirementParser#userCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserCriteria(ReviewRequirementParser.UserCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReviewRequirementParser#groupCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupCriteria(ReviewRequirementParser.GroupCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReviewRequirementParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(ReviewRequirementParser.CountContext ctx);
}