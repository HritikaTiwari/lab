package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Validation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your username");
		String unaame=sc.next();
		System.out.println("enter your password");
		String pass=sc.next();
		
        Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"rithika","rithika123");
		
		PreparedStatement ps= conn.prepareStatement("select * from gmail where unaame=? and password=?");
		ps.setString(1, unaame);
		ps.setString(2, pass);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login failed");
			System.out.println("Registraion needed");
			System.out.println("enter your username: ");
			String unaame1=sc.next();
			System.out.println("enter your password: ");
			String pass1=sc.next();
			System.out.println("enter your contact: ");
			String contact=sc.next();
			PreparedStatement ps1= conn.prepareStatement("insert into gmail values(?,?,?)");
			ps1.setString(1, unaame1);
			ps1.setString(2, pass1);
			ps1.setString(3, contact);
			int a=ps1.executeUpdate();
			if(a>0) {
				System.out.println("registration successfull");
			}
	}		sc.close();
		conn.close();
	}
}
