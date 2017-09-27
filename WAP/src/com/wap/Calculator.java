package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
// @WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Calculator";

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
			plusResult = "<div>" + plusnum1 + "+" + plusnum2 + "=" + plussum + "</div>\n";
		}

		if ((request.getParameter("multinum1") != null && !request.getParameter("multinum1").equals("")) && (request.getParameter("multinum2") != null && !request.getParameter("multinum2").equals(""))) {
			multinum1 = Integer.parseInt(request.getParameter("multinum1"));
			multinum2 = Integer.parseInt(request.getParameter("multinum2"));
			multisum = multinum1 * multinum2;
			multiResult = "<div>" + multinum1 + "*" + multinum2 + "=" + multisum + "</div>\n";
		}

		String docType = "<!DOCTYPE html>\n";
		out.println(docType + "<html>\n" + "<head><meta charset=\"UTF-8\"><title" + title + "</title></head>\n"
				+ "<body>\n" + plusResult + multiResult + "</body>\n" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
