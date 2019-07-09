package com.pdw.core;

import java.util.Scanner;

public class hii {

		
		public static void main(String[] args) 
		{
			String sname=" ";
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("enter your sname");
			sname=sc.next();
			sname+=sc.nextLine();
			System.out.println("Welcome " +sname );
				sc.close();	
					
					
		}

	
}
