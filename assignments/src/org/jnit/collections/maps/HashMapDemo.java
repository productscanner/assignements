/*
 * 27. Demonstrate how HashMap prevents duplicate Keys to come-in to the data structure with an example- 
 * create a custom class and have the class object as the key, show how do we iterate 
 * and print key-value pairs as well?*/
//Hash Collision.. Two are more keys have same
package org.jnit.collections.maps;

import java.util.HashMap;
import java.util.Map;

import org.jnit.collections.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String>StringHashMap = new HashMap<>();
		
		StringHashMap.put("B","Blue");
		StringHashMap.put("G","Green");
		StringHashMap.put("Y","Green");
		StringHashMap.put("W","Green");
		StringHashMap.put("B","Black");
		StringHashMap.put("G","Gray");
		
		System.out.println(StringHashMap.get("B"));
		System.out.println(StringHashMap.get("G"));
		System.out.println(StringHashMap.size());
		
		
		// Method of iterating through the map
		for(Map.Entry<String, String> entry: StringHashMap.entrySet()){
			System.out.print(entry.getKey()+" : ");
			System.out.println(entry.getValue());
		}

		System.out.println("---------------------");
		
		
		Map<Employee,Boolean>EmployeeMap = new HashMap<>();
		
		Employee e1 = new Employee("Ravi","Yadav","Kiran",10000);
		Employee e2 = new Employee("Henry","Phlliphe","Tim",8000);
		Employee e3 = new Employee("Zack","Snyder","Barron",6000);
		Employee e4 = new Employee("Zoe","Shannon","Mill",11000);
		Employee e5 = new Employee("Zoe","Maverick","Mill",11000);
		
		EmployeeMap.put(e1, true);
		EmployeeMap.put(e2, true);
		EmployeeMap.put(e3, true);
		EmployeeMap.put(e4, true);
		EmployeeMap.put(e5, false);
		
		for(Map.Entry<Employee, Boolean> entry: EmployeeMap.entrySet()){
			System.out.print(entry.getKey().getFirstName()+" : ");
			System.out.println(entry.getValue());
		}
	
		
	}

}
