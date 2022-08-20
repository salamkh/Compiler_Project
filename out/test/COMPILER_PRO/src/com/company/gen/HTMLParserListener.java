// Generated from C:/Users/Lenovo/Desktop/COMPILER_PRO/COMPILER_PRO/src/com/company\HTMLParser.g4 by ANTLR 4.9.2
package com.company.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#web}.
	 * @param ctx the parse tree
	 */
	void enterWeb(HTMLParser.WebContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#web}.
	 * @param ctx the parse tree
	 */
	void exitWeb(HTMLParser.WebContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#session_start}.
	 * @param ctx the parse tree
	 */
	void enterSession_start(HTMLParser.Session_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#session_start}.
	 * @param ctx the parse tree
	 */
	void exitSession_start(HTMLParser.Session_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#session}.
	 * @param ctx the parse tree
	 */
	void enterSession(HTMLParser.SessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#session}.
	 * @param ctx the parse tree
	 */
	void exitSession(HTMLParser.SessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#session_end}.
	 * @param ctx the parse tree
	 */
	void enterSession_end(HTMLParser.Session_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#session_end}.
	 * @param ctx the parse tree
	 */
	void exitSession_end(HTMLParser.Session_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#session_remove}.
	 * @param ctx the parse tree
	 */
	void enterSession_remove(HTMLParser.Session_removeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#session_remove}.
	 * @param ctx the parse tree
	 */
	void exitSession_remove(HTMLParser.Session_removeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(HTMLParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(HTMLParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#body_page}.
	 * @param ctx the parse tree
	 */
	void enterBody_page(HTMLParser.Body_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#body_page}.
	 * @param ctx the parse tree
	 */
	void exitBody_page(HTMLParser.Body_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HTMLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HTMLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#php}.
	 * @param ctx the parse tree
	 */
	void enterPhp(HTMLParser.PhpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#php}.
	 * @param ctx the parse tree
	 */
	void exitPhp(HTMLParser.PhpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#header_page}.
	 * @param ctx the parse tree
	 */
	void enterHeader_page(HTMLParser.Header_pageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#header_page}.
	 * @param ctx the parse tree
	 */
	void exitHeader_page(HTMLParser.Header_pageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#page_id}.
	 * @param ctx the parse tree
	 */
	void enterPage_id(HTMLParser.Page_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#page_id}.
	 * @param ctx the parse tree
	 */
	void exitPage_id(HTMLParser.Page_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#page_id_value}.
	 * @param ctx the parse tree
	 */
	void enterPage_id_value(HTMLParser.Page_id_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#page_id_value}.
	 * @param ctx the parse tree
	 */
	void exitPage_id_value(HTMLParser.Page_id_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#page_link}.
	 * @param ctx the parse tree
	 */
	void enterPage_link(HTMLParser.Page_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#page_link}.
	 * @param ctx the parse tree
	 */
	void exitPage_link(HTMLParser.Page_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(HTMLParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(HTMLParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(HTMLParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(HTMLParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(HTMLParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(HTMLParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(HTMLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(HTMLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(HTMLParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(HTMLParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#link_href}.
	 * @param ctx the parse tree
	 */
	void enterLink_href(HTMLParser.Link_hrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#link_href}.
	 * @param ctx the parse tree
	 */
	void exitLink_href(HTMLParser.Link_hrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(HTMLParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(HTMLParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(HTMLParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(HTMLParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#text_value}.
	 * @param ctx the parse tree
	 */
	void enterText_value(HTMLParser.Text_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#text_value}.
	 * @param ctx the parse tree
	 */
	void exitText_value(HTMLParser.Text_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(HTMLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(HTMLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(HTMLParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(HTMLParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#email_value}.
	 * @param ctx the parse tree
	 */
	void enterEmail_value(HTMLParser.Email_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#email_value}.
	 * @param ctx the parse tree
	 */
	void exitEmail_value(HTMLParser.Email_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(HTMLParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(HTMLParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(HTMLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(HTMLParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HTMLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HTMLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#phone_number}.
	 * @param ctx the parse tree
	 */
	void enterPhone_number(HTMLParser.Phone_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#phone_number}.
	 * @param ctx the parse tree
	 */
	void exitPhone_number(HTMLParser.Phone_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(HTMLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(HTMLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(HTMLParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(HTMLParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#radio}.
	 * @param ctx the parse tree
	 */
	void enterRadio(HTMLParser.RadioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#radio}.
	 * @param ctx the parse tree
	 */
	void exitRadio(HTMLParser.RadioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(HTMLParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(HTMLParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HTMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#check_box}.
	 * @param ctx the parse tree
	 */
	void enterCheck_box(HTMLParser.Check_boxContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#check_box}.
	 * @param ctx the parse tree
	 */
	void exitCheck_box(HTMLParser.Check_boxContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(HTMLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(HTMLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(HTMLParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(HTMLParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(HTMLParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(HTMLParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#video}.
	 * @param ctx the parse tree
	 */
	void enterVideo(HTMLParser.VideoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#video}.
	 * @param ctx the parse tree
	 */
	void exitVideo(HTMLParser.VideoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#audio}.
	 * @param ctx the parse tree
	 */
	void enterAudio(HTMLParser.AudioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#audio}.
	 * @param ctx the parse tree
	 */
	void exitAudio(HTMLParser.AudioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#on_click}.
	 * @param ctx the parse tree
	 */
	void enterOn_click(HTMLParser.On_clickContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#on_click}.
	 * @param ctx the parse tree
	 */
	void exitOn_click(HTMLParser.On_clickContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#double_click}.
	 * @param ctx the parse tree
	 */
	void enterDouble_click(HTMLParser.Double_clickContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#double_click}.
	 * @param ctx the parse tree
	 */
	void exitDouble_click(HTMLParser.Double_clickContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(HTMLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(HTMLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#button_body}.
	 * @param ctx the parse tree
	 */
	void enterButton_body(HTMLParser.Button_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#button_body}.
	 * @param ctx the parse tree
	 */
	void exitButton_body(HTMLParser.Button_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#out_button}.
	 * @param ctx the parse tree
	 */
	void enterOut_button(HTMLParser.Out_buttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#out_button}.
	 * @param ctx the parse tree
	 */
	void exitOut_button(HTMLParser.Out_buttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#out_text}.
	 * @param ctx the parse tree
	 */
	void enterOut_text(HTMLParser.Out_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#out_text}.
	 * @param ctx the parse tree
	 */
	void exitOut_text(HTMLParser.Out_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_empty}.
	 * @param ctx the parse tree
	 */
	void enterFunction_empty(HTMLParser.Function_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_empty}.
	 * @param ctx the parse tree
	 */
	void exitFunction_empty(HTMLParser.Function_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_with_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_arg(HTMLParser.Function_with_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_with_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_arg(HTMLParser.Function_with_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(HTMLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(HTMLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(HTMLParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(HTMLParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrow_key}.
	 * @param ctx the parse tree
	 */
	void enterArrow_key(HTMLParser.Arrow_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrow_key}.
	 * @param ctx the parse tree
	 */
	void exitArrow_key(HTMLParser.Arrow_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrow_value}.
	 * @param ctx the parse tree
	 */
	void enterArrow_value(HTMLParser.Arrow_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrow_value}.
	 * @param ctx the parse tree
	 */
	void exitArrow_value(HTMLParser.Arrow_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrow_name}.
	 * @param ctx the parse tree
	 */
	void enterArrow_name(HTMLParser.Arrow_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrow_name}.
	 * @param ctx the parse tree
	 */
	void exitArrow_name(HTMLParser.Arrow_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(HTMLParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(HTMLParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#controller_id}.
	 * @param ctx the parse tree
	 */
	void enterController_id(HTMLParser.Controller_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#controller_id}.
	 * @param ctx the parse tree
	 */
	void exitController_id(HTMLParser.Controller_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#controller_body}.
	 * @param ctx the parse tree
	 */
	void enterController_body(HTMLParser.Controller_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#controller_body}.
	 * @param ctx the parse tree
	 */
	void exitController_body(HTMLParser.Controller_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(HTMLParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(HTMLParser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(HTMLParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(HTMLParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(HTMLParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(HTMLParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(HTMLParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(HTMLParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(HTMLParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(HTMLParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HTMLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(HTMLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#go}.
	 * @param ctx the parse tree
	 */
	void enterGo(HTMLParser.GoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#go}.
	 * @param ctx the parse tree
	 */
	void exitGo(HTMLParser.GoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#before_as}.
	 * @param ctx the parse tree
	 */
	void enterBefore_as(HTMLParser.Before_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#before_as}.
	 * @param ctx the parse tree
	 */
	void exitBefore_as(HTMLParser.Before_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond(HTMLParser.For_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond(HTMLParser.For_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(HTMLParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(HTMLParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 */
	void enterMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#map_value}.
	 * @param ctx the parse tree
	 */
	void exitMap_value(HTMLParser.Map_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(HTMLParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(HTMLParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(HTMLParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(HTMLParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterStatments(HTMLParser.StatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitStatments(HTMLParser.StatmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HTMLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HTMLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(HTMLParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(HTMLParser.Object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(HTMLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(HTMLParser.ObjectContext ctx);
}