package org.example.prog.MavenEx;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner sc;

	public static void main( String[] args ) throws SQLException
    {
    	sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("1.Create,\t2.Insert,\t3.Retrieve,\t4.Update,\t5.Delete,\t6.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
        	switch(ch) {
        	case 1:
        		Create cr = new Create();
        		cr.create();
        		break;
        	case 2:
        		Insert in = new Insert();
        		in.insert();
        		break;
        	case 3:
        		Retrieve r = new Retrieve();
        		r.retrieve();
        		break;
        	case 4:
        		Update u = new Update();
        		u.update();
        		break;
        	case 5:
        		Delete d = new Delete();
        		d.delete();
        		break;
        	case 6:
        		System.exit(0);
        		break;
        	}	
        }
    }
}
