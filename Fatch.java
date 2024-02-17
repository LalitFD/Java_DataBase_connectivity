package jdbcyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fatch {
	public static void main (String args[]) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insertdata", "root", "LALIT@");
			PreparedStatement ss = con.prepareStatement("SELECT * FROM insertdata.register");
			ResultSet rs=ss.executeQuery();
			
			while(rs.next()) {
				System.out.println("Name :"+rs.getString("name"));
				System.out.println("Email :"+rs.getString("email"));
				System.out.println("Password :"+rs.getString("password"));
				System.out.println("gender :"+rs.getString("gender"));
				System.out.println("city :"+rs.getString("city"));
				

			}
			con.close();
			
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	
	}

