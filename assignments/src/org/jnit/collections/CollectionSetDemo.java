//Collection(I)
//Set(I) Extends Collection(I)
//HashSet(C) Implements Set(I)
//LinkedHashSet extends HashSet
//SortedSet(I) extends Set(I)
//TreeSet(C) implements SortedSet(Ifrf)
/*Demonstrate the creation of collection HashSet, LinkedHashset and TreeSet for strings, 
	integers, custom objects (Employee or Student) and perform add, remove, clear, contains,
	looping through for-each and iterator
*/


package org.jnit.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetDemo {

	public static void main(String[] args) {
		System.out.println("--------------HashSet Demo-----------");
		System.out.println("-----String HashSet-------");
		Set<String>StringHashSet = new HashSet<>();
		StringHashSet.add("Hello");
		StringHashSet.add("String");
		StringHashSet.add("HashSet");
		StringHashSet.add("Demo");
		
		StringHashSet.add("Demo");
		StringHashSet.remove("Demo");
		
		for(String string:StringHashSet){
			System.out.println(string);
		}
		
		System.out.println(StringHashSet.contains("HashSet"));
		
		Iterator StringHSItr = StringHashSet.iterator();
	    while(StringHSItr.hasNext()) {
		       Object element = StringHSItr.next();
		        System.out.println(element + " ");
		    }
	    
	    StringHashSet.clear();
		System.out.println("------------------------");
		
		
		
		System.out.println("-----String HashSet-------");
		Set<Integer>IntegerHashSet = new HashSet<>();
		IntegerHashSet.add(1);
		IntegerHashSet.add(2);
		IntegerHashSet.add(3);
		IntegerHashSet.add(4);
		
		IntegerHashSet.add(3);
		IntegerHashSet.remove(3);
		
		for(Integer number:IntegerHashSet){
			System.out.println(number);
		}
		
		System.out.println(IntegerHashSet.contains(3));
		
		Iterator IntegerHSItr = IntegerHashSet.iterator();
	    while(IntegerHSItr.hasNext()) {
		       Object element = IntegerHSItr.next();
		        System.out.println(element + " ");
		    }
	    
	    IntegerHashSet.clear();
		System.out.println("------------------------");
		
		System.out.println("-----Employee HashSet-------");
		Set<Employee>EmployeeHashSet = new HashSet<>();
		Employee e1 = new Employee("Ravi","Yadav","Kiran",10000);
		Employee e2 = new Employee("Henry","Phlliphe","Tim",8000);
		Employee e3 = new Employee("Zack","Snyder","Barron",6000);
		Employee e4 = new Employee("Zoe","Shannon","Mill",11000);
		Employee e5 = new Employee("Zoe","Maverick","Mill",11000);
		
		EmployeeHashSet.add(e1);
		EmployeeHashSet.add(e2);
		EmployeeHashSet.add(e3);
		EmployeeHashSet.add(e4);
		
		EmployeeHashSet.add(e5);
		EmployeeHashSet.remove(e3);
		
		for(Employee employeeObj:EmployeeHashSet){
			System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		}
		
		System.out.println(EmployeeHashSet.contains(e3));
		
		Iterator EmployeeHSItr = EmployeeHashSet.iterator();
	    while(EmployeeHSItr.hasNext()) {
		       Employee element = (Employee)EmployeeHSItr.next();
		       System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
		    }
	    
	    EmployeeHashSet.clear();
		System.out.println("------------------------");
		System.out.println("--------------------------------------------------------------------------");
	
		
		System.out.println("--------------LinkedHashSet Demo-----------");
		System.out.println("-----String LinkedHashSet-------");
		Set<String>StringLinkedHashSet = new LinkedHashSet<>();
		StringLinkedHashSet.add("Hello");
		StringLinkedHashSet.add("String");
		StringLinkedHashSet.add("HashSet");
		StringLinkedHashSet.add("Demo");
		
		StringLinkedHashSet.add("Demo");
		StringLinkedHashSet.remove("Demo");
		
		for(String string:StringLinkedHashSet){
			System.out.println(string);
		}
		
		System.out.println(StringLinkedHashSet.contains("HashSet"));
		
		Iterator StringLinkedHSItr = StringLinkedHashSet.iterator();
	    while(StringLinkedHSItr.hasNext()) {
		       Object element = StringLinkedHSItr.next();
		        System.out.println(element + " ");
		    }
	    
	    StringLinkedHashSet.clear();
		System.out.println("------------------------");
		
		
		
		System.out.println("-----Integer LinkedHashSet-------");
		Set<Integer>IntegerLinkedHashSet = new LinkedHashSet<>();
		IntegerLinkedHashSet.add(1);
		IntegerLinkedHashSet.add(2);
		IntegerLinkedHashSet.add(3);
		IntegerLinkedHashSet.add(4);
		
		IntegerLinkedHashSet.add(3);
		IntegerLinkedHashSet.remove(3);
		
		for(Integer number:IntegerLinkedHashSet){
			System.out.println(number);
		}
		
		System.out.println(IntegerLinkedHashSet.contains(3));
		
		Iterator IntegerLinkedHSItr = IntegerLinkedHashSet.iterator();
	    while(IntegerLinkedHSItr.hasNext()) {
		       Object element = IntegerLinkedHSItr.next();
		        System.out.println(element + " ");
		    }
	    
	    IntegerLinkedHashSet.clear();
		System.out.println("------------------------");
		
		System.out.println("-----Employee LinkedHashSet-------");
		Set<Employee>EmployeeLinkedHashSet = new LinkedHashSet<>();
		
		
		EmployeeLinkedHashSet.add(e1);
		EmployeeLinkedHashSet.add(e2);
		EmployeeLinkedHashSet.add(e3);
		EmployeeLinkedHashSet.add(e4);
		
		EmployeeLinkedHashSet.add(e5);
		EmployeeLinkedHashSet.remove(e3);
		
		for(Employee employeeObj:EmployeeLinkedHashSet){
			System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		}
		
		System.out.println(EmployeeLinkedHashSet.contains(e3));
		
		Iterator EmployeeLinkedHSItr = EmployeeLinkedHashSet.iterator();
	    while(EmployeeLinkedHSItr.hasNext()) {
		       Employee element = (Employee)EmployeeLinkedHSItr.next();
		       System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
		    }
	    
	    EmployeeLinkedHashSet.clear();
		System.out.println("------------------------");
		System.out.println("--------------------------------------------------------------------------");
	
		
		System.out.println("--------------TreeSet Demo-----------");
		System.out.println("-----String TreeSet-------");
		Set<String>StringTreeSet = new TreeSet<>();
		StringTreeSet.add("Hello");
		StringTreeSet.add("String");
		StringTreeSet.add("HashSet");
		StringTreeSet.add("Demo");
		
		StringTreeSet.add("Demo");
		StringTreeSet.remove("Demo");
		
		for(String string:StringTreeSet){
			System.out.println(string);
		}
		
		System.out.println(StringTreeSet.contains("HashSet"));
		
		Iterator StringTreeSetItr = StringTreeSet.iterator();
	    while(StringTreeSetItr.hasNext()) {
		       Object element = StringTreeSetItr.next();
		        System.out.println(element + " ");
		    }
	    
	    StringTreeSet.clear();
		System.out.println("------------------------");
		
		
		
		System.out.println("-----Integer TreeSet-------");
		Set<Integer>IntegerTreeSet = new TreeSet<>();
		IntegerTreeSet.add(1);
		IntegerTreeSet.add(2);
		IntegerTreeSet.add(3);
		IntegerTreeSet.add(4);
		
		IntegerTreeSet.add(3);
		IntegerTreeSet.remove(3);
		
		for(Integer number:IntegerTreeSet){
			System.out.println(number);
		}
		
		System.out.println(IntegerTreeSet.contains(3));
		
		Iterator IntegerTreeSetItr = IntegerTreeSet.iterator();
	    while(IntegerTreeSetItr.hasNext()) {
		       Object element = IntegerTreeSetItr.next();
		        System.out.println(element + " ");
		    }
	    
	    IntegerTreeSet.clear();
		System.out.println("------------------------");
		
		System.out.println("-----Employee TreeSet-------");
		Set<Employee>EmployeeTreeSet = new TreeSet<>();
		
	 
		
		EmployeeTreeSet.add(e1);
		EmployeeTreeSet.add(e2);
		EmployeeTreeSet.add(e3);
		EmployeeTreeSet.add(e4);
		
		EmployeeTreeSet.add(e5);
		//EmployeeLinkedHashSet.remove(e3);
		
		for(Employee employeeObj:EmployeeTreeSet){
			System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		}
		
		System.out.println(EmployeeTreeSet.contains(e3));
		
		Iterator EmployeeTreeSetItr = EmployeeTreeSet.iterator();
	    while(EmployeeTreeSetItr.hasNext()) {
		       Employee element = (Employee)EmployeeTreeSetItr.next();
		       System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
		    }
	    
	    EmployeeTreeSet.clear();
		System.out.println("------------------------");
		System.out.println("--------------------------------------------------------------------------");
	}

}
