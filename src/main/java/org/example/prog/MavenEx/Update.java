package org.example.prog.MavenEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	private Connection c;
	private PreparedStatement p;
	private Scanner sc;
	public void update() throws SQLException {
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harsha", "root", "harsha@123");
		System.out.println("Enter rollno of whose record you want to Update:");
		sc = new Scanner(System.in);
		int rno = sc.nextInt();
		System.out.println("Enter New Name:");
		String n = sc.next();
		System.out.println("Enter new S1 Marks:");
		int su1 = sc.nextInt();
		System.out.println("Enter new S2 Marks:");
		int su2 = sc.nextInt();
		String u = "update Student1 set name=?,s1=?,s2=? where rno=?";
		p = c.prepareStatement(u);
		p.setString(1, n);
		p.setInt(2, su1);
		p.setInt(3, su2);
		p.setInt(4, rno);
		int up = p.executeUpdate();
		System.out.println(up+"row updated successfully.");
	}
}
