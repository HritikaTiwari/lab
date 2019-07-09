package Lab8;

import java.util.Scanner;

public class Exercise5 {
static boolean checkPositive(String s) {
	char[] ch= new char[s.length()];
	ch = s.toCharArray();
	boolean flag = false;
	for(int i=0;i<ch.length-1;i++)
	{
		for(int j=i;j<ch.length;j++)
		{
			if(ch[i] > ch[j])
			{
				flag=true;
				break;
			}
		}
	}
	if(flag) {
		return false;
	}
	else {
		return true;
	}
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String");
	String s= sc.nextLine();
    System.out.println(Exercise5.checkPositive(s));
}

}
