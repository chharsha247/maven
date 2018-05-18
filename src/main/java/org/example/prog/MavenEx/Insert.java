package org.example.prog.MavenEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	private Scanner sc;
	private Connection c;
	private PreparedStatement p;
	public void insert() throws SQLException {
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harsha", "root", "harsha@123");
		String in = "insert into Student1 values(?,?,?,?)";
		sc = new Scanner(System.in);
		System.out.println("How many records you want to insert:");
		int no = sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter RollNo:");
			int r = sc.nextInt();
			System.out.println("Enter name:");
			String n = sc.next();
			System.out.println("Enter sub1 marks:");
			int m1 = sc.nextInt();
			System.out.println("Enter sub2 marks:");
			int m2 = sc.nextInt();
			p = c.prepareStatement(in);
			p.setInt(1, r);
			p.setString(2, n);
			p.setInt(3, m1);
			p.setInt(4, m2);
			p.executeUpdate();
		}
	}
}
