package com.cg.lpp.service;

import com.cg.lpp.bean.userBean;
import com.cg.lpp.dao.userDAO;

public class userService {
userDAO DaoObj = new userDAO();
	
	public void bankAccountCreate(userBean BeanObjCreateAccountObj) {
	
		DaoObj.addCustomer(BeanObjCreateAccountObj);
	}
	
	public void showBalanceSer(userBean BeanShowBalObj) {
		
		if(DaoObj.hm().isEmpty()) {									// CHECKING IF HASH MAP IS EMPTY OR NOT
			System.out.println("Please create an account first.");
		}
		else {
			if(DaoObj.hm().containsKey(BeanShowBalObj.getAccNo())) {
				System.out.println("Your Account Balance is: " +DaoObj.hm().get(BeanShowBalObj.getAccNo()).getBalance());			// FETCHING THE BALANCE FROM HASHMAP & PRINTING 
			}
			else {
				System.out.println("No such Account Exist.");
			}
		}
	}
	
	public void depositSer(userBean BeanDepObj) {
		
		if(DaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first.");
		}
		else {
			if(DaoObj.hm().containsKey(BeanDepObj.getAccNo())) {
				float dep = BeanDepObj.getDepAmount() + DaoObj.hm().get(BeanDepObj.getAccNo()).getBalance();						// ADDING DEPOSIT AMOUNT TO BANK ACCOUNT
				DaoObj.hm().get(BeanDepObj.getAccNo()).setBalance(dep);
				System.out.println("Deposited successfully.");
				System.out.println("Your account balance is: " +DaoObj.hm().get(BeanDepObj.getAccNo()).getBalance());					// PRINTING THE BANK BALANCE
			}
			else {
				System.out.println("No such Account Exist.");
			}
		}
	}
	
	public void withdrawSer(userBean BeanWithdrawObj) {
		if(DaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first.");
		}
		else {
			if(BeanWithdrawObj.getWithdrawAmount() > DaoObj.hm().get(BeanWithdrawObj.getAccNo()).getBalance()) {		// CHECKING IF WITHDRAW AMOUNT IS GREATER THAN BALANCE OR NOT
				System.out.println("Can't withdraw money. Account Balance is low.");
			}
			else {
				if(DaoObj.hm().containsKey(BeanWithdrawObj.getAccNo())) {
					float dep = DaoObj.hm().get(BeanWithdrawObj.getAccNo()).getBalance() - BeanWithdrawObj.getWithdrawAmount();			// DECREMENTING WITHDRAW AMOUNT FROM BANK ACCOUNT
					DaoObj.hm().get(BeanWithdrawObj.getAccNo()).setBalance(dep);
					System.out.println("Withdraw successful.");
					System.out.println("Your account balance is: " +DaoObj.hm().get(BeanWithdrawObj.getAccNo()).getBalance());				// PRINTING REMAINING BALANCE
				}
				else {
					System.out.println("No such Account Exist.");
				}
			}
		}
	}
	
	public void transferSer(userBean BeanFundTransObj) {
		if(DaoObj.hm().isEmpty()) {
			System.out.println("Please create an account first.");
		}
		else {
			if(DaoObj.hm().containsKey(BeanFundTransObj.getSourceAccNo())) {				// CHECKING IF SOURCE ACCOUNT EXIST
				if(DaoObj.hm().containsKey(BeanFundTransObj.getDestAccNo())){				// CHECKING IF DESTINATION ACCOUNT EXIST
					if(DaoObj.hm().get(BeanFundTransObj.getSourceAccNo()).getBalance() > BeanFundTransObj.getTransferAmount()) {		// CHECKING IF TRANSFER AMOUNT IS GREATER THAN BALANCE OR NOT
						float transfer = BeanFundTransObj.getTransferAmount();
						DaoObj.hm().get(BeanFundTransObj.getSourceAccNo()).setBalance(DaoObj.hm().get(BeanFundTransObj.getSourceAccNo()).getBalance() - transfer);		// DECREMENTING THE TRANSFER AMOUNT
						DaoObj.hm().get(BeanFundTransObj.getDestAccNo()).setBalance(DaoObj.hm().get(BeanFundTransObj.getDestAccNo()).getBalance() + transfer);			// ADDING THE TRANSFER AMOUNT
						System.out.println("Funds Transferred Successfully.");
						System.out.println("Remaining balance in account number "+BeanFundTransObj.getSourceAccNo()+" is: " +DaoObj.hm().get(BeanFundTransObj.getSourceAccNo()).getBalance());
					}
					else {
						System.out.println("Can't transfer money. Source Account Balance is low.");
					}
				}
				else {
					System.out.println("Destination Account Not Exist.");
				}
			}
			else {
				System.out.println("Source Account Not Exist.");
			}
		}
	}
	
}
