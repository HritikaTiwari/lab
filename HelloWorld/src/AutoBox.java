import java.util.Scanner;
public class AutoBox 
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number for division");
		int fnum=sc.nextInt();
        System.out.println("enter second number for division");
		int snum=sc.nextInt();
				try {
					int division=fnum/snum;//AE
					System.out.println("division of tso no."+division);
				}
		catch(ArithmeticException e)
		{
			System.out.println("dont enter zero as denominator");
		}
		System.out.println("remaining 10000 lines of code");
    }
}
