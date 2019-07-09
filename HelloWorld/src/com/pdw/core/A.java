package com.pdw.core;

class B {
  public void m1()
  {
	  System.out.println("A class m1 method");
  }
  public void m2()
  {
	  System.out.println("A class m2 method");
  }
}
public class A extends  B
{
	public void add()
	{
		int a=12;
		int b=13;
		System.out.println("addition of two numbers: "+(a+b));
	}
	public static void main(String[] args)
	{
		
		Test t=new Test();
	t.add();
	t.m1();
		
	}
}

