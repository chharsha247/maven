package org.example.prog.MavenEx;

import java.sql.*;
import java.util.Scanner;

public class Retrieve {
	private Connection c;
	private PreparedStatement p;
	private Scanner sc;
	public void retrieve() throws SQLException {
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harsha", "root", "harsha@123");
		System.out.println("Enter rollno of whose records you want to retrieve:");
		sc = new Scanner(System.in);
		int rno = sc.nextInt();
		String re = "Select * from Student1 where rno="+rno;
		p = c.prepareStatement(re);
		ResultSet rs = p.executeQuery();
		while(rs.next()) {
			int rollno = rs.getInt("rno");
			String n = rs.getString("name");
			int su1 = rs.getInt("s1");
			int su2 = rs.getInt("s2");
			System.out.println("Roll No:"+rollno);
			System.out.println("Name:"+n);
			System.out.println("s1 Marks:"+su1);
			System.out.println("s2 Marks:"+su2);
			System.out.println("-----------------");
		}
	}
}
