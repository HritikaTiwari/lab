package poly.overloading;

class Aa
{
	int a=111;
	public void m1() {
		this.a=++a;
		System.out.println("After increment value is"+a);
	}
}
public class Pest extends Aa{
	public void m1()
	{
		super.a= --a;
		System.out.println("After decrement value is"+a);
		
	}
public static void main(String[] args)
{
	Pest p= new Pest();
	p.m1();
	Aa a=new Aa();
	a.m1();
}
}
