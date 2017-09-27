package com.wap;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wap.w3d3.model.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		
		User user=new User();
		user.setName(username);
		user.setPassword(password);
		
		boolean status=user.validate();
//		System.out.println(username);
//		System.out.println(password);
		
		HttpSession s=request.getSession();
		
		if(status){
//			request.setAttribute("successmessage", username);
			s.setAttribute("successmessage", username+password);
			request.getRequestDispatcher("success.jsp").forward(request,response);
		}else{
//			request.setAttribute("errormsg", "Incorrect user name or password,please try again.");
//			Cookie cookie=new Cookie("errormsg", "Incorrect user name or password,please try again. by cookie");
//			cookie.setMaxAge(0);
//			response.addCookie(cookie);
//			request.getRequestDispatcher("myself.jsp").forward(request,response);
			request.getRequestDispatcher("login-error.jsp").forward(request, response);
		}
		
		
	}

}
