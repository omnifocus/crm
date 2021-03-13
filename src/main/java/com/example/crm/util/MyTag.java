package com.example.crm.util;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class MyTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        final JspWriter out = pageContext.getOut();
        try {
            out.write("<span style='color: red'>hello my tag!</span>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }
}
