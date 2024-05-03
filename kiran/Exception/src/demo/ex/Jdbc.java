package demo.ex;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("first line...");
		//loading the driver
		Class.forName("com.mysql.ab.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306:bike", "root","root");
	
	//here we get sql exception that can be handled with try,catch or throws
		
		Statement st = con.createStatement();		
		System.out.println("last line...");
	}

}
