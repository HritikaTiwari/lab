package Lab1;

import java.util.Scanner;

public class Exercise4 {
	public boolean checkNumber(int number)
	{
        if (number == 0) 
	            return false; 
	          
	        while (number != 1) 
	        { 
	            if (number % 2 != 0) 
	                return false; 
	            number = number / 2; 
	        } 
	        return true; 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		Exercise4 e4 = new Exercise4();
		System.out.println(e4.checkNumber(n));
	}
}
