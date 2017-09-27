package com.wap;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class myTaglib extends SimpleTagSupport {
	String forColor;
	String text;
	
	public void doTag() throws JspException, IOException{
		
		JspWriter out=getJspContext().getOut();
		if(forColor!=null){
			out.write(String.format("<span style='color=%s>%s</span>",forColor,text));
		}else{
			out.write(String.format("<span>%s</span>", text));
		}
		
	}

	
	public void setForColor(String forColor) {
		this.forColor = forColor;
	}


	public void setText(String text) {
		this.text = text;
	}

}
