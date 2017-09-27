package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

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

		Quiz quiz = new Quiz();
		String question = "";
		int answer = 0;
		int userAnswer = -1;
		int score = 0;
		int index = 0;
		int qlength = quiz.getLength();

		PrintWriter out = response.getWriter();
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

		String showResult = "";
		if (index < qlength) {
			showResult = "<div>Guess the next number in the sequence.</div>" + "<div>\n" + question + "</div>\n"
					+ "<div>Your answer: <input type=\"text\" name=\"answer\"></div>\n"
					+ "<button type=\"submit\" name=\"Submit\">Submit</button>";
		} else {
			showResult = "<div>You have completed the Number Quiz, with a score of " + score + " out of " + qlength
					+ ".</div>";
		}

		String title = "Lab 11 Quiz";

		response.setContentType("text/html");
		String docType = "<!DOCTYPE html>";
		out.println(docType + "<html>\n" + "<head><meta charset=\"UTF-8\"><title" + title + "</title></head>\n"
				+ "<body>\n" + "<div>\n" + "<h2>The Number Quiz</h2>\n" + "</div>\n"
				+ "<form method=\"post\" action=\"QuizTest\" >\n" + "<div>\n" + "Your current score is " + score + "."
				+ "</div>\n" + showResult + "</form>\n" + "</body>\n" + "</html>");

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
