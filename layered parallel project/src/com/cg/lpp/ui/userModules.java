package com.cg.lpp.ui;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.cg.lpp.bean.userBean;
import com.cg.lpp.service.userService;



public class userModules {

	userService ServiceObj = new userService();
	Scanner sc = new Scanner(System.in);
	
	//************************************************************************************************
	//*************BANK MAIN MODULES METHODS**********************************************************
	//************************************************************************************************
	public void createAccount() {
		System.out.print("Enter Name: ");
		String name = nameCheck(sc.next());
		System.out.print("Enter Mobile No.: ");
		long mobNo = mobCheck(sc.nextLong());
		long accNo = mobNo - 1234;
		System.out.print("Enter Balance: "); 
		float balance = amountCheck(sc.nextFloat());
		userBean BeanObjCreateAccountObj = new userBean(accNo, name, mobNo, balance);
		System.out.println("Account created with Account Number: " +accNo);
		ServiceObj.bankAccountCreate(BeanObjCreateAccountObj);
		
	
	}
	
	public void showBalance() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		userBean BeanShowBalObj = new userBean(accNo);
		ServiceObj.showBalanceSer(BeanShowBalObj);
	}
	
	public void deposit() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Deposit Amount: ");
		float depAmount = amountCheck(sc.nextFloat());
		userBean BeanDeptObj = new userBean(accNo, depAmount);
		ServiceObj.depositSer(BeanDeptObj);
	}
	
	public void withdraw() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		System.out.print("Enter Withdraw Amount: ");
		float withdrawAmount = amountCheck(sc.nextFloat());
		userBean BeanWithdrawObj = new userBean(withdrawAmount, accNo);
		ServiceObj.withdrawSer(BeanWithdrawObj);
	}
	
	public void fundTransfer() {
		System.out.println("Enter Source Account Number: ");
		long sourceAccNo = sc.nextLong();
		System.out.println("Enter Destination Account Number: ");
		long destAccNo = sc.nextLong();
		System.out.println("Enter Amount to transfer: ");
		float transferAmount = amountCheck(sc.nextFloat());
		// CHECK IF THE SOURCE ACCOUNT NUMBER IS NOT SAME AS DESTINATION ACCOUNT NUMBER
		if(sourceAccNo == destAccNo) {
			System.out.println("Account number should be different");
			System.out.println("Enter again: ");
			sourceAccNo = sc.nextInt();
		}
		else {
			System.out.println(" ");
		}
	    userBean BeanFundTransObj = new userBean(sourceAccNo, destAccNo, transferAmount);
		ServiceObj.transferSer(BeanFundTransObj);
		
		String transactions =transferAmount+ " transferred from Account number " +sourceAccNo+ " to " +destAccNo  ;
		BeanFundTransObj = new userBean(transactions);
	}
	
	public void printTransactions() {
		
		System.out.println(Arrays.toString(userBean.transactions));
		
	}
	//********************************************************************************************************
	
	
	
	
	//********************************************************************************************************
	//*************CHECKER METHODS****************************************************************************
	//********************************************************************************************************
	
	
	
	
	
	
	// METHOD TO CHECK IF THE AMOUNT IS SMALLER THAN 0 OR NOT
	public float amountCheck(float amount) {
		while(true) {
			if(amount<=0) {
				System.out.println("Amount should be greater than 0.");
				System.out.println("Enter again: ");
				amount = sc.nextInt();
			}
			else {
				return amount;
			}
		}
	}
	
	// METHOD TO CHECK THE NAME
	public String nameCheck(String name) {
		while(true) {
			if(Pattern.matches("[A-Z][a-z]{3,10}", name)){
				return name;
			}
			else {
				System.out.println("Name should have first capital alphabet and rest small alphabets.");
				System.out.println("Enter again: ");
				name = sc.next();
			}
		}
	}
	
	//	METHOD TO CHECK THE LENGTH OF MOBILE NUMBER
	public long mobCheck(long mob) { 
		while(true) {
			if(String.valueOf(mob).length() != 10) {
				System.out.println("Enter valid mobile number.");
				mob = sc.nextLong();
			}
			else {
				return mob;
			}
		}
	}
	//********************************************************************************************************

}
