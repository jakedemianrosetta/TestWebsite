package verify;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class verifyLogin
 */
@WebServlet("/verifyLogin")
public class verifyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verifyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Verifying login credentials...");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DatabaseInfoGrabber db = new DatabaseInfoGrabber();
		boolean credentialsGood = false;

		credentialsGood = db.VerifyEmailPasswordMatch(email, password);

		
		if(credentialsGood)
		{
			out.println("Credentials look good!");
		}
		else
		{
			response.sendRedirect("login.jsp?loginfailed=true");			
		}
	}

}
