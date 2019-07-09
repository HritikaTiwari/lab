package com.cg.lpp.service;

public interface userServiceI {

	void userAccountCreate(int accountId, String accountPassword);
	

	void getUserAccountDetails(int accountId, String accountPassword);

	void Deposit(int accountId, String accountPassword, int amount);

	void withDraw(int accountId, String accountPassword, int amount);

	void fundTransfer(int accountId, String accountPassword, int accountId2, int amount);

	void printTransactions(int accountId, String accountPassword);

	


}
