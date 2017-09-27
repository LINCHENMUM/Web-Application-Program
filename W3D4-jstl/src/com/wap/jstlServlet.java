package com.wap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs.wap.model.Employee;

/**
 * Servlet implementation class jstlServlet
 */
@WebServlet("/jstlServlet")
public class jstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Employee> emplist=new ArrayList<Employee>();
		
		Employee employee=new Employee();
		employee.setId(0);
		employee.setName("Chenlin");
		employee.setRole("student");
		emplist.add(employee);
		
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("Tina");
		employee1.setRole("Teacher");
		emplist.add(employee1);
		
		request.setAttribute("emplist", emplist);
		request.setAttribute("message", "<br><b>my first jstl message</b>");
		
		request.setAttribute("url", "www.mum.edu");
		
//		RequestDispatcher rd=request.getServletContext().getRequestDispatcher("myself.jsp");
//		rd.forward(request, response);
		
		request.getRequestDispatcher("myself.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
