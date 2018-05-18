package org.example.prog.MavenEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	private Connection c;
	private PreparedStatement p;
	private Scanner sc;
	public void delete() throws SQLException {
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harsha", "root", "harsha@123");
		System.out.println("Enter rollno of whose record you want to Delete:");
		sc = new Scanner(System.in);
		int rno = sc.nextInt();
		String d = "delete from Student1 where rno="+rno;
		p = c.prepareStatement(d);
		p.executeUpdate();
	}
}
