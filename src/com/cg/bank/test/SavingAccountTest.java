/**
 * 
 */
package com.cg.bank.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.bank.account.BankAccountList;
import com.cg.bank.account.SavingAccount;

/**
 * @author ugawari
 *
 */
public class SavingAccountTest {

	private Logger logger = Logger.getLogger(SavingAccount.class.getName());
	private SavingAccount savingAccount,savingAccount1, savingAccount2, savingAccount3, savingAccount4, savingAccount5;
	private List<SavingAccount> list;
	private BankAccountList bankAccountList;
	
	@Before
	public void setUp() {
		bankAccountList = new BankAccountList();
		savingAccount = new SavingAccount();
		savingAccount1 = new SavingAccount("Ujwala", false, 40000);
		savingAccount2 = new SavingAccount("Mrudula", true, 35000);
		savingAccount3 = new SavingAccount("Shubham", false, 35000);
		savingAccount4 = new SavingAccount("Priyanka", true, 50000);
		savingAccount5 = new SavingAccount("Hema", true, 35000);
	}

	@Test
	public void testForIteration() {
		list = new ArrayList<SavingAccount>();
		list.add(savingAccount1);
		list.add(savingAccount2);
		list.add(savingAccount3);
		list.add(savingAccount4);
		list.add(savingAccount5);
		Iterator<SavingAccount> iterator = list.iterator();
		while (iterator.hasNext()) {
			SavingAccount savingAccount = (SavingAccount) iterator.next();
			logger.info(savingAccount.toString());
		}
	}
	
	@Test
	public void saveListIntoFile() {
		list = new ArrayList<SavingAccount>();
		list.add(savingAccount1);
		list.add(savingAccount2);
		list.add(savingAccount3);
		list.add(savingAccount4);
		list.add(savingAccount5);
		String path = "c:/work/savingAccount.txt";
		try {
			savingAccount.saveInFile(list, path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void readFileOfList() {
		savingAccount = new SavingAccount();
		String path = "c:/work/savingAccount.txt";
		try {
			ArrayList<SavingAccount> savingAccounts = savingAccount.readArrayFromFile(path);
			Iterator<SavingAccount> itr = savingAccounts.iterator();
			while(itr.hasNext()){
				SavingAccount savingAccount = itr.next();
				logger.info(savingAccount.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBankAccountListWithoutDuplicatesInAscById() {
		list = new ArrayList<SavingAccount>();
		list.add(savingAccount1);
		list.add(savingAccount2);
		list.add(savingAccount3);
		list.add(savingAccount4);
		list.add(savingAccount5);
		Set<SavingAccount> set= bankAccountList.bankAccountListWithoutDuplicates(list);
		Iterator<SavingAccount> iterator = set.iterator();
		while (iterator.hasNext()) {
			SavingAccount savingAccount = (SavingAccount) iterator.next();
			logger.info(savingAccount.toString());
		}
	}
	
	@After
	public void tearDown(){
	}
}
