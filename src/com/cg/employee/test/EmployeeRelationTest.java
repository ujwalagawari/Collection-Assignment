/**
 * 
 */
package com.cg.employee.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.cg.employee.model.EmployeeInformation;
import com.cg.employee.model.EmployeeRelation;
import com.cg.employee.model.MMASavingAccount;

/**
 * @author ugawari
 *
 */
public class EmployeeRelationTest {

	private EmployeeRelation employeeRelation;
	private EmployeeInformation employeeInformation;
	private MMASavingAccount mmaSavingAccount;

	@Test
	public void test() {
		employeeInformation = new EmployeeInformation("Ujwala", "Thane", 75000.50, "987654321");
		mmaSavingAccount = new MMASavingAccount("Ujwala", 80000, true);
		employeeRelation = new EmployeeRelation(employeeInformation, mmaSavingAccount);
		System.out.println(employeeRelation.toString());
	}

}
