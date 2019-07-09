package Lab5;

import java.util.Scanner;

public class Exercise3 {
 public void prime(int n)
 {
	 int count=0;
	 for(int i=1;i<n;i++)
	 {
		 count=0;
		 for(int j=1;j<=i;j++) {
			 if(i%j==0)
			 {
				 count=count+1;
			 }
		 }
		 if(count==2)
		 {
			 System.out.println(i);
		 }
	 }
 }
 @SuppressWarnings("resource")
public static void main(String[] args)
 {
	 Exercise3 p=new Exercise3();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter last range for prime nos:");
	 int n= sc.nextInt();
	 p.prime(n);
 }
}
