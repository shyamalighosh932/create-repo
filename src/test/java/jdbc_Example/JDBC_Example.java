package jdbc_Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_Example {//Java Database Connections

	public static void main(String[] args) throws SQLException {
		// url full meaning -- Uniform Resource Locator
		// what is BD URL = "localhost:3306/dbmicrotech" . URL always String type
		// what is user Name = "root"
		// password  = "root"
		//JDBC-- Java Database connectivity
		String  url = "jdbc:mysql://localhost:3306/dbmicrotech";
		String userName = "root";
		String Password = "root";
		
		//establish a connection client to server 
		// we are creating a bridge by using connection
		
		Connection conn;// conn is connection here
		//since we had 3 connection here so we selected 3 types of string.
		conn = DriverManager.getConnection(url, userName, Password);
		//Send SQL Statement
		// we are creating a thing here-- like a truck in a bridge
		// here statement is a class and we imported it after write the name of the class
		Statement statement;
		statement = conn.createStatement();
		//Send SQL statement and store it in resultSet
		// import ResultSet first one
		// executeQuery is a method
		// create a resultSet variable
		ResultSet rs =	statement.executeQuery("select prodPrice from tblproduct where prodName = 'pad'");
		//print resultSet
		
		while (rs.next()) {
			System.out.println(rs.getString("prodPrice"));
		}
		rs = statement.executeQuery("select * from tblproduct");
		while (rs.next()) {
			System.out.println(rs.getString("prodName") + "\t" + rs.getString("prodPrice"));
		}
		
		
		
		
		
		
		
		
		
	
	}

}
