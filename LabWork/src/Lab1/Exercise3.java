package Lab1;

import java.util.Scanner;

public class Exercise3 {
	public boolean checkNumber(int number)
	{
		boolean flag=true;
		String s=String.valueOf(number);
		if(number==1)
		{
			flag=true;
		}
		else
		{
			for(int i=0;i<s.length()-1;i++)
			{
				int digit=Character.getNumericValue(s.charAt(i));
				int a=(i+1)%s.length();
				int digit1=Character.getNumericValue(s.charAt(a));
				if(digit > digit1)
				{
					flag=false;
				}
				else
					flag=true;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n= sc.nextInt();
		Exercise3 e3 = new Exercise3();
		System.out.println(e3.checkNumber(n));
	}
}
