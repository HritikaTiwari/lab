package com.Exception;
public class Exp {
	public static void main(String[] args) 
	{
try {
		int a[]=new int[5];
		a[4]=30/4;
		String s=null;
		//int x=Integer.parseInt(s);
		System.out.println(s.length());
		//System.out.println("no error "+ a[4]+" "+x);
	}
catch(ArrayIndexOutOfBoundsException ae)
{
	 System.out.println("please enter valid index");
}
catch(ArithmeticException ae)
{
    System.out.println("dont enter zero as denominator");
}
catch(NumberFormatException e)
{
	System.out.println("we cant convert string to number");
}
catch(Exception e)
{
	System.out.println("enable find length of string");
    e.printStackTrace();
	System.out.println(e.getMessage());

}
finally {
	
		System.out.println("execute everytime for closing connection");
	}
   System.out.println("remaining 10000 lines of code");
	}
}
