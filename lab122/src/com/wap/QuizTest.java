package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Servlet implementation class Quiz
 */
// @WebServlet("/QuizTest")
public class QuizTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizTest() {
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

		PrintWriter out = response.getWriter();

		Quiz quiz = new Quiz();
		String question = "";
		int answer = 0;
		int userAnswer = -1;
		int score = 0;
		int index = 0;
		int qlength = quiz.getLength();

		String age = "";
		String exceptionString = "";

		Pattern pattern = Pattern.compile("[0-9]*");

		HttpSession s = request.getSession();

		if (s.isNew()) {
			s.setAttribute("quiz", quiz);
			question = quiz.getQuestion(0);
			index = 0;
			s.setAttribute("index", index);
		} else {
			index = (Integer) (s.getAttribute("index"));
			if (index < qlength) {
				Quiz sQuiz = (Quiz) s.getAttribute("quiz");
				answer = sQuiz.getAnswer(index);
				index += 1;
				if (index < qlength) {
					question = sQuiz.getQuestion(index);
				}
			}
			s.setAttribute("index", index);

			if (request.getParameter("age") != null && !request.getParameter("age").equals("")) {
				age = request.getParameter("age");
				Matcher isNum = pattern.matcher(age);
				if (!isNum.matches()) {
					exceptionString = "Please input age in number!";
				} else {
					if (Integer.parseInt(age) < 4 || Integer.parseInt(age) > 100) {
						exceptionString = "Please input age between 4 and 100!";
					}
				}
				request.setAttribute("exception", exceptionString);
				request.setAttribute("age", age);
			} else {
				exceptionString = "Please input age, it is required!";
				request.setAttribute("exception", exceptionString);
			}
		}

		if (request.getParameter("answer") != null && !request.getParameter("answer").equals("")) {
			userAnswer = Integer.parseInt(request.getParameter("answer"));
			if (userAnswer == answer) {
				if (s.getAttribute("score") == null) {
					score = 1;
				} else {
					score = (Integer) s.getAttribute("score") + 1;
				}
				s.setAttribute("score", score);
			} else {
				if (s.getAttribute("score") != null) {
					score = (Integer) s.getAttribute("score");
				}
			}
		}
		String hint = quiz.getHint(index);
		request.setAttribute("question", question);
		request.setAttribute("index", index);
		request.setAttribute("glength", qlength);
		request.setAttribute("score", score);
		request.setAttribute("hint", hint);

			if (index < qlength) {

				request.getRequestDispatcher("quiz.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("end.jsp").forward(request, response);
			}

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
