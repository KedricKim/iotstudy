package com.iot.kedric;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ExamTag extends SimpleTagSupport {

	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>이게 헤더1</td>");
		out.println("<td>이게 헤더2</td>");
		out.println("<td>이게 헤더3</td>");
		out.println("</tr>");
	}
}
