package Lab3;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
public class Exercise4 {
public static void countChar(char[] charArr)
{
	Hashtable<Character,Integer> myHash= new Hashtable<Character,Integer>();
	for(char myChar : charArr)
	{
		if(myHash.containsKey(myChar))
		{
			myHash.put(myChar,myHash.get(myChar)+1);
		}
		else
		{
			myHash.put(myChar,1);
		}
	}
	System.out.println(myHash);
}
public static void main(String[] args) 
{
	char[] charArr= {'a','b','b','1','u','1'};
	Exercise4.countChar(charArr);
}
}
