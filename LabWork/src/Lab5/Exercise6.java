package Lab5;
import java.util.Scanner;

@SuppressWarnings("serial")
class EmployeeException extends Exception{
	@SuppressWarnings("unused")
	private int salary;
	public EmployeeException(int salary) {
		this.salary=salary;
	}
	public String toString()
	{
		return "Salary is below than 3000";
	}
}
public class Exercise6 {
static void ValidateSalary(int salary)throws EmployeeException{
	if(salary<=3000)
	{
		throw new EmployeeException(salary);
	}
	else
	{
		System.out.println("your salary is accepted");
	}
}
public static void main(String[] args) throws EmployeeException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary");
	int salary= sc.nextInt();
	Exercise6.ValidateSalary(salary);
	sc.close();
}
}
