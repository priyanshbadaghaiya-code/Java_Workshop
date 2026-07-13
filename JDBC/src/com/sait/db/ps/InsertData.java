package com.sait.db.ps;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","lalla");
			
			PreparedStatement ps =c.prepareStatement("insert into students (sname , sphone ) values(?,?)");
			ps.setString(1, "Priyansh");
			ps.setString(2, "1234567890");
			ps.executeUpdate();		
			System.out.println("Data Inserted Successfully!!!")	;	
		}catch(Exception e) {
			e.printStackTrace();

	}

}
}