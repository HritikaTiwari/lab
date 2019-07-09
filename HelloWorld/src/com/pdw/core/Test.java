package com.pdw.core;

public class Test {

	public void m1()
	{
		System.out.println("this is test class instance method");
		
	}
	public static void m2()
	{
		System.out.println("this is test class static method");
		
	}
	public int add()
	{
		int a=10;
		int b=20;
		return a+b;
	}
	public int sub(int a,int b)
	{
		
		return a-b;
	}
	public static void main(String[] args)
	{
		Test.m2();
		Test t=new Test();
		t.m1();
	    int sum=t.add();
		int minus=t.sub(12,13);
		System.out.println(sum+" "+minus);
	}
}
