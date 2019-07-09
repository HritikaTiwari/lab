package com.cg.mra.ui;

import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class MainUI {
	public void showMenu()
	{
		System.out.println("Press 1 for Account Balance Enquiry");
		System.out.println("Press 2 for Recharge Acoount");
		System.out.println("Press 3 for exit");
	}
	public int getOption(Scanner scanner)
	{
		try {
			int option =scanner.nextInt();
			return option;
			
		}
		catch(Throwable e) {
			e.printStackTrace();
			return -1;
			}
	}
	private AccountService accountService = new AccountServiceImpl(new AccountDaoImpl());
	public AccountService getAccountService() {
		return accountService;
	}
	public void choose()
	{
		boolean run= true;
		while (run) {
			showMenu();
			Scanner scanner= new Scanner(System.in);
			int option = getOption(scanner);
			if(option == -1)
			{
				run= false;
			}
			switch(option)
			{
			case 1:{
				try {
					System.out.println("Enter mobile no:");
					String mobileNo = scanner.next();
					AccountService service= getAccountService();
					Account account = service.getAccountDetails(mobileNo);
					System.out.println("Customer Name=" + account.getCustomerName());
					System.out.println("Account Type=" + account.getAccountType());
					System.out.println("Balance=" + account.getAccountBalance());
				}
				catch(AccountNotFoundException e)
				{
					System.out.println("Mobile no. does not exist");
				}
				catch(IncorrectMobileNoException e)
				{
					System.out.println("Mobile no. is not correct");
				}
				catch(Throwable e)
				{
					System.out.println("Sorry something went wrong");
				}
				break;
				
			case 2:{
				try {
					System.out.println("Enter mobile no:");
					String mobileNo = scanner.next();
					System.out.println("Enter recharge amount");
					double rechargeAmount = scanner.nextDouble();
					AccountService service= getAccountService();
					Account account = service.getAccountDetails(mobileNo);
					int balanceNow= service.rechargeAccount(mobileNo, rechargeAmount);
					
					
					System.out.println("your Account Recharged successfully");
					System.out.println("Gello=" + account.getCustomerName()+ "Available Balance" + balanceNow);
					
				}
				catch(AccountNotFoundException e)
				{
					e.printStackTrace();
					System.out.println("Can not recharge as Mobile np does not exist");
				}
				catch(IncorrectMobileNoException e)
				{
					System.out.println("incorrent mobile no.");
				}
				catch(Throwable e)
				{
					System.out.println("Sorry something went wrong");
				}
				break;
				
			}
			default:{
				run=false;
				System.out.println("Thank you for using application!");
			}
			}
		}
	}
	public static void main(String[] args) {
		MainUI ui = new MainUI();
	
	ui.choose();
	}
}
