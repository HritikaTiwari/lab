package Lab5;
import java.util.*;

@SuppressWarnings("serial")
class CheckFullName extends Exception{
	public CheckFullName()
	{
		//this.name=name;
		//this.lastname=lastname;
	}
	public String toString()
	{
		return "please enter full name";
	}
}
class Exercise4 {
   static void validation(String name,String lastname)throws CheckFullName{
   if("".equals(name)|| "".equals(lastname))
   {
	   throw new CheckFullName();
   }
   else
   {
	   System.out.println("entered name is right");
   }
   }
   public static void main(String[] args)throws CheckFullName
   {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username ");
		String userName=sc.nextLine();
		System.out.println("Enter Lastname");
        String lastName=sc.nextLine();
        Exercise4.validation(userName,lastName);
        sc.close();
   }
}
