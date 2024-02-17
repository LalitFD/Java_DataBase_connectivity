package jdbcyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
	public static void main (String args[]) throws SQLException {
		
		String city="pune";
		String email1="lalit@gmail.com";
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insertdata", "root", "LALIT@");
			PreparedStatement ps = con.prepareStatement("update register set city =? where email =?");
			ps.setString(1, city);
			ps.setString(2, email1);
			
			 int count =ps.executeUpdate();
			if(count>0) {
				System.out.println("update");
			}
			else {
				System.out.println("Update failed ");
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
			
	}

	private static void forName(String string) {
		// TODO Auto-generated method stub
		
	}

}
