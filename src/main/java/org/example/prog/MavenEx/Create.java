package org.example.prog.MavenEx;

import java.sql.*;

public class Create {
		private Connection c;

		public void create() throws SQLException {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harsha", "root", "harsha@123");
			PreparedStatement p;
			String cr = "create table Student1(rno numeric(2) unique not null primary key,name varchar(20),s1 numeric(3),s2 numeric(2))";
			p = c.prepareStatement(cr);
			p.execute();
			//int i = p.executeUpdate();
		}
}
