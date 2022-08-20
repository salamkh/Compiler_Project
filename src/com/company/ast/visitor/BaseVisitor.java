package com.company.ast.visitor;

import com.company.Main;
import com.company.SymbolTable.Scope;
import com.company.SymbolTable.Symbol;
import com.company.ast.nodes.Node;
import com.company.gen.HTMLParser;
import com.company.gen.HTMLParserBaseVisitor;
import com.company.ast.model.*;
import java.util.ArrayList;

public class BaseVisitor extends HTMLParserBaseVisitor {
    @Override
    public Web visitWeb(HTMLParser.WebContext ctx) {
        Web web=new Web();
        createScope();
        web.setScopeID(getCurrentScope().getId());
        for(int i=0;i<ctx.page().size();i++){
            web.getPage().add(visitPage(ctx.page().get(i)));
        }
        for(int i=0;i<ctx.controller().size();i++){
            web.getController().add(visitController(ctx.controller().get(i)));
        }
        if(ctx.session_start()!=null) {
            web.setSession_start(visitSession_start(ctx.session_start()));
            Symbol symbol = new Symbol("session_start");
            symbol.setType("String");
            symbol.setScope(getCurrentScope());
            Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);
        }
        removeScope();
        System.out.println(web.toString());
        return web;
    }
    @Override public session_start visitSession_start(HTMLParser.Session_startContext ctx) {
        session_start session_start=new session_start();
        session_start.setScopeID(getCurrentScope().getId());
        session_start.setSession_start(ctx.SESSION_START().toString().trim());
        return session_start;
    }

    @Override public session visitSession(HTMLParser.SessionContext ctx) {
        session session=new session();
        session.setScopeID(getCurrentScope().getId());
        session.setSession(ctx.SESSION().toString().trim());
        session.setArrow(ctx.ARROW().toString().trim());
        session.setName(ctx.NAME().toString().trim());
        session.setEqual(ctx.EQUAL().toString().trim());
        session.setMyObject(visitObject(ctx.object()));

        Scope.session.put(session.getName(),session.getMyObject().getObject_type().get(0));

        return session;
    }

    @Override public session_end visitSession_end(HTMLParser.Session_endContext ctx) {
        session_end session_end=new session_end();
        session_end.setScopeID(getCurrentScope().getId());
        session_end.setSession_end(ctx.SESSION_END().toString().trim());
        return session_end;
    }

    @Override public session_remove visitSession_remove(HTMLParser.Session_removeContext ctx) {
        session_remove session_remove=new session_remove();
        session_remove.setScopeID(getCurrentScope().getId());
        session_remove.setSession_remove(ctx.SESSION_REMOVE().toString().trim());
        return session_remove;
    }

    @Override
    public Page visitPage(HTMLParser.PageContext ctx) {
        Page page=new Page();
        page.setScopeID(getCurrentScope().getId());
        page.setHeader_page(visitHeader_page(ctx.header_page()));
        page.setBody_page(visitBody_page(ctx.body_page()));
        return page;
    }
    @Override public Php visitPhp(HTMLParser.PhpContext ctx) {
        Php php=new Php();
        php.setScopeID(getCurrentScope().getId());
        createScope();
        php.setgThan(ctx.GTHAN().toString().trim());
        php.setlThan(ctx.LTHAN().toString().trim());
        php.setPhp(ctx.MIX_CODE().toString().trim());

        for(int i=0;i<ctx.statments().size();i++){
            php.getStatments().add(visitStatments(ctx.statments(i)));
        }
        removeScope();
        return php;
    }

    @Override
    public Header_page visitHeader_page(HTMLParser.Header_pageContext ctx) {
        Header_page header_page=new Header_page();
        header_page.setScopeID(getCurrentScope().getId());
        header_page.setName(ctx.NAME().toString().trim());
        header_page.setPage(ctx.PAGE().toString().trim());

        Symbol symbol=new Symbol("page_name");
        symbol.setType("String");
        symbol.setValue(header_page.getName());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);
        return header_page;
    }

    @Override
    public Body_page visitBody_page(HTMLParser.Body_pageContext ctx) {
        Body_page body_page=new Body_page();
        body_page.setScopeID(getCurrentScope().getId());
        createScope();
        body_page.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        body_page.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        body_page.setHeader(ctx.HEADER().toString().trim());
        body_page.setBody(ctx.BODY().toString().trim());
        body_page.setHeader(visitHeader(ctx.header()));
        body_page.setBody(visitBody(ctx.body()));
        removeScope();
        return body_page;
    }

    @Override
    public Page_id visitPage_id(HTMLParser.Page_idContext ctx) {
        Page_id page_id=new Page_id();
        page_id.setScopeID(getCurrentScope().getId());
        page_id.setPage_id(ctx.PAGE_ID().toString().trim());
        page_id.setColon(ctx.COLON().toString().trim());
        page_id.setNumber(ctx.NUMBER().toString().trim());
        page_id.setSemicolon(ctx.SEMICOLON().toString().trim());
        Symbol symbol=new Symbol("page_id");
        symbol.setType("int");
        symbol.int_value=Integer.parseInt(page_id.getNumber());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);
        return page_id;
    }

    @Override
    public Page_id_value visitPage_id_value(HTMLParser.Page_id_valueContext ctx) {
        Page_id_value page_id_value=new Page_id_value();
        page_id_value.setScopeID(getCurrentScope().getId());
        page_id_value.setMix(ctx.MIX().toString().trim());
        return page_id_value;
    }

    @Override
    public page_link visitPage_link(HTMLParser.Page_linkContext ctx) {
        page_link page_link=new page_link();
        page_link.setScopeID(getCurrentScope().getId());
        page_link.setPage_link(ctx.PAGE_LINK().toString().trim());
        page_link.setColon(ctx.COLON().toString().trim());
        page_link.setSemicolon(ctx.SEMICOLON().toString().trim());
        page_link.setPage_id_value(visitPage_id_value(ctx.page_id_value()));

        Symbol symbol=new Symbol("page_link");
        symbol.setType("String");
        symbol.setValue(page_link.getPage_id_value().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return page_link;

           }

    @Override
    public Path visitPath(HTMLParser.PathContext ctx) {
        Path path=new Path();
        path.setScopeID(getCurrentScope().getId());
        String s=new String();
        for(int i=0;i<ctx.children.size();i++) {
            s+=ctx.children.get(i).toString().trim();
        }
        path.setPath(s);
        return path;
    }


    @Override
    public header visitHeader(HTMLParser.HeaderContext ctx) {
        header header=new header();
        header.setScopeID(getCurrentScope().getId());
        createScope();
        header.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        header.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        header.setPage_id(visitPage_id(ctx.page_id()));
        header.setPage_link(visitPage_link(ctx.page_link()));
        removeScope();
        return header;
    }
//10
    @Override
    public Body visitBody(HTMLParser.BodyContext ctx) {
        Body body=new Body();
        body.setScopeID(getCurrentScope().getId());
        createScope();
        body.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        body.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        ArrayList<Node> elements=new ArrayList<Node>();
        for(int i=0;i<ctx.form().size();i++){
          elements.add(visitForm(ctx.form(i)));
        }
        for(int i=0;i<ctx.out().size();i++){
            elements.add(visitOut(ctx.out(i)));
        }
        for(int i=0;i<ctx.link().size();i++){
            elements.add(visitLink(ctx.link(i)));
        }
        for(int i=0;i<ctx.php().size();i++){
            elements.add(visitPhp(ctx.php(i)));
        }
        body.setElements(elements);
        removeScope();
        return body;
    }

    @Override
    public link_name visitLink_name(HTMLParser.Link_nameContext ctx) {
        link_name link_name=new link_name();
        link_name.setScopeID(getCurrentScope().getId());
        link_name.setOpen(ctx.OPEN().toString().trim());
        link_name.setClose(ctx.CLOSE().toString().trim());
        link_name.setLink_name(ctx.LINK_NAME().toString().trim());
        link_name.setName(ctx.NAME().toString().trim());
        return link_name;
    }

    @Override
    public link_href visitLink_href(HTMLParser.Link_hrefContext ctx) {
        link_href link_href=new link_href();
        link_href.setScopeID(getCurrentScope().getId());
        link_href.setOpen(ctx.OPEN().toString().trim());
        link_href.setClose(ctx.CLOSE().toString().trim());
        link_href.setString(ctx.STRING().toString().trim());
        link_href.setHref(ctx.HREF().toString().trim());
        return link_href;
    }

    @Override
    public Link visitLink(HTMLParser.LinkContext ctx) {
        Link link=new Link();
        link.setScopeID(getCurrentScope().getId());
        link.setColon(ctx.COLON().toString().trim());
        link.setSemicolon(ctx.SEMICOLON().toString().trim());
        link.setComma(ctx.COMMA().toString().trim());
        link.setLink(ctx.LINK().toString().trim());
        link.setLink_name(visitLink_name(ctx.link_name()));
        link.setLink_href(visitLink_href(ctx.link_href()));
        return link;
    }

    @Override
    public field visitField(HTMLParser.FieldContext ctx) {
        field field=new field();
        field.setScopeID(getCurrentScope().getId());
        field.setOpen(ctx.OPEN().toString().trim());
        field.setClose(ctx.CLOSE().toString().trim());
        field.setField(ctx.FIELD().toString().trim());
        if(ctx.text()!=null)
        field.setText(visitText(ctx.text()));
        if(ctx.email()!=null)
        field.setEmail(visitEmail(ctx.email()));
        if(ctx.button()!=null)
        field.setButton(visitButton(ctx.button()));
        if(ctx.check_box()!=null)
        field.setCheck_box(visitCheck_box(ctx.check_box()));
        if(ctx.date()!=null)
        field.setDate(visitDate(ctx.date()));
        if(ctx.select()!=null)
        field.setSelect(visitSelect(ctx.select()));
        if(ctx.file()!=null)
        field.setFile(visitFile(ctx.file()));
        if(ctx.number()!=null)
        field.setNumber(visitNumber(ctx.number()));
        if(ctx.password()!=null)
        field.setPasswords(visitPassword(ctx.password()));
        if(ctx.phone_number()!=null)
        field.setPhone_number(visitPhone_number(ctx.phone_number()));
        if(ctx.radio()!=null)
        field.setRadio(visitRadio(ctx.radio()));
        return field;
    }

    @Override
    public in visitIn(HTMLParser.InContext ctx) {
        in in=new in();
        in.setScopeID(getCurrentScope().getId());
        in.setColon(ctx.COLON().toString().trim());
        in.setSemicolon(ctx.SEMICOLON().toString().trim());
        in.setIn(ctx.IN().toString().trim());
        in.setField(visitField(ctx.field()));
        return in;
    }

    @Override
    public form visitForm(HTMLParser.FormContext ctx) {
        form form=new form();
        form.setScopeID(getCurrentScope().getId());
        createScope();
        form.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        form.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        form.setForm(ctx.FORM().toString().trim());
        for(int i=0;i<ctx.in().size();i++){
            form.getIn().add(visitIn(ctx.in(i)));
        }
        removeScope();
        return form;
    }

    @Override
    public Text_value visitText_value(HTMLParser.Text_valueContext ctx) {
        Text_value text_value=new Text_value();
        text_value.setScopeID(getCurrentScope().getId());
        text_value.setText_value(ctx.children.get(0).toString().trim());
        return text_value;
    }

    @Override
    public Text visitText(HTMLParser.TextContext ctx) {
        Text text=new Text();
        text.setScopeID(getCurrentScope().getId());
        text.setName(ctx.NAME().toString().trim());
        text.setComma(ctx.COMMA().toString().trim());
        text.setText(ctx.TEXT().toString().trim());
        text.setText_value(visitText_value(ctx.text_value()));

        Symbol symbol=new Symbol(text.getName());
        symbol.setType("String");
        symbol.setValue(text.getText_value().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return text;
    }

    @Override
    public Strings visitStrings(HTMLParser.StringsContext ctx) {
        Strings strings=new Strings();
        strings.setScopeID(getCurrentScope().getId());
        String s=new String();
        for(int i=0;i<ctx.children.size();i++){
            s+=ctx.children.get(i).toString().trim();
        }
        strings.setString(s);

        return strings;
    }
//20
    @Override
    public email_value visitEmail_value(HTMLParser.Email_valueContext ctx) {
        email_value email_value=new email_value();
        email_value.setScopeID(getCurrentScope().getId());
        String s=new String();
        for(int i=0;i<ctx.children.size();i++){
            s+=ctx.children.get(i).toString().trim();
        }
        email_value.setEmail_value(s);
        return email_value;
    }

    @Override
    public email visitEmail(HTMLParser.EmailContext ctx) {
        email email=new email();
        email.setScopeID(getCurrentScope().getId());
        email.setName(ctx.NAME().toString().trim());
        email.setComma(ctx.COMMA().get(0).toString().trim());
        email.setEmail(ctx.EMAIL().toString().trim());
        email.setEmail_value(visitEmail_value(ctx.email_value()));

        Symbol symbol=new Symbol(email.getName());
        symbol.setType("String");
        symbol.setValue(email.getEmail_value().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return email;
    }

    @Override
    public Password visitPassword(HTMLParser.PasswordContext ctx) {
        Password password=new Password();
        password.setScopeID(getCurrentScope().getId());
        password.setName(ctx.NAME().toString().trim());
        password.setComma(ctx.COMMA().get(0).toString().trim());
        password.setPassword(ctx.PASSWORD().toString().trim());
        password.setPassword_value(ctx.PASSWORD_VALUE().toString().trim());

        Symbol symbol=new Symbol(password.getName());
        symbol.setType("String");
        symbol.setValue(password.getPassword_value());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return password;
    }

    @Override
    public number visitNumber(HTMLParser.NumberContext ctx) {
        number number=new number();
        number.setScopeID(getCurrentScope().getId());
        number.setName(ctx.NAME().toString().trim());
        number.setComma(ctx.COMMA().get(0).toString().trim());
        number.setForm_number(ctx.FORM_NUMBER().toString().trim());
        number.setNumber(ctx.NUMBER().toString().trim());

        Symbol symbol=new Symbol(number.getName());
        symbol.setType("int");
        symbol.int_value=Integer.parseInt(number.getNumber());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return number;
    }

    @Override
    public Phone_number visitPhone_number(HTMLParser.Phone_numberContext ctx) {
        Phone_number phone_number=new Phone_number();
        phone_number.setScopeID(getCurrentScope().getId());
        phone_number.setName(ctx.NAME().toString().trim());
        phone_number.setComma(ctx.COMMA().get(0).toString().trim());
        phone_number.setPhone_number(ctx.PHONE_NUMBER().toString().trim());
        phone_number.setNumber(ctx.NUMBER().toString().trim());

        Symbol symbol=new Symbol(phone_number.getName());
        symbol.setType("int");
        symbol.int_value=Integer.parseInt(phone_number.getNumber());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return phone_number;
    }

    @Override
    public file visitFile(HTMLParser.FileContext ctx) {
        file file=new file();
        file.setScopeID(getCurrentScope().getId());
        file.setName(ctx.NAME().toString().trim());
        file.setComma(ctx.COMMA().get(0).toString().trim());
        file.setFile(ctx.FILE().toString().trim());
        file.setPath(visitPath(ctx.path()));

        Symbol symbol=new Symbol(file.getName());
        symbol.setType("String");
        symbol.setValue(file.getPath().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return file;
    }

    @Override
    public date visitDate(HTMLParser.DateContext ctx) {
        date date=new date();
        date.setScopeID(getCurrentScope().getId());
        date.setName(ctx.NAME().toString().trim());
        date.setComma(ctx.COMMA().get(0).toString().trim());
        date.setDate(ctx.DATE().toString().trim());
        date.setDate_value(ctx.DATE_VAlUE().toString().trim());

        Symbol symbol=new Symbol(date.getName());
        symbol.setType("date");
        symbol.setValue(date.getDate_value());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return date;
    }

    @Override
    public radio visitRadio(HTMLParser.RadioContext ctx) {
        radio radio=new radio();
        radio.setScopeID(getCurrentScope().getId());
        radio.setName(ctx.NAME().toString().trim());
        radio.setComma(ctx.COMMA().get(0).toString().trim());
        radio.setRadio(ctx.RADIO().toString().trim());
        radio.setBoolean_value(visitBoolean_value(ctx.boolean_value()));

        Symbol symbol=new Symbol(radio.getName());
        symbol.setType("boolean");
        symbol.setValue(radio.getBoolean_value().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return radio;
    }

    @Override
    public button visitButton(HTMLParser.ButtonContext ctx) {
        button button=new button();
        button.setScopeID(getCurrentScope().getId());
        button.setSubmit(ctx.SUBMIT().toString().trim());
        button.setComma(ctx.COMMA().get(0).toString().trim());
        button.setButton(ctx.BUTTON().toString().trim());
        if(ctx.function()!=null)
        button.setFunction(visitFunction(ctx.function()));

        return button;
    }

    @Override
    public element visitElement(HTMLParser.ElementContext ctx) {
        element element=new element();
        element.setScopeID(getCurrentScope().getId());
        if(ctx.STRING()!=null) {
            element.setString(ctx.STRING().toString().trim());
        }
        if(ctx.NUMBER()!=null) {
            element.setNumber(ctx.NUMBER().toString().trim());
        }
        if(ctx.NAME()!=null) {
            element.setName(ctx.NAME().toString().trim());
        }
        if(ctx.CHAR()!=null) {
            element.setaChar(ctx.CHAR().toString().trim());
        }
        return element;
    }
//30
    @Override
    public MyArray visitArray(HTMLParser.ArrayContext ctx) {
        MyArray array=new MyArray();
        array.setScopeID(getCurrentScope().getId());
        if(ctx.ARRAY_OPEN()!=null)
        array.setARRAY_OPEN(ctx.ARRAY_OPEN().toString().trim());
        if(ctx.ARRAY_CLOSE()!=null)
        array.setARRAY_CLOSE(ctx.ARRAY_CLOSE().toString().trim());
        if(ctx.COMMA()!=null && ctx.COMMA().size()>0)
        array.setComma(ctx.COMMA().get(0).toString().trim());
        if(ctx.element()!=null)
        for(int i=0;i<ctx.element().size();i++){
            array.getElement().add(visitElement(ctx.element(i)));
        }

        return array;
    }

    @Override
    public Check_box visitCheck_box(HTMLParser.Check_boxContext ctx) {
        Check_box check_box=new Check_box();
        check_box.setScopeID(getCurrentScope().getId());
        check_box.setCheck_box(ctx.CHECKBOX().toString().trim());
        check_box.setComma(ctx.COMMA().get(0).toString().trim());
        check_box.setCheck_box_array(visitArray(ctx.array().get(0)));
        check_box.setValue_array(visitArray(ctx.array().get(1)));


        Symbol symbol=new Symbol("check_box");
        symbol.setType("array");
        symbol.array_value=new ArrayList<element>();
        symbol.setArray_value(check_box.getValue_array().getElement());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return check_box;
    }

    @Override
    public Select visitSelect(HTMLParser.SelectContext ctx) {
        Select select=new Select();
        select.setScopeID(getCurrentScope().getId());
        select.setSelect(ctx.SELECT().toString().trim());
        select.setComma(ctx.COMMA().get(0).toString().trim());
        select.setName(ctx.NAME().toString().trim());
        select.setArray(visitArray(ctx.array()));
        select.setMyObject(visitObject(ctx.object()));

        Symbol symbol=new Symbol(select.getName());
        symbol.setType("String");
        symbol.setValue(select.getMyObject().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return select;
    }

    @Override
    public out visitOut(HTMLParser.OutContext ctx) {
        out out=new out();
        out.setScopeID(getCurrentScope().getId());
        out.setOut(ctx.OUT().toString().trim());
        out.setColon(ctx.COLON().toString().trim());
        out.setSemicolon(ctx.SEMICOLON().toString().trim());
        if(ctx.image()!=null)
        out.setImage(visitImage(ctx.image()));
        if(ctx.audio()!=null)
        out.setAudio(visitAudio(ctx.audio()));
        if(ctx.video()!=null)
        out.setVedio(visitVideo(ctx.video()));
        if(ctx.out_button()!=null)
        out.setOut_button(visitOut_button(ctx.out_button()));
        if(ctx.out_text()!=null)
        out.setOut_text(visitOut_text(ctx.out_text()));
        return out;
    }

    @Override
    public image visitImage(HTMLParser.ImageContext ctx) {
        image image=new image();
        image.setScopeID(getCurrentScope().getId());
        image.setImg(ctx.IMG().toString().trim());
        image.setOpen(ctx.OPEN().toString().trim());
        image.setClose(ctx.CLOSE().toString().trim());
        image.setPath(visitPath(ctx.path()));

        Symbol symbol=new Symbol("image");
        symbol.setType("String");
        symbol.setValue(image.getPath().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return image;
    }
//35
    @Override
    public vedio visitVideo(HTMLParser.VideoContext ctx) {
        vedio vedio=new vedio();
        vedio.setScopeID(getCurrentScope().getId());
        vedio.setVideo(ctx.VIDEO().toString().trim());
        vedio.setOpen(ctx.OPEN().toString().trim());
        vedio.setClose(ctx.CLOSE().toString().trim());
        vedio.setPath(visitPath(ctx.path()));

        Symbol symbol=new Symbol("vedio");
        symbol.setType("String");
        symbol.setValue(vedio.getPath().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return vedio;
    }

    @Override
    public audio visitAudio(HTMLParser.AudioContext ctx) {
        audio audio=new audio();
        audio.setScopeID(getCurrentScope().getId());
        audio.setAudio(ctx.AUDIO().toString().trim());
        audio.setOpen(ctx.OPEN().toString().trim());
        audio.setClose(ctx.CLOSE().toString().trim());
        audio.setPath(visitPath(ctx.path()));

        Symbol symbol=new Symbol("audio");
        symbol.setType("String");
        symbol.setValue(audio.getPath().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return audio;
    }

    @Override
    public on_click visitOn_click(HTMLParser.On_clickContext ctx) {
        on_click on_click=new on_click();
        on_click.setScopeID(getCurrentScope().getId());
        on_click.setOn_click(ctx.ON_CLICK().toString().trim());
        return on_click;
    }

    @Override
    public double_click visitDouble_click(HTMLParser.Double_clickContext ctx) {
        double_click double_click=new double_click();
        double_click.setScopeID(getCurrentScope().getId());
        double_click.setDouble_click(ctx.DOUBLE_CLICK().toString().trim());
        return double_click;
    }

    @Override
    public event visitEvent(HTMLParser.EventContext ctx) {
        event event=new event();
        event.setScopeID(getCurrentScope().getId());
        if(ctx.on_click()!=null)
        event.setOn_click(visitOn_click(ctx.on_click()));
        if(ctx.double_click()!=null)
        event.setDouble_click(visitDouble_click(ctx.double_click()));
        return event;
    }

    @Override
    public button_body visitButton_body(HTMLParser.Button_bodyContext ctx) {
        button_body button_body=new button_body();
        button_body.setScopeID(getCurrentScope().getId());
        button_body.setFunction(visitFunction(ctx.function()));

        return button_body;
    }

    @Override
    public out_button visitOut_button(HTMLParser.Out_buttonContext ctx) {
        out_button out_button=new out_button();
        out_button.setScopeID(getCurrentScope().getId());
        out_button.setOut_button(ctx.BUTTON().toString().trim());
        out_button.setOpen(ctx.OPEN().toString().trim());
        out_button.setClose(ctx.CLOSE().toString().trim());
        out_button.setComma(ctx.COMMA().toString().trim());
        out_button.setEvent(visitEvent(ctx.event()));
        out_button.setButton_body(visitButton_body(ctx.button_body()));

        return out_button;
    }

    @Override
    public out_text visitOut_text(HTMLParser.Out_textContext ctx) {
        out_text out_text=new out_text();
        out_text.setScopeID(getCurrentScope().getId());
        out_text.setOut_text(ctx.OUT_TEXT().toString().trim());
        out_text.setOpen(ctx.OPEN().toString().trim());
        out_text.setClose(ctx.CLOSE().toString().trim());
        out_text.setObject_type(visitObject_type(ctx.object_type()));

        return out_text;
    }
//42
    @Override
    public function_empty visitFunction_empty(HTMLParser.Function_emptyContext ctx) {
        function_empty function_empty=new function_empty();
        function_empty.setScopeID(getCurrentScope().getId());
        function_empty.setOpen(ctx.OPEN().toString().trim());
        function_empty.setClose(ctx.CLOSE().toString().trim());
        function_empty.setFunction_name(visitFunction_name(ctx.function_name()));

        return function_empty;
    }

    @Override
    public function_with_arg visitFunction_with_arg(HTMLParser.Function_with_argContext ctx) {
        function_with_arg function_with_arg=new function_with_arg();
        function_with_arg.setScopeID(getCurrentScope().getId());
        function_with_arg.setOpen(ctx.OPEN().toString().trim());
        function_with_arg.setClose(ctx.CLOSE().toString().trim());
        function_with_arg.setFunction_name(visitFunction_name(ctx.function_name()));
        function_with_arg.setFunction_argument(visitFunction_argument(ctx.function_argument()));

        return function_with_arg;
    }

    @Override
    public function visitFunction(HTMLParser.FunctionContext ctx) {
        function function=new function();
        function.setScopeID(getCurrentScope().getId());
        if(ctx.function_empty()!=null)
        function.setFunction_empty(visitFunction_empty(ctx.function_empty()));
        if(ctx.function_with_arg()!=null)
        function.setFunction_with_arg(visitFunction_with_arg(ctx.function_with_arg()));
        return function;
    }

    @Override
    public function_name visitFunction_name(HTMLParser.Function_nameContext ctx) {
        function_name function_name=new function_name();
        function_name.setScopeID(getCurrentScope().getId());
        if(ctx.PRINT_FUNCTION()!=null)
            function_name.setFunction_name(ctx.PRINT_FUNCTION().toString().trim());
        if(ctx.NAME()!=null)
            function_name.setFunction_name(ctx.NAME().toString().trim());

        return function_name;
    }

    @Override
    public arrow_key visitArrow_key(HTMLParser.Arrow_keyContext ctx) {
        arrow_key arrow_key=new arrow_key();
        arrow_key.setScopeID(getCurrentScope().getId());
        arrow_key.setName(ctx.NAME().toString().trim());
        arrow_key.setArrow(ctx.ARROW().toString().trim());
        arrow_key.setKey(ctx.KEY().toString().trim());

        return arrow_key;
    }

    @Override
    public arrow_value visitArrow_value(HTMLParser.Arrow_valueContext ctx) {
        arrow_value arrow_value=new arrow_value();
        arrow_value.setScopeID(getCurrentScope().getId());
        arrow_value.setName(ctx.NAME().toString().trim());
        arrow_value.setArrow(ctx.ARROW().toString().trim());
        arrow_value.setValue(ctx.VALUE().toString().trim());

        return arrow_value;
    }

    @Override
    public arrow_name visitArrow_name(HTMLParser.Arrow_nameContext ctx) {
        arrow_name arrow_name=new arrow_name();
        arrow_name.setScopeID(getCurrentScope().getId());
        if(ctx.FORM()!=null)
            arrow_name.setKey_name(ctx.FORM().toString().trim());
        else if(ctx.function()!=null)
            arrow_name.setFunction(visitFunction(ctx.function()));
        else if(ctx.SESSION()!=null)
            arrow_name.setSession(ctx.SESSION().toString().trim());
        else
            arrow_name.setKey_name(ctx.NAME().get(0).toString().trim());
        arrow_name.setArrow(ctx.ARROW().toString().trim());

        arrow_name.setValue_name(ctx.NAME().get(ctx.NAME().size()-1).toString().trim());


        return arrow_name;
    }

    @Override
    public arrow visitArrow(HTMLParser.ArrowContext ctx) {
        arrow arrow=new arrow();
        arrow.setScopeID(getCurrentScope().getId());
        if(ctx.arrow_key()!=null)
            arrow.setKey(visitArrow_key(ctx.arrow_key()));
        if(ctx.arrow_value()!=null)
            arrow.setValue(visitArrow_value(ctx.arrow_value()));
        if(ctx.arrow_name()!=null)
            arrow.setArrow_name(visitArrow_name(ctx.arrow_name()));
        return arrow;
    }

    @Override
    public function_argument visitFunction_argument(HTMLParser.Function_argumentContext ctx) {
        function_argument function_argument=new function_argument();
        function_argument.setScopeID(getCurrentScope().getId());
        if(ctx.COMMA()!=null&& ctx.COMMA().size()>0)
        function_argument.setComma(ctx.COMMA().get(0).toString().trim());
        for(int i=0;i<ctx.object_type().size();i++){
            function_argument.getObject_type().add(visitObject_type(ctx.object_type(i)));
        }
        return function_argument;
    }

    @Override
    public Controller_id visitController_id(HTMLParser.Controller_idContext ctx) {
        Controller_id controller_id=new Controller_id();
        controller_id.setScopeID(getCurrentScope().getId());
        controller_id.setController(ctx.CONTROLLER().toString().trim());
        controller_id.setControl(ctx.CONTROLE().toString().trim());
        controller_id.setController_name(ctx.NAME().get(0).toString().trim());
        controller_id.setPage_name(ctx.NAME().get(1).toString().trim());

        Symbol symbol=new Symbol("controller_name");
        symbol.setType("String");
        symbol.setValue(controller_id.getController_name());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        Symbol symbol1=new Symbol("page_controle_name");
        symbol1.setType("String");
        symbol1.setValue(controller_id.getPage_name());
        symbol1.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol1);

        return controller_id;
    }
//52
    @Override
    public Controller_body visitController_body(HTMLParser.Controller_bodyContext ctx) {
        Controller_body controller_body=new Controller_body();
        controller_body.setScopeID(getCurrentScope().getId());
        if(ctx.function_body()!=null)
        controller_body.setFunction_body(visitFunction_body(ctx.function_body()));
        if(ctx.statments()!=null)
        controller_body.setStatments(visitStatments(ctx.statments()));
        return controller_body;
    }

    @Override
    public Controller visitController(HTMLParser.ControllerContext ctx) {
        Controller controller=new Controller();
        createScope();
        controller.setScopeID(getCurrentScope().getId());
        controller.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        controller.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        controller.setController_id(visitController_id(ctx.controller_id()));

        for(int i=0;i<ctx.controller_body().size();i++){
            controller.getController_body().add(visitController_body(ctx.controller_body().get(i)));
        }
        removeScope();
        return controller;
    }

    @Override
    public Function_body visitFunction_body(HTMLParser.Function_bodyContext ctx) {
        Function_body function_body=new Function_body();
        function_body.setScopeID(getCurrentScope().getId());
        createScope();
        function_body.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        function_body.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        function_body.setFun(ctx.FUNCTION().toString().trim());
        function_body.setFunction(visitFunction(ctx.function()));
        if(ctx.statments()!=null)
        for(int i=0;i<ctx.statments().size();i++) {
            function_body.getStatments().add(visitStatments(ctx.statments().get(i)));
        }
        if(ctx.function_return()!=null)
        function_body.setFunction_return(visitFunction_return(ctx.function_return()));

        String s=new String();
        if(function_body.getFunction().getFunction_empty()!=null)
            s=function_body.getFunction().getFunction_empty().getFunction_name().toString();
        else if(function_body.getFunction().getFunction_with_arg()!=null)
            s=function_body.getFunction().getFunction_with_arg().getFunction_name().toString();

        Symbol symbol=new Symbol(s);
        if(ctx.function_return()!=null)
        symbol.setValue(function_body.getFunction_return().getObject_type().toString());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        removeScope();
        return function_body;
    }

    @Override
    public Boolean_value visitBoolean_value(HTMLParser.Boolean_valueContext ctx) {
        Boolean_value boolean_value=new Boolean_value();
        boolean_value.setScopeID(getCurrentScope().getId());
        if(ctx.TRUE()!=null)
            boolean_value.setValue(true);
        else
            boolean_value.setValue(false);
        return boolean_value;
    }


    @Override
    public Function_return visitFunction_return(HTMLParser.Function_returnContext ctx) {
        Function_return function_return=new Function_return();
        function_return.setScopeID(getCurrentScope().getId());
        function_return.setReTurn(ctx.RETURN().toString().trim());
        function_return.setSEMICOLON(ctx.SEMICOLON().toString().trim());
        function_return.setObject_type(visitObject_type(ctx.object_type()));
        return function_return;
    }

    @Override
    public If_rule visitIf_rule(HTMLParser.If_ruleContext ctx) {
        If_rule if_rule=new If_rule();
        if_rule.setScopeID(getCurrentScope().getId());
        if_rule.setOpen(ctx.OPEN().toString().trim());
        if_rule.setClose(ctx.CLOSE().toString().trim());
        if_rule.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        if_rule.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        if_rule.setIf_name(ctx.IF().toString().trim());
        if_rule.setCondition(visitCondition(ctx.condition()));
        createScope();
        if(ctx.statments()!=null)
        for(int i=0;i<ctx.statments().size();i++) {
            if_rule.getStatments().add(visitStatments(ctx.statments().get(i)));
        }
        removeScope();
        return if_rule;
    }
//60

    @Override
    public Operator visitOperator(HTMLParser.OperatorContext ctx) {
        Operator operator=new Operator();
        operator.setScopeID(getCurrentScope().getId());
        if(ctx.EQUAL().size()==2)
        {
            operator.setOperator("==");
        }
        else if(ctx.EQUAL().size()==1){
            if(ctx.GTHAN()!=null){
                operator.setOperator(">=");
            }
            else if(ctx.LTHAN()!=null){
                operator.setOperator("<=");
            }
            else if (ctx.NOTEQUAL()!=null){
                operator.setOperator("!=");
            }
        }
        else{
            if(ctx.GTHAN()!=null){
                operator.setOperator(">");
            }
            else if(ctx.LTHAN()!=null){
                operator.setOperator("<");
            }
        }
        return operator;
    }


    @Override
    public Condition visitCondition(HTMLParser.ConditionContext ctx) {
        Condition condition=new Condition();
        condition.setScopeID(getCurrentScope().getId());
        condition.setMyObject1(visitObject(ctx.object().get(0)));
        condition.setMyObject2(visitObject(ctx.object().get(1)));
        condition.setOperator(visitOperator(ctx.operator()));
        return condition;
    }

    @Override
    public Go visitGo(HTMLParser.GoContext ctx) {
        Go go=new Go();
        go.setScopeID(getCurrentScope().getId());
        go.setGo(ctx.GO().toString().trim());
        go.setPath(visitPath(ctx.path()));

        Symbol symbol=new Symbol("go_page");
        symbol.setType("String");
        symbol.setValue(go.getPath().getPath());
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return go;
    }

    @Override
    public Statments visitStatments(HTMLParser.StatmentsContext ctx) {
        Statments statments=new Statments();
            statments.setScopeID(getCurrentScope().getId());
        if(ctx.SEMICOLON()!=null)
            statments.setSemicolon(ctx.SEMICOLON().toString().trim());
        if(ctx.go()!=null)
            statments.setGo(visitGo(ctx.go()));
        if(ctx.if_rule()!=null)
            statments.setIf_rule(visitIf_rule(ctx.if_rule()));
        if(ctx.foreach()!=null)
            statments.setForeach(visitForeach(ctx.foreach()));
        if(ctx.function()!=null)
            statments.setFunction(visitFunction(ctx.function()));
        if(ctx.var()!=null)
            statments.setVar(visitVar(ctx.var()));
        if(ctx.out()!=null)
            statments.setOut(visitOut(ctx.out()));
        if(ctx.session()!=null) {
            statments.setSession(visitSession(ctx.session()));
            Symbol symbol = new Symbol("session");
            symbol.setType("String");
            symbol.setScope(getCurrentScope());
            Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);
        }
        if(ctx.session_end()!=null) {
            statments.setSession_end(visitSession_end(ctx.session_end()));
            Symbol symbol = new Symbol("session_end");
            symbol.setType("String");
            symbol.setScope(getCurrentScope());
            Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);
        }
        if(ctx.session_remove()!=null) {
            statments.setSession_remove(visitSession_remove(ctx.session_remove()));
            Symbol symbol = new Symbol("session_remove");
            symbol.setType("String");
            symbol.setScope(getCurrentScope());
            Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        }
        return statments;
    }
//72
    @Override
    public Before_as visitBefore_as(HTMLParser.Before_asContext ctx) {
        Before_as before_as=new Before_as();
        before_as.setScopeID(getCurrentScope().getId());
        if(ctx.array()!=null)
        before_as.setArray(visitArray(ctx.array()));
        if(ctx.strings()!=null)
        before_as.setStrings(visitStrings(ctx.strings()));
        return before_as;
    }

    @Override
    public For_cond visitFor_cond(HTMLParser.For_condContext ctx) {
        For_cond for_cond=new For_cond();
        for_cond.setScopeID(getCurrentScope().getId());
        for_cond.setOpen(ctx.OPEN().toString().trim());
        for_cond.setClose(ctx.CLOSE().toString().trim());
        for_cond.setAs(ctx.AS().toString().trim());
        for_cond.setBefore_as(visitBefore_as(ctx.before_as()));
        for_cond.setIterator(visitStrings(ctx.strings()));


        Symbol symbol=new Symbol(for_cond.getIterator().getString());
        symbol.setType("Map");
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return for_cond;
    }

    @Override
    public Foreach visitForeach(HTMLParser.ForeachContext ctx) {
        Foreach foreach=new Foreach();
        foreach.setScopeID(getCurrentScope().getId());
        foreach.setBlock_open(ctx.BLOCK_OPEN().toString().trim());
        foreach.setBlock_close(ctx.BLOCK_CLOSE().toString().trim());
        foreach.setForeach(ctx.LOOP().toString().trim());
        foreach.setFor_cond(visitFor_cond(ctx.for_cond()));
        createScope();
        for(int i=0;i<ctx.statments().size();i++) {
            foreach.getStatments().add(visitStatments(ctx.statments().get(i)));
        }
        removeScope();
        return foreach;
    }

    @Override
    public Var visitVar(HTMLParser.VarContext ctx) {
        Var var=new Var();
        var.setScopeID(getCurrentScope().getId());
        if(ctx.VAR()!=null)
            var.setVar(ctx.VAR().toString().trim());
            var.setVar_name(visitStrings(ctx.strings()));
        if(ctx.strings()!=null)
            var.setVar_name(visitStrings(ctx.strings()));
        if(ctx.object()!=null)
            var.setMyObject(visitObject(ctx.object()));

        var.setEqual(ctx.EQUAL().toString().trim());
        var.setSemicolon(ctx.SEMICOLON().toString().trim());

        Symbol symbol=new Symbol(var.getVar_name().toString());
        if(ctx.VAR()!=null)
            symbol.is_NewVar=true;
        else if (ctx.strings()!=null)
            symbol.is_var=true;

        if(var.getMyObject()!=null ) {
            symbol.setType(var.getMyObject().getObject_type().get(0).getType());
            symbol.setValue(var.getMyObject().getObject_type().get(0).toString());
        }
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return var;
    }

    @Override
    public Map_value visitMap_value(HTMLParser.Map_valueContext ctx) {
        Map_value map_value=new Map_value();
        map_value.setScopeID(getCurrentScope().getId());
        if(ctx.STRING()!=null)
            map_value.setString(ctx.STRING().toString().trim());
        if(ctx.NUMBER()!=null)
            map_value.setNumber(ctx.NUMBER().toString().trim());
        if(ctx.NAME()!=null)
            map_value.setNumber(ctx.NAME().toString().trim());
        if(ctx.email_value()!=null)
            map_value.setEmail_value(visitEmail_value(ctx.email_value()));
        if(ctx.array()!=null)
            map_value.setArray(visitArray(ctx.array()));
        if(ctx.arrow()!=null)
            map_value.setArrow(visitArrow(ctx.arrow()));
        if(ctx.CHAR()!=null)
            map_value.setaChar(ctx.CHAR().toString().trim());
        if(ctx.email_value()!=null)
            map_value.setEmail_value(visitEmail_value(ctx.email_value()));
        return map_value;
    }
////////////////////////////////////////////////////////////////////
    @Override
    public Map_element visitMap_element(HTMLParser.Map_elementContext ctx) {
        Map_element map_element=new Map_element();
        map_element.setScopeID(getCurrentScope().getId());
        if(ctx.NAME()!=null)
        map_element.setKey(ctx.NAME().toString().trim());
        if(ctx.COLON()!=null)
        map_element.setColon(ctx.COLON().toString().trim());
        if(ctx.map_value()!=null)
        map_element.setMap_value(visitMap_value(ctx.map_value()));
        if(ctx.map()!=null)
        map_element.setMyMap(visitMap(ctx.map()));

        Symbol symbol=new Symbol(map_element.getKey());
        if(map_element.getMap_value().getaChar()!=null) {
            symbol.setType("char");
            symbol.setValue(map_element.getMap_value().toString());
        }
        else if(map_element.getMap_value().getArray()!=null) {
            symbol.setType("Array");
            symbol.setValue(map_element.getMap_value().toString());
        }
        else if(map_element.getMap_value().getBoolean_value()!=null) {
            symbol.setType("boolean");
            symbol.setValue(map_element.getMap_value().toString());
        }
        else if(map_element.getMap_value().getNumber()!=null) {
            symbol.setType("double");
            symbol.setValue(map_element.getMap_value().toString());
        }
        else if(map_element.getMap_value().getString()!=null || map_element.getMap_value().getEmail_value()!=null) {
            symbol.setType("String");
            symbol.setValue(map_element.getMap_value().toString());
        }
        else if(map_element.getMap_value().getName()!=null) {
            symbol.setType("var");
            symbol.setValue(map_element.getMap_value().toString());
        }
        symbol.setScope(getCurrentScope());
        Main.symbolTable.getScopeByID(getCurrentScope().getId()).addSymbol(symbol);

        return map_element;
    }

    @Override
    public MyMap visitMap(HTMLParser.MapContext ctx) {
        MyMap myMap=new MyMap();
        myMap.setScopeID(getCurrentScope().getId());
        myMap.setBLOCK_OPEN(ctx.BLOCK_OPEN().toString().trim());
        myMap.setBLOCK_CLOSE(ctx.BLOCK_CLOSE().toString().trim());
        if(ctx.COMMA()!=null)
        myMap.setComma(ctx.COMMA().get(0).toString().trim());
        if(ctx.map_element()!=null)
        for(int i=0;i<ctx.map_element().size();i++){
            myMap.getMap_element().add(visitMap_element(ctx.map_element().get(i)));
        }
        return myMap;
    }

    @Override
    public Object_type visitObject_type(HTMLParser.Object_typeContext ctx) {
        Object_type object_type =new Object_type();
        object_type.setScopeID(getCurrentScope().getId());
        if(ctx.NUMBER()!=null) {
            object_type.setNumber(ctx.NUMBER().toString().trim());
            object_type.setType("double");
        }
        if(ctx.CHAR()!=null) {
            object_type.setaChar(ctx.CHAR().toString().trim());
            object_type.setType("char");
        }
        if(ctx.STRING()!=null) {
            object_type.setString(ctx.STRING().toString().trim());
            object_type.setType("String");
        }
        if(ctx.NAME()!=null) {
            object_type.setName(ctx.NAME().toString().trim());
            object_type.setType("Var");
        }
        if(ctx.boolean_value()!=null) {
            object_type.setBoolean_value(visitBoolean_value(ctx.boolean_value()));
            object_type.setType("boolean");
        }
        if(ctx.array()!=null) {
            object_type.setArray(visitArray(ctx.array()));
            object_type.setType("array");
        }
        if(ctx.map()!=null) {
            object_type.setMap(visitMap(ctx.map()));
            object_type.setType("map");
        }
        if(ctx.function()!=null) {
            object_type.setFunction(visitFunction(ctx.function()));
            object_type.setType("function");
        }
        if(ctx.arrow()!=null) {
            object_type.setArrow(visitArrow(ctx.arrow()));
            object_type.setType("arrow");
        }
        return object_type;
    }

    @Override
    public MyObject visitObject(HTMLParser.ObjectContext ctx) {
        MyObject myObject=new MyObject();
        myObject.setScopeID(getCurrentScope().getId());
        if(ctx.DOT()!=null && ctx.DOT().size()>0)
        myObject.setDot(ctx.DOT().get(0).toString().trim());
        for(int i=0;i<ctx.object_type().size();i++){
            myObject.getObject_type().add(visitObject_type(ctx.object_type().get(i)));
        }
        return myObject;
    }
    ////////////////////////////////////////////
    private void createScope() {

        System.out.println("Create New Scope");
        Scope scope;
        if (Main.symbolTable.getScopeStack().isEmpty()) {
            scope = new Scope(null);
        } else {
            Scope parntScope1 = Main.symbolTable.getScopeStack().peek();
            scope = new Scope(parntScope1);
        }

        Main.symbolTable.getScopeStack().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    public static void removeScope() {
        Main.symbolTable.getScopeStack().pop();
        //Scope.DecScopeCount();
        System.out.println("remove Scope from scope stack");
    }

    private Scope getCurrentScope() {
        if (Main.symbolTable.getScopeStack().isEmpty())
            return null;

        return Main.symbolTable.getScopeStack().peek();
    }
    private void createSymbol(int ScopeId, String name, String type) {
        System.out.println("create new Symbol ...");
        Symbol symbol;
        if (type.equalsIgnoreCase("special function"))
            symbol = new Symbol("Special Function | " + name);
        else
            symbol = new Symbol(name);
        symbol.setType(type);
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addSymbol(symbol);
    }

    private void createRandomSymbol(int ScopeId, String value, String type) {
        System.out.println("create new Random Symbol ...");
        Symbol symbol = new Symbol(value);
        symbol.setType(type);
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addRandomSymbol(symbol);
    }
}
