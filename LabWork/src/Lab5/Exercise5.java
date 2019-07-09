package Lab5;
import java.util.*;
@SuppressWarnings("serial")
class AgeValidationException extends Exception{
	@SuppressWarnings("unused")
	private int age;
	public AgeValidationException(int age) {
	this.age=age;
}
	
	public String toString()
	{
		return "Age must be greater than 15";
	}
}
class Exercise5 {
	static void validation(int age) throws AgeValidationException
	{
		if(age<=15)
		{
			throw new AgeValidationException(age);
		}
		else
		{
			System.out.println("Age accepted");
		}
	}
	public static void main(String[] args) throws AgeValidationException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=sc.nextInt();
		Exercise5.validation(age);
        sc.close();
	}

}
