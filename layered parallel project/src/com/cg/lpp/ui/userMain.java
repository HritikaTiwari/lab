package com.cg.lpp.ui;

import java.util.Scanner;

public class userMain {
	public static void main(String args[]) {
		int ch;
		char choice;
		userModules ModulesObj = new userModules();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n *************BANK*************\n 1. Create Account \n 2. Show Balance \n 3. Deposit \n 4. Withdraw \n 5. Fund Transfer \n 6. Print Transactions \n 7. Exit\n*********************************");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			ModulesObj.createAccount();
				
				break;
			case 2:
		
				ModulesObj.showBalance();
			
				
				break;
			case 3:
				ModulesObj.deposit();
				break;
			case 4:
				ModulesObj.withdraw();
				break;
			case 5:
				ModulesObj.fundTransfer();
				break;
			case 6:
				ModulesObj.printTransactions();
				break;
			case 7:
		
				System.exit(0);
			
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
		} while(ch != 7 );
		sc.close();
	}
}
