/**
 * Create two classes Employee_information and MMASaving_Account 
 * a.	Employee_information class will have fields empID, Employee_name, employee_designation , Employee_salary,
 * employee_comm with that they will have setter getter methods 
 * b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, 
 * isSalaryAccount with that they will have setter and getter methods
 * c.	Employee_information object and MMASaving_Account object belongs to a same entity assuming 
 * there are more than 5 entities how will you store the objects preserving the relation between them. 

 */
package com.cg.employee.model;

/**
 * @author ugawari
 *
 */
public class EmployeeInformation {

	private final int empID;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	private String employeeComm;
	
	private static int employeeNumber;
	
	static{
		employeeNumber=1000;
	}
	
	{
		empID=++employeeNumber;
	}
	
	public EmployeeInformation(String employeeName, String employeeDesignation, double employeeSalary, String employeeComm) {
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeComm = employeeComm;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeComm() {
		return employeeComm;
	}

	public void setEmployeeComm(String employeeComm) {
		this.employeeComm = employeeComm;
	}

	public int getEmpID() {
		return empID;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [empID=" + empID + ", employeeName="
				+ employeeName + ", employeeDesignation=" + employeeDesignation
				+ ", employeeSalary=" + employeeSalary + ", employeeComm="
				+ employeeComm + "]";
	}

	
}
