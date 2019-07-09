package com.Exception;

public class Exceptions {
	public static void main(String[] args) 
	{
	try {
		int a1=10;
		int b=2;
		int c=a1/b;
	}
catch(ArithmeticException ae)
{
	//System.out.println("dont enter zero as denominator");
	//System.out.println("ae");
    //ae.printStackTrace();
    System.out.println(ae.getMessage());
}
	try {
		int a[]=new int[5];
		a[0]=1;
		a[5]=6;
	}
catch(ArrayIndexOutOfBoundsException ae)
{
	 System.out.println("array index mininmum size is 4");
}
	 System.out.println("remaining 10000 lines of code");
	}
}