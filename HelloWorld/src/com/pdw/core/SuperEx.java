package com.pdw.core;
class ParentEx{
	static int a=10;
	public ParentEx()
	{
		System.out.println("default constructor");
	}
	ParentEx(int a)
	{
		this();
		System.out.println("Parameterized constructor");
	}
	
public void m1()
	{
		System.out.println("parent class method");
	}
}
class SuperEx extends ParentEx {
static int a=20;
SuperEx()
{
	super();
	super.m1();
	this.m1();
	System.out.println(this.a);
	System.out.println(super.a);
	System.out.println(this);
	System.out.println("child class constructor");
}
public void m1()
{
	System.out.println("child class method");
}
public static void main(String args[])
{
	SuperEx e=new SuperEx();
	System.out.println(e);
	ParentEx p=new ParentEx(12);
}

}

