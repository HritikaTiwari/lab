package com.pdw.core;

import java.util.Scanner;//ctrl+shift+o

public class Wel {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your empid");
			int empid=sc.nextInt();
					
			System.out.println("enter your name");
			String ename=sc.next();
			
			System.out.println("enter your salary");
			int empSal=sc.nextInt();
					
			System.out.println("enter your phoneno.");
			String length = sc.next();
			
			System.out.println(empid+" "+ename+" "+empSal+" "+length );
				sc.close();	
					
					
		}

	


}
