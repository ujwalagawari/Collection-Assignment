package com.cg.bank.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.cg.bank.exception.InsufficientBalanceException;
import com.cg.bank.exception.InvalidNumberException;

/**
 * @author ugawari
 *
 * Create a Class SavingAccount with field’s acc_balance, acc_ID,
 * accountHoldername, isSalaryAccount. Also add setter and getter
 * methods with business method like withdraw and deposit.
 * a. Create 5 different object of SavingAccount and add them into ArrayList, now
 * interate the arraylist and display all SavingAccount’s object one by one. 
 * b. Now save the ArrayList which contains SavingAccount’s object
 * into a file and read the file and display all savingAccount Object one by one.
 * c. Create class BankAccountList which will maintain
 * SavingAccount objects. Ensure that this class should not allow
 * duplicates as well as data should be displayed in sorted order. (as per acc_ID)
 */
public class SavingAccount implements Comparable<SavingAccount>,Serializable{

	private static final long serialVersionUID = 1L;
	
	private final int accountId;
	private String accountHolderName;
	private boolean isSalaryAccount;
	private float accountBalance;
	private static int accountNumber;
	
	static{
		accountNumber=1000;	//declare the account number to a value and from that value account id will be increment
	}
	
	{
		accountId=++accountNumber; //account id is auto increment
	}
	
	/**
	 * To initialize properties of Saving Account class
	 * @param accountHoldername
	 * @param isSalaryAccount
	 * @param accountBalance
	 */
	public SavingAccount(String accountHolderName,  boolean isSalaryAccount, float accountBalance) {
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
		this.accountBalance = accountBalance;
	}

	
	public SavingAccount() {
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	
	public static int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}


	@Override
	public String toString() {
		return "SavingAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount
				+ ", accountBalance=" + accountBalance + "]";
	}

	/**
	 * Withdraw method used to withdraw amount from account if amount is positive and greater than zero
	 * else throws exception
	 * @param amount
	 * @throws Exception
	 */
	public void withdraw(float amount) throws Exception{
		if(amount>0 && this.accountBalance-amount<0){
			this.accountBalance-=amount;
		}else if(amount<0){
			throw new InvalidNumberException("Invalid Number.");
		}else{
			throw new InsufficientBalanceException("Invalid Balance.");
		}
	}
	
	/**
	 * To deposit money into account only  if amount is positive and greater than zero
	 * else throws exception
	 * @param amount
	 * @throws Exception
	 */
	public void deposit(float amount) throws Exception{
		if(amount>0){
			this.accountBalance+=amount;
		}else if(amount<0){
			throw new InvalidNumberException("Invalid Number.");
		}else{
			throw new InsufficientBalanceException("Invalid Balance.");
		}
	}

	/**
	 * Save List of saving accounts in file.
	 * @param list
	 * @param path
	 * @throws IOException
	 */
	public void saveInFile(List<SavingAccount> list, String path) throws IOException {
		File file = new File(path);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(list);
		/*FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(list.toString());*/
		objectOutputStream.close();
		fileOutputStream.close();
	}

	/**
	 * Retrieve saving accounts List which is stored in file by passing file name with pah
	 * @param path
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<SavingAccount> readArrayFromFile(String path) throws IOException, ClassNotFoundException {
		ArrayList<SavingAccount> savingAccounts = null;
		File file = new File(path);
		if(file.exists()){
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			savingAccounts = (ArrayList<SavingAccount>) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
		}else if(!file.exists()){
			new FileNotFoundException("File Not Found.");
		}else{
			new IOException("Conversion into file fails.");
		}
		return savingAccounts;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accountBalance);
		result = prime
				* result
				+ ((accountHolderName == null) ? 0 : accountHolderName
						.hashCode());
		result = prime * result + accountId;
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Float.floatToIntBits(accountBalance) != Float
				.floatToIntBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountId != other.accountId)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	/**
	 * sort data by ascending based on account Id
	 */
	@Override
	public int compareTo(SavingAccount savingAccount) {
		return accountId-savingAccount.accountId;
	}

	
	
}
