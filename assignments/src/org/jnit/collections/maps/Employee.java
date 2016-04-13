package org.jnit.collections.maps;

public class Employee implements Comparable<Employee>{

	
	
	private String firstName;
	private String lastName;
	private String middleName;
	private int salary;
	
	public Employee(String firstName,String lastName,String middleName,int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee arg0) {
		Integer intObj =  this.getSalary();//new Integer(this.getSalary());
		return intObj.compareTo(arg0.getSalary());
	}
	
	
	@Override
	public int hashCode() {
		return firstName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	    Employee emp = (Employee)obj;
		return this.getFirstName().equals(emp.getFirstName());
	}
	
	
}
