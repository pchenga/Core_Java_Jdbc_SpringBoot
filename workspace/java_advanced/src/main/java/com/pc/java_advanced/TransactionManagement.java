package com.pc.java_advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) {
		
		String driver      = "com.mysql.cj.jdbc.Driver"; 
		String url         = "jdbc:mysql://localhost:3306/java_training";
		String username    = "root";
		String password    = "Mysql@123";
		
		
		Connection con = null; 
		Statement st   = null;
		
		try {
			
			//1. Load the mysql driver class
			Class.forName(driver);
			
			//2. Prepare a connection 
			con = DriverManager.getConnection(url, username, password);
			
            System.out.println(con);
            
            con.setAutoCommit(false);
            
            //3. Create a statement
            st  = con.createStatement();   
            
            //4. SQL query
            String insertQuery = "INSERT INTO employee_table VALUES(8,'Sandeep2','Sandeep2@gmail.com',33333,20000)";
			String updateQuery = "UPDATE employee_table SE ename='YYYYYY' WHERE eid=3";			
            String selectQuery = "SELECT * FROM employee_table";
            int res = st.executeUpdate(insertQuery);
            System.out.println(res);
            
            int res1 = st.executeUpdate(updateQuery);
            System.out.println(res1);
            
          
			//Table representation of data
			ResultSet rs = st.executeQuery(selectQuery);
			
			while(rs.next()) {
				
				int      eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				String email = rs.getString("email");
				long   phone = rs.getLong("phone");
				double sal   = rs.getDouble("salary");
				
				System.out.println(eid +"\t" + ename +"\t" + email +"\t" + phone +"\t" + sal );
				
			}
            
          con.commit();  
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			
			try {
				if(con !=null)  
				    con.close();
				
				if(st !=null)
					st.close();
			} catch (Exception e2) {
				
			}
			
		}


	}

}
