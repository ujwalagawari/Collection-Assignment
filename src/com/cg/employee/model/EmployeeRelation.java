/**
 * 
 */
package com.cg.employee.model;

/**
 * @author ugawari
 *
 */
public class EmployeeRelation {

	private EmployeeInformation employeeInformation;
	private MMASavingAccount mmaSavingAccount;
	
	public EmployeeRelation(EmployeeInformation employeeInformation, MMASavingAccount mmaSavingAccount) {
		this.employeeInformation = employeeInformation;
		this.mmaSavingAccount = mmaSavingAccount;
	}
	
	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}
	
	public MMASavingAccount getMmaSavingAccount() {
		return mmaSavingAccount;
	}

	@Override
	public String toString() {
		return "EmployeeRelation [employeeInformation=" + employeeInformation
				+ ", mmaSavingAccount=" + mmaSavingAccount + "]";
	}
	
	
	
}
