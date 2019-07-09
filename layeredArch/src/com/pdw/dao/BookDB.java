package com.pdw.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@SuppressWarnings("unused")
public class BookDB 
{
	public static Connection getConnection1() throws Exception

{
		String driverName=("oracle.jdbc.driver.OracleDriver");
        Class.forName(driverName);
	    Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			"rithika","rithika123");
	    
	    return conn;
}
}
