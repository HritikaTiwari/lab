package com.Exception;
public class Exp1 {
	public static void main(String[] args) 	{
try {
		int c=12/0;
		try {
			System.out.println("Division "+c);
			int b=30/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		try {
			int a[]=new int[3];
			a[3]=4;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("remaining try statements");
		}	}
catch(Exception e)
{
	 System.out.println("handled");
}}}
