package com.pc.java_advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		String driver      = "com.mysql.cj.jdbc.Driver"; 
		String url         = "jdbc:mysql://localhost:3306/java_training";
		String username    = "root";
		String password    = "Mysql@123";
		
		
		Connection con = null; 
		PreparedStatement pst   = null;
		PreparedStatement pst1   = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an eid");
		int eid = scan.nextInt();
		
		System.out.println("Enter an ename");
		String ename = scan.next();
		
		System.out.println("Enter an email");
		String email = scan.next();
		
		System.out.println("Enter a phone");
		long phone = scan.nextLong();
		
		System.out.println("Enter a salary");
		double salary = scan.nextDouble();
		
		
		
		try {
			
			//1. Load the mysql driver class
			Class.forName(driver);
			
			//2. Prepare a connection 
			con = DriverManager.getConnection(url, username, password);
			
            System.out.println(con);
           
            
            //3. SQL query
            String insertQuery = "INSERT INTO employee_table VALUES(?,?,?,?,?)";
			
            
            //"CALL GetCount(?)"
            
            
            //4. Create a prepared statement
           /* pst  = con.prepareStatement(insertQuery); 
            pst.setInt(1, eid);
            pst.setString(2, ename);
            pst.setString(3, email);
            pst.setLong(4, phone);
            pst.setDouble(5, salary);
            
            //pst.addBatch()
            pst.setInt(1, eid);
            pst.setString(2, ename);
            pst.setString(3, email);
            pst.setLong(4, phone);
            pst.setDouble(5, salary);
            
            or 
            
            List<Employee> emps = .....
            
            for(Employee e: emps){
            pst.setInt(1, e.eid);
            pst.setString(2, e.ename);
            pst.setString(3, e.email);
            pst.setLong(4, e.phone);
            pst.setDouble(5, e.salary);
            
            pst.addBatch();
            }
            
            
            pst.executeBatch();
             
           
             
           
            
            int res = pst.executeUpdate();
            System.out.println(res);*/
            
           String selectQuery = "SELECT * FROM employee_table WHERE eid=?";
           
           pst1  = con.prepareStatement(selectQuery);
           pst1.setInt(1, eid);
           
			//Table representation of data
			ResultSet rs = pst1.executeQuery();
			
			while(rs.next()) {
				
				int      eid1 = rs.getInt(1);
				String ename1 = rs.getString(2);
				String email1 = rs.getString(3);
				long   phone1 = rs.getLong(4);
				double sal1   = rs.getDouble(5);
				
				System.out.println(eid1 +"\t" + ename1 +"\t" + email1 +"\t" + phone1 +"\t" + sal1 );
				
			}
            
            
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(con !=null)  
				    con.close();
				
				if(pst !=null)
					pst.close();
			} catch (Exception e2) {
				
			}
			
		}


	}

}
