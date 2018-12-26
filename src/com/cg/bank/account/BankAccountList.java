/**
 * 
 */
package com.cg.bank.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ugawari
 *
 * Create class BankAccountList which will maintain
 * SavingAccount objects. Ensure that this class should not allow
 * duplicates as well as data should be displayed in sorted order. (as per acc_ID)
 */
public class BankAccountList {

	private Set<SavingAccount> treeSet;
	
	/**
	 * Method to convert list into tree set so it should not allow
	 * duplicates as well as data should be displayed in sorted order. (as per acc_ID)
	 * @param list
	 * @return
	 */
	public Set<SavingAccount> bankAccountListWithoutDuplicates(List<SavingAccount> list){
		 return treeSet=new TreeSet<SavingAccount>(list);
	}

	
}
