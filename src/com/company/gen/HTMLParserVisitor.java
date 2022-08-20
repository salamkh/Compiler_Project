// Generated from C:/Users/Lenovo/Desktop/COMPILER_PRO/COMPILER_PRO/src/com/company\HTMLParser.g4 by ANTLR 4.9.2
package com.company.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#web}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeb(HTMLParser.WebContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#session_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_start(HTMLParser.Session_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession(HTMLParser.SessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#session_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_end(HTMLParser.Session_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#session_remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_remove(HTMLParser.Session_removeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(HTMLParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#body_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_page(HTMLParser.Body_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HTMLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#php}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhp(HTMLParser.PhpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#header_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_page(HTMLParser.Header_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#page_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_id(HTMLParser.Page_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#page_id_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_id_value(HTMLParser.Page_id_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#page_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_link(HTMLParser.Page_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(HTMLParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(HTMLParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(HTMLParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(HTMLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(HTMLParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#link_href}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_href(HTMLParser.Link_hrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(HTMLParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(HTMLParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#text_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_value(HTMLParser.Text_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(HTMLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(HTMLParser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#email_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail_value(HTMLParser.Email_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(HTMLParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(HTMLParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#phone_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhone_number(HTMLParser.Phone_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(HTMLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(HTMLParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#radio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadio(HTMLParser.RadioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(HTMLParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#check_box}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_box(HTMLParser.Check_boxContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(HTMLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(HTMLParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(HTMLParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#video}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVideo(HTMLParser.VideoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#audio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudio(HTMLParser.AudioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#on_click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_click(HTMLParser.On_clickContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#double_click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_click(HTMLParser.Double_clickContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(HTMLParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#button_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton_body(HTMLParser.Button_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#out_button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_button(HTMLParser.Out_buttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#out_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_text(HTMLParser.Out_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_empty(HTMLParser.Function_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_with_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_arg(HTMLParser.Function_with_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(HTMLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(HTMLParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrow_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_key(HTMLParser.Arrow_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrow_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_value(HTMLParser.Arrow_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrow_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_name(HTMLParser.Arrow_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(HTMLParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#controller_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController_id(HTMLParser.Controller_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#controller_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController_body(HTMLParser.Controller_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(HTMLParser.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(HTMLParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#boolean_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value(HTMLParser.Boolean_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(HTMLParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(HTMLParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#go}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo(HTMLParser.GoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#before_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBefore_as(HTMLParser.Before_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#for_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cond(HTMLParser.For_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(HTMLParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(HTMLParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(HTMLParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatments(HTMLParser.StatmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HTMLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(HTMLParser.Object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(HTMLParser.ObjectContext ctx);
}