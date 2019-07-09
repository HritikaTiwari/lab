package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public String[] sortArrayOfStrings(String[] s)
	{
		for(int i=0;i<s.length;i++)
	{
			s[i]=s[i].toLowerCase();
	}
	Arrays.sort(s);
	if(s.length % 2==0)
	{
		for(int i =0;i<s.length;i++)
		{
			if(i<s.length/2)
			{
				s[i]=s[i].toUpperCase();
			}
			else
			{
				s[i]=s[i].toLowerCase();
			}
		}
	}
	else
	{
		for(int i =0;i<s.length;i++)
		{
			if(i<s.length/2+1)
			{
				s[i]=s[i].toUpperCase();
			}
			else
			{
				s[i]=s[i].toLowerCase();
			}
		}
		
	}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings you want to take: ");
		int size=sc.nextInt();
		String[] nameArr=new String[size];
		sc.nextLine();
		for(int i=0; i<size; i++)
		{
		System.out.println("enter name:");
		nameArr[i]=sc.nextLine();
	
		}
		Exercise2 e= new Exercise2();
		System.out.println(Arrays.toString(e.sortArrayOfStrings(nameArr)));
	}
	
}
