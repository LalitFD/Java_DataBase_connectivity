package jdbcyy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {
public static void main(String args[])   {
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your name :");
	String n= sc.nextLine();
	
	
	System.out.println("Enter your Email:");
	String e=sc.nextLine();

	System.out.println("Enter your Password::");
	String p=sc.nextLine();	
	
	System.out.println("Enter your Gender:");
	String g=sc.nextLine();
	System.out.println("Enter your City:");
	String c=sc.nextLine();

	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insertdata", "root", "LALIT@");
				PreparedStatement ss = con.prepareStatement("insert into register values (?,?,?,?,?)");
				ss.setString(1, n);
				ss.setString(2, e);
				ss.setString(3, p);
				ss.setString(4, g);
				ss.setString(5, c);
				
			
			int i=ss.executeUpdate();
				 if(i>0) {
					 System.out.println("success");
				 }
				 else {
					 System.out.println("failed");

				 }
	}catch(SQLException | ClassNotFoundException w) {
		w.printStackTrace();		
	}
	
}


}
