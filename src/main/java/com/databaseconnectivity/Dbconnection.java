package com.databaseconnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
public class Dbconnection {
	public static Connection connect() throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/commandlinepaymentapp","root","System123@");
		 return con;
	 }
}
