package com.wap;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport {
	StringWriter sw = new StringWriter();

	public void doTag() throws JspException, IOException {
		getJspBody().invoke(sw);
		String orignal = sw.toString();
		String result = "<div>" + orignal + "<div>";
//		getJspContext().getOut().println(result);
		getJspBody().invoke(null);
	}
}
