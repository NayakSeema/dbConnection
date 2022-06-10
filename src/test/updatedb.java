package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedb {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String qry = "select * from employees";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
	    Statement stm = conn.createStatement();
	    stm.executeUpdate("update eproduct set productname='macpro' where id = 2");
	    ResultSet result = stm.executeQuery("select * from eproduct");
	    while(result.next()) {
	    	System.out.println(result.getString("name"));
	    }
	    conn.close();
	}

}
