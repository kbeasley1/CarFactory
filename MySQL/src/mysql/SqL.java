package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;




public class SqL {
	public static void main(String[] args) {
		try {
	// set the db url, username, and password
	String url= "jdbc:mysql://localhost:3306/music";
		String username = "root";
		String password = "yesLord1";
		
		Connection connection = DriverManager.getConnection(
				url, username, password);
		System.out.println("Connection Success!!!!"); 
		
		Statement statement =connection.createStatement();
		ResultSet artistRS = statement.executeQuery("SELECT * FROM artist"
);
		System.out.println("Query Success!!!!");
		
		//add looping code (part 3)
		while (artistRS.next()) {
			System.out.println(artistRS.getString("artist_name"));
		}
		//error (part 1)
		} catch (SQLException e) {
			for (Throwable t:e ) {
		System.out.println(t);}
		
	 	}}}