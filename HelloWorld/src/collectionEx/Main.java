package collectionEx;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		AccountD a=new AccountD("person1","prepaid",123);
		AccountD a1=new AccountD("person2","postpaid",456);
		AccountD a2=new AccountD("person3","prepaid",789);
		
		HashMap hm=new HashMap();
		hm.put("8920111987", a);
		hm.put("8920111987", a1);
		hm.put("8920111987", a2);
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		System.out.println("select your option");
		System.out.println("1.display account info");
		System.out.println("2.Recharge account");
		int i=sc.nextInt();
		
		if(i==1)
		{
			System.out.println("Enter Mobile No:");
			String mobNo=sc.next();
			System.out.println(hm.get(mobNo));
		}
		else if(i==2)
		{
			System.out.println("Enter Mobile No:");
			String mobNo=sc.next();
			System.out.println("Enter Recharge Amount:");
			int amt=sc.nextInt();
			AccountD ac=(AccountD)hm.get(mobNo);
			ac.setBalance(ac.getBalance()+amt);
			System.out.println(hm.get(mobNo));
		}
		else
		{
			System.out.println("Thank you");
			break;
		}
		
	}

	}
}
