package wap;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/BeerSelectServlet")
public class BeerSelectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String color = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> styles = be.getBrands(color);
		request.setAttribute("styles", styles);
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);

	}

}
