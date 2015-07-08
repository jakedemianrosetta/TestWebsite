package verify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseInfoGrabber {
	public boolean VerifyEmailPasswordMatch (String email, String password)
	{		
		
		Connection conn = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("\nfailed to find db");
			return false;
		}
		
		
		try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "rosetta12");
		} 
		catch (SQLException e) 
		{
			System.out.println("\nfailed to connect to db");
			return false;
		}
		
		System.out.println("Connection to database established.");
		
		//perform my database actions here///////////////
		
		PreparedStatement st = null;
	    ResultSet res = null;
	    boolean credentialsMatchDB = false;
		String db_email = "", db_pass = "";	    
		
		try
		{
			st = conn.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
			st.setString(1, email);
			st.setString(2,  password);
			res = st.executeQuery();
			if (res.next()) 
			{
				db_email = res.getString("email");
				db_pass = res.getString("password");
				credentialsMatchDB = true;					
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("ERROR: problem in querying the database.");
		}
		
		///////////////////////////////////////////////////
		
		try {
			conn.close();
		} catch (SQLException e) {
			//not much you can do here.
		}
		
		if(!credentialsMatchDB)
		{
			return false;
		}
		return true;
	}
}
