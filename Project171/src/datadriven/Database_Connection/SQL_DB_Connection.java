package datadriven.Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_DB_Connection {

	public static void main(String[] args)
	{
		
		  
        try {
        	
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String DB_Add="jdbc:sqlserver://localhost";
        	String DB_Name="Mindq";
        	String DB_UID="sunil";
        	String DB_PWD="mqdsnr";
			
        	
        	Connection con=DriverManager.getConnection(DB_Add+DB_Name+DB_UID+DB_PWD);
			
        	if(con!=null)
        	{
        		Statement stmt=con.createStatement();
        		//Execute query
        		ResultSet rs=stmt.executeQuery("SELECT * from users");
        		
        		//Using While loop iterate until it has last recor
        		while(rs.next())
        		{
        			String Customername=rs.getString("CustomerName");
        			String CustomerEmail=rs.getString("email");
        		}
        	}
        	
        	
        	con.close();
        	
        	
        	
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
