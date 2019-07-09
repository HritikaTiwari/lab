package Lab5;

import java.util.Scanner;

public class Exercise2 {
 @SuppressWarnings("unused")
public int fibonacci(int n)
 {
	int c=0;
	if(n==0)
		return 0;
	else if(n==1)
		return 1;
	else
	{
		int a=1,b=1;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			int temp=a;
			a=b;
			b=c;
		}
	}
	return c;
	 }
 public int fibonacciRec(int n)
 {
	 if(n==0)
		 return 0;
	 else if(n==1)
		 return 1;
	 else
		 return fibonacciRec(n-1)+ fibonacciRec(n-2);
 }
 @SuppressWarnings("resource")
public static void main(String[] args)
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the limit:");
	 int number = sc.nextInt();
	Exercise2 fb=new Exercise2();
	 System.out.println(fb.fibonacci(number));
	 System.out.println(fb.fibonacciRec(number));
 }
 
}
