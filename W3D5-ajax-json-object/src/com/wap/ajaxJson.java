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
 * Servlet implementation class ajaxJson
 */
@WebServlet("/ajaxJson")
public class ajaxJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajaxJson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String country=request.getParameter("country").trim();
		System.out.println(country);
		Map<String,String> usa=new LinkedHashMap<String,String>();
		
		usa.put("1", "IOWA");
		usa.put("2", "New York");
		usa.put("3", "Florida");
		
		Map<String,String> cn=new LinkedHashMap<String,String>();
		cn.put("Shandong", "Shandong");
		cn.put("Beijing", "Beijing");
		cn.put("Guangdong5555", "Guangdong");
		cn.put("Shanghai", "Shanghai");
		
		String json=null;
		if(country!=null && !country.equals("")){
			if(country.equalsIgnoreCase("usa")){
				json=new Gson().toJson(usa);
			}else if(country.equalsIgnoreCase("china")){
				json=new Gson().toJson(cn);
			}
		}
		System.out.println(json);
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
