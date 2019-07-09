package Lab5;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select one of three Light: ");
		System.out.println(" red\n yellow \n green");
        String userInput=sc.nextLine();
        userInput=userInput.toLowerCase();
        switch(userInput)
        {
        case "red":
        	System.out.println("stop");
        	break;
        case "yellow":
        	System.out.println("ready");
        	break;
        case "green":
        	System.out.println("go");
        	break;
        
        }
	sc.close();
	}
}
