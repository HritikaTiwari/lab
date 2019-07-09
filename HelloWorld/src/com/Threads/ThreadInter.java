package com.Threads;

class Number{
	public int n;
	boolean value=false;
	synchronized void even(int n)
	{
		if(!value)
		{
			try{
				wait();
				}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}}
			this.n=n;
			System.out.println(n);
			value=false;
			notifyAll();
		}

synchronized void odd(int n)
{
	if(value)
	{
		try{
			wait();
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}}
		this.n=n;
		System.out.println(n);
		value=true;
		notifyAll();
	}
}
class Odd implements Runnable
{
	Number num;
	Odd(Number num){
	this.num=num;
	new Thread(this,"odd").start();
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i=i+2)
		{
			num.odd(i);
		}
		
	}
}
class Even implements Runnable
{
	Number num;
	Even(Number num){
	this.num=num;
	new Thread(this,"even").start();
	}
	@Override
	public void run() {
		for(int i=2;i<=100;i=i+2)
		{
			num.even(i);
		}
		
	}
}

public class ThreadInter {
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Number number=new Number();
		Even e=new Even(number);
		Odd d=new Odd(number);
	}

}

