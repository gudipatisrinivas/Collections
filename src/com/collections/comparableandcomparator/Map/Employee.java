package com.collections.comparableandcomparator.Map;

public class Employee {
	
	private String lastname;
	private String firstname;
	private String dept;
	private Double salary;
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [lastname=" + lastname + ", firstname=" + firstname + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	public Employee(String lastname, String firstname, String dept, Double salary) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.dept = dept;
		this.salary = salary;
	}

}
