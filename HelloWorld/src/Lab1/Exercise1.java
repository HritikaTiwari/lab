package Lab1;

import java.util.Scanner;

public class Exercise1 {
	public int calculateSum(int n) {
		int sum=0;
	    for(int a=1;a<=n;a++)
	         {
	          if(a%3==0 ||a%5==0)
	               {
	                 	sum=sum+a;
	               }
	         }
	    return sum;
	}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n=sc.nextInt();
			Exercise1 e1 = new Exercise1();
			System.out.println(e1.calculateSum(n));
			sc.close();
		}
}
