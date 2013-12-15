// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlPgSqlParser}.
 */
public interface PlPgSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#copy_type}.
	 * @param ctx the parse tree
	 */
	void enterCopy_type(@NotNull PlPgSqlParser.Copy_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copy_type}.
	 * @param ctx the parse tree
	 */
	void exitCopy_type(@NotNull PlPgSqlParser.Copy_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionSettings}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSettings(@NotNull PlPgSqlParser.FunctionSettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionSettings}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSettings(@NotNull PlPgSqlParser.FunctionSettingsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull PlPgSqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull PlPgSqlParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(@NotNull PlPgSqlParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(@NotNull PlPgSqlParser.StmtsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull PlPgSqlParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull PlPgSqlParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PlPgSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PlPgSqlParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PlPgSqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PlPgSqlParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#row_type}.
	 * @param ctx the parse tree
	 */
	void enterRow_type(@NotNull PlPgSqlParser.Row_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#row_type}.
	 * @param ctx the parse tree
	 */
	void exitRow_type(@NotNull PlPgSqlParser.Row_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(@NotNull PlPgSqlParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(@NotNull PlPgSqlParser.UnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(@NotNull PlPgSqlParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(@NotNull PlPgSqlParser.WindowContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull PlPgSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull PlPgSqlParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 */
	void enterPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 */
	void exitPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull PlPgSqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull PlPgSqlParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull PlPgSqlParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull PlPgSqlParser.VarDeclarationContext ctx);
}