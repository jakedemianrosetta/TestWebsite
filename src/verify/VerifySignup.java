package verify;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VerifySignup")
public class VerifySignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public VerifySignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Verifying registration information...");
		
		String email = request.getParameter("email");
		String confirmemail = request.getParameter("confirmemail");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");
		
		String redirectURL = "registration.jsp?";
		if(!email.equals("confirmemail"))
		{
			redirectURL += "emailmismatch=true";
			if(!password.equals("confirmpassword"))
			{
				redirectURL += "&passwordmismatch=true"; 
			}
			response.sendRedirect(redirectURL); //redirect
		}
		else if(!password.equals("confirmpassword"))
		{
			redirectURL += "passwordmismatch=true";
			response.sendRedirect(redirectURL); //redirect
		}
		
		//if you made it here, the emails and passwords matched, so route this data to the database adding object thingy
		
		////////////////////////////////
		//
		// TODOTODOTODOTODOTODO
		//
		////////////////////////////////
		
		
		
		
	    //add data to the database
		
		
	}

}
