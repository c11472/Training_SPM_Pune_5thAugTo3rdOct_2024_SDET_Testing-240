import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");

		// To establish the connection <--- inteface<--- Connect is an Interface
		// We can not create direct object for connection
		// So we are using DriverManager Class
		//getConnection is a method in DriverManager class
		
		// parameters of getConnection method
		//1. URL  "jdbc:mysql://localhost:portno/databaseName  ----
		//2. admin username
		//3. admin password
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbs1", "root", "P2ssw0rd@123");
	    Object connecttest = con;
	    System.out.println(connecttest);
	    
	    String res = connecttest.toString();
	    System.out.println(res);
	    
	    if(res.contains("@609e8838")) {
	    	System.out.println("Connection established !");
	    	
	    }
	    else {
	    	System.out.println("Check for correct credentials and port !");
	    }
  	}

}
