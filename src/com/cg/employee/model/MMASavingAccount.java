
package com.cg.employee.model;

/**
 * @author ugawari
 *
 * MMASaving Account class will have fields accountID, accountholder_name, account_balance, 
 * isSalaryAccount with that they will have setter and getter methods
 */
public class MMASavingAccount {

	private int accountID;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalary;
	
	private static int accountNumber;
	
	static{
		accountNumber = 1000;
	}
	
	{
		accountID = ++accountNumber;
	}
	
	public MMASavingAccount(String accountHolderName, double accountBalance, boolean isSalary) {
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalary = isSalary;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public boolean isSalary() {
		return isSalary;
	}

	@Override
	public String toString() {
		return "MMASavingAccount [accountID=" + accountID
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalary="
				+ isSalary + "]";
	}

	
}
