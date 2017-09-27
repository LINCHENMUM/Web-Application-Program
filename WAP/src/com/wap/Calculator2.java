package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator2
 */
//@WebServlet("/Calculator2")
public class Calculator2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Calculator 2";

		int plusnum1 = 0;
		int plusnum2 = 0;
		int plussum = 0;
		int multinum1 = 0;
		int multinum2 = 0;
		int multisum = 0;
		String plusResult = "";
		String multiResult = "";

		if ((request.getParameter("plusnum1") != null && !request.getParameter("plusnum1").equals("")) && (request.getParameter("plusnum2") != null && !request.getParameter("plusnum2").equals(""))) {
			plusnum1 = Integer.parseInt(request.getParameter("plusnum1"));
			plusnum2 = Integer.parseInt(request.getParameter("plusnum2"));
			plussum = plusnum1 + plusnum2;
			plusResult= "<div>\n" 
					+ "<input type=\"text\" name=\"plusnum1\" value="+plusnum1+"> + "
					+ "<input type=\"text\" name=\"plusnum2\" value="+plusnum2+"> = "
					+ "<input type=\"text\" name=\"plussum\" value="+plussum+">"
					+ "</div>\n";
		}else{
			plusResult= "<div>\n" 
					+ "<input type=\"text\" name=\"plusnum1\" value=\"\"> + "
					+ "<input type=\"text\" name=\"plusnum2\" value=\"\"> = "
					+ "<input type=\"text\" name=\"plussum\" value=\"\">"
					+ "</div>\n";
		}

		if ((request.getParameter("multinum1") != null && !request.getParameter("multinum1").equals("")) && (request.getParameter("multinum2") != null && !request.getParameter("multinum2").equals(""))) {
			multinum1 = Integer.parseInt(request.getParameter("multinum1"));
			multinum2 = Integer.parseInt(request.getParameter("multinum2"));
			multisum = multinum1 * multinum2;
			multiResult= "<div>\n" 
					+ "<input type=\"text\" name=\"multinum1\" value="+multinum1+"> * "
					+ "<input type=\"text\" name=\"multinum2\" value="+multinum2+"> = "
					+ "<input type=\"text\" name=\"multisum\" value="+multisum+">"
					+ "</div>\n";
		}else{
			multiResult= "<div>\n" 
					+ "<input type=\"text\" name=\"multinum1\" value=\"\"> * "
					+ "<input type=\"text\" name=\"multinum2\" value=\"\"> = "
					+ "<input type=\"text\" name=\"multisum\" value=\"\">"
					+ "</div>\n";
		}

		String docType = "<!DOCTYPE html>\n";
		out.println(docType + "<html>\n" + "<head><meta charset=\"UTF-8\"><title" + title + "</title></head>\n"
				+ "<body>\n"
				+ "<form method=\"post\" action=\"Calculator2\" >\n"
				+ plusResult
				+ multiResult
				+ "<div>\n"
				+ "<button type=\"submit\" name=\"Submit\">Submit</button>"
				+ "</div>\n"						
				+ "</body>\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
