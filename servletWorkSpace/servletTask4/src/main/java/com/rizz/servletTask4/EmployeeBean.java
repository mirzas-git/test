
package com.rizz.servletTask4;
public class EmployeeBean {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeGender;
	private String employeeProfile;
	private String employeeState;
	private String employeeAddress;
	private String employeehobbies;
	
	public EmployeeBean(){
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeState() {
		return employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeProfile() {
		return employeeProfile;
	}

	public void setEmployeeProfile(String employeeProfile) {
		this.employeeProfile = employeeProfile;
	}

	public String getEmployeehobbies() {
		return employeehobbies;
	}

	public void setEmployeehobbies(String employeehobbies) {
		this.employeehobbies = employeehobbies;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeSalary=" + employeeSalary + ", employeeState=" + employeeState
				+ ", employeeGender=" + employeeGender + ", employeeProfile=" + employeeProfile + ", employeehobbies="
				+ employeehobbies + "]";
	}
	
	
}
