package com.wap;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class selectcity
 */
@WebServlet("/selectcity")
public class selectcity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectcity() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String state=request.getParameter("state").trim();
		String json=null;
		System.out.println(state+"city------------------");
		Map<String,String> gd=new LinkedHashMap<String,String>();
		gd.put("1", "GZ");
		gd.put("2", "SZ");
		
		if(state.equalsIgnoreCase("Guangdong5555")){
			json=new Gson().toJson(gd);
		}
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
