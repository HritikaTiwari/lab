package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//loading the driver class-->OracleDriver-->oracle.jdbc.driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create the connection
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"rithika","rithika123");
		
		//create the statement
						Statement stmt= conn.createStatement();
		
		//execute Query
//		boolean b=stmt.execute("create table hritz(id number(10), name varchar2(10))");
//		int update = stmt.executeUpdate("insert into hritz(id,name) values(1,'Hritika')");
//		int update1 = stmt.executeUpdate("insert into hritz(id,name) values(2,'Hritzz')");
						ResultSet b= stmt.executeQuery("select * from emp");
//		int update = stmt.executeUpdate("drop table hriti");
//						while(b.next())
//						{
//							System.out.println(b.getInt(1)+" "+b.getString("ename")+" "+b.getString(3));
//						}				
		//close the connection
		conn.close();
//		System.out.println("table created "+update);
//	System.out.println("table deleted "+update);
		
		
		
	}

}
