package collectionEx;


import java.util.*;

public class stringTokenizerDemo
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a line of numbers: ");
			String input = s.next();
			StringTokenizer st = new StringTokenizer(input," ");
			int sum = 0;
			while(st.hasMoreTokens())
			{
				int n = 0;
				n = Integer.parseInt(st.nextToken());
				System.out.println("Number is: "+n);
				sum += n;
			}
			System.out.println("Sum of the numbers is: "+sum);
	}
}