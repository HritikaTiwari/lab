package collectionEx;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args)
	{
		Employee e = new Employee(123,"suresh"); 
		Employee e1 = new Employee(123,"naresh"); 
		Employee e2 = new Employee(123,"rajesh"); 
		Employee e3 = new Employee(123,"ramesh"); 
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e);
		System.out.println(a1);
	}

}
