package com.pc.java_advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) {
		String driver      = "com.mysql.cj.jdbc.Driver"; 
		String url         = "jdbc:mysql://localhost:3306/prakash_db";
		String username    = "root";
		String password    = "Mysql@123";
		
		
		Connection con = null; 
		CallableStatement cs   = null;
		
		
		try {
			
			//1. Load the mysql driver class
			Class.forName(driver);
			
			//2. Prepare a connection 
			con = DriverManager.getConnection(url, username, password);
			
            System.out.println(con);
           
            
            //3. SQL query
            String procedureName = "{CALL GetCount(?)}";
			
            //4. Create a prepared statement
            cs  = con.prepareCall(procedureName) ;
           
            cs.registerOutParameter(1, Types.INTEGER);
            		
            cs.execute();
            
            System.out.println(cs.getInt(1));
       
   		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
   		}
		


	}

}
