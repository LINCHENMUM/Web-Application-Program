package edu.mum.cs.wap;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
// @WebFilter("/LoginFilter")
public class LogFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LogFilter() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// place your code here
		// Get the IP address of client machine.
		String ipAddress = request.getRemoteAddr();

		// Log the IP address and current timestamp.
		System.out.println("IP " + ipAddress + ", Time " + new Date().toString());
		HttpServletRequest req = (HttpServletRequest)request;
		
		HttpServletResponse res = (HttpServletResponse)response;
		
		String username = req.getParameter("username");
		
		if(!"Tina".equalsIgnoreCase(username)){
			res.sendRedirect("login.jsp");
		
		}else{
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		// Get init parameter
		String testParam = fConfig.getInitParameter("test-param");

		// Print the init parameter
		System.out.println("Test Param: " + testParam);
	}

}
