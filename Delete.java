package jdbcyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main (String args[]) throws SQLException {
	String email1="lalit@gmail.com";
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insertdata", "root", "LALIT@");
			PreparedStatement ss = con.prepareStatement("delete from register where email=?");
			ss.setString(1, email1);
			
			
			 int count =ss.executeUpdate();
			 if
			(count>0) {
				 System.out.println("delete succesfully");
			 }
			 else {
				 System.out.println("delete failed ");
			 }
			 
			 con.close();

			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
