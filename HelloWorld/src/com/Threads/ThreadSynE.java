package com.Threads;
class Account{
	public int balance;

	public Account() {
		 balance=5000;
	}
	public synchronized void withdraw(int bal) {
	try{
		Thread.sleep(1000);
		}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	balance =balance-bal;
	System.out.println("Amount Withdrawn: "+bal);
	System.out.println("Remaining Balance: "+balance);
	}
	public synchronized void deposit(int bal) {
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		balance =balance + bal;
		System.out.println("Amount Withdrawn: "+bal);
		System.out.println("New Balance: "+balance);
		}
	public synchronized void enquiry()
	{
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Available balance =" +balance);
	}
}
class Transaction implements Runnable{
Account obj;
Transaction (Account a){
	obj=a;
}
	public void run() {
		obj.withdraw(500);
		obj.deposit(1000);
		obj.enquiry();
		}
}
public class ThreadSynE {
	public static void main(String[] args)
	{
		Account a= new Account();
		Transaction w1 = new Transaction(a);
		Thread t1=new Thread(w1);
		Thread t2=new Thread(w1);
		t1.start();
		t2.start();
	}
}

