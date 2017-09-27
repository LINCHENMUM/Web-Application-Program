package servlet.wap.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import bean.wap.project.Comment;
import utils.wap.project.DBcon;

/**
 * Servlet implementation class addComment
 */
@WebServlet("/addComment")
public class addComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int postid=Integer.parseInt(request.getParameter("postid"));
		int userid=Integer.parseInt(request.getParameter("userid"));
		String comments=request.getParameter("comments");
		
		Comment comment=new Comment();
		comment.setComments(comments);
		comment.setPostid(postid);
		comment.setUserid(userid);
		PrintWriter out=response.getWriter();
		
		String sql="INSERT INTO comment (`USERID`,`POSTID`,`COMMENTS`) VALUES ("+userid+","+postid+",'"+comments+"');";
		DBcon db=new DBcon();
		
		db.doInsert(sql);
		out.println("insert successfully!");
		//request.getRequestDispatcher("AddComment.jsp").forward(request, response);
		request.getRequestDispatcher("AddComment.jsp").include(request, response);
		
		String selectSQL="SELECT * FROM COMMENT";
		
		ResultSet rd=db.doSelect(selectSQL);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
