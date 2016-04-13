package org.jnit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfEmployeeFirstNameSort implements Comparator<Employee> {

	public static void main(String[] args) {
		List<Employee>EmployeeList = new ArrayList<>();
		
		Employee e1 = new Employee("Ravi","Yadav","Kiran",10000);
		Employee e2 = new Employee("Henry","Phlliphe","Tim",8000);
		Employee e3 = new Employee("Zack","Snyder","Barron",6000);
		Employee e4 = new Employee("Zoe","Shannon","Mill",11000);
		
		
		EmployeeList.add(e1);
		EmployeeList.add(e2);
		EmployeeList.add(e3);
		EmployeeList.add(e4);
		
		//Collections.sort(EmployeeList);
		
		//for(Employee employeeObj : EmployeeList){
			//System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		//}
		
		Collections.sort(EmployeeList, new ListOfEmployeeFirstNameSort());
		
		for(Employee employeeObj : EmployeeList){
			System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		}

	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		 
		return arg0.getFirstName().compareTo(arg1.getFirstName());
	}

}
