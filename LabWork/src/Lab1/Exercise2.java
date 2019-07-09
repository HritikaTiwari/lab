package Lab1;

import java.util.Scanner;

public class Exercise2 {
	public int calculateDifference(int n) {
		int sum1=0;
		int sum2=0;
	    for(int a=1;a<=n;a++)
	         {
	    	 sum1= sum1 + a*a;
	    	 sum2= sum2 + a;
	         }
	    sum2= sum2 * sum2;
	    return sum1 - sum2;
	}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n= sc.nextInt();
			Exercise2 e2 = new Exercise2();
			System.out.println(e2.calculateDifference(n));
		}
}
