package projects;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static String Host = "localhost";
	private static String PASSWORD = "Kulolo123";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String User = "projects";

	
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",Host,PORT,SCHEMA,User, PASSWORD);
		System.out.println("Connecting with url="+ url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained connection");
			return conn;
		} catch (SQLException e) {
			throw new DbException(e);
			
		}
	}
}
