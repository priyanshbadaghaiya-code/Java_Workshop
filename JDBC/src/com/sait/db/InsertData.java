package com.sait.db;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","lalla");
			Statement st = c.createStatement();
			st.executeUpdate("insert into students(sname , sphone) values('Priyansh ','1234567890')");
					
			System.out.println("Data Inserted Successfully!!!")	;	
		}catch(Exception e) {
			e.printStackTrace();

	}

}
}