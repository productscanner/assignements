/* Demonstrate the creation of collection Array-list, Linked-List and Vector by adding string objects, 
 * integer objects and a custom object of your choice and perform add, remove, clear, get with index, get with object, 
 * contains, looping through, for the list created with custom object with both iterator, 
 * list-iterator and for-each.*/


package org.jnit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsListDemo {

	public static void main(String[] args) {
	
		System.out.println("-----------ArrayList Demo-----------");
		System.out.println("-----String ArrayList-------");
		
		List<String>StringArrayList = new ArrayList<>();
		StringArrayList.add("Hello");
		StringArrayList.add("String");
		StringArrayList.add("Arraylist");
		StringArrayList.add("Demo");
		
		StringArrayList.remove("Demo");

		System.out.println(StringArrayList.get(0));
		System.out.println(StringArrayList.contains("ArrayList"));

		System.out.println("------foreach------");
		for(String string:StringArrayList){
			System.out.println(string);
		}
		
		
		 // Use iterator to display contents of al
		System.out.println("------iterator------");
	      Iterator StringItr = StringArrayList.iterator();
	      while(StringItr.hasNext()) {
	         Object element = StringItr.next();
	         System.out.println(element + " ");
	      }
	      System.out.println("------------------------");
		
	      
	    System.out.println("-----Integer ArrayList-------");  
		List<Integer>IntegerArrayList = new ArrayList<>();
		IntegerArrayList.add(0);
		IntegerArrayList.add(1);
		IntegerArrayList.add(2);
		IntegerArrayList.add(3);
		
		IntegerArrayList.remove(3);

		System.out.println(IntegerArrayList.get(0));
		System.out.println(IntegerArrayList.contains(2));

		System.out.println("------foreach------");
		for(Integer number:IntegerArrayList){
			System.out.println(number);
		}
		
		 // Use iterator to display contents of al
		System.out.println("------iterator------");
	      Iterator IntegerItr = IntegerArrayList.iterator();
	      while(IntegerItr.hasNext()) {
	         Object element = IntegerItr.next();
	         System.out.println(element + " ");
	      }
	      System.out.println("------------------------");

	    System.out.println("-----Custom Object ArrayList-------");  
		List<Employee>EmployeeArrayList = new ArrayList<>();
		Employee e1 = new Employee("Ravi","Yadav","Kiran",10000);
		Employee e2 = new Employee("Henry","Phlliphe","Tim",8000);
		Employee e3 = new Employee("Zack","Snyder","Barron",6000);
		Employee e4 = new Employee("Zoe","Shannon","Mill",11000);
		
		
		EmployeeArrayList.add(e1);
		EmployeeArrayList.add(e2);
		EmployeeArrayList.add(e3);
		EmployeeArrayList.add(e4);
		
			
		EmployeeArrayList.remove(3);

		System.out.println(EmployeeArrayList.get(0));
		System.out.println(EmployeeArrayList.contains(e2));

		System.out.println("------foreach------");
		for(Employee employeeObj:EmployeeArrayList){
			System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
		}
		
		 // Use iterator to display contents of al
		System.out.println("------iterator------");
	      Iterator CustomItr = EmployeeArrayList.iterator();
	      while(CustomItr.hasNext()) {
	         Employee element = (Employee)CustomItr.next();
	         System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
	      }
	      System.out.println("------------------------");
		
		System.out.println("------------------------------------");
		
		
		
		
		System.out.println("----------LinkedList Demo-----------");
		System.out.println("-----String Linked-List-------");
		
		List<String>StringLinkedList = new LinkedList<>();
		StringLinkedList.add("Hello");
		StringLinkedList.add("String");
		StringLinkedList.add("LinkedList");
		StringLinkedList.add("Demo");
		
		
		StringLinkedList.remove("Demo");

		System.out.println(StringLinkedList.get(0));
		System.out.println(StringLinkedList.contains("LinkedList"));

		System.out.println("------foreach------");
		for(String string:StringLinkedList){
			System.out.println(string);
		}
		
		
		 // Use iterator to display contents of al
		System.out.println("------iterator------");
	      Iterator StringLLItr = StringLinkedList.iterator();
	      while(StringLLItr.hasNext()) {
	         Object element = StringLLItr.next();
	         System.out.println(element + " ");
	      }
	      System.out.println("------------------------");
		
	      System.out.println("-----Integer LinkedList-------");  
			List<Integer>IntegerLinkedList = new LinkedList<>();
			IntegerLinkedList.add(0);
			IntegerLinkedList.add(1);
			IntegerLinkedList.add(2);
			IntegerLinkedList.add(3);
			
			IntegerLinkedList.remove(3);

			System.out.println(IntegerLinkedList.get(0));
			System.out.println(IntegerLinkedList.contains(2));

			System.out.println("------foreach------");
			for(Integer number:IntegerLinkedList){
				System.out.println(number);
			}
			
			 // Use iterator to display contents of al
			System.out.println("------iterator------");
		      Iterator IntegerLLItr = IntegerLinkedList.iterator();
		      while(IntegerLLItr.hasNext()) {
		         Object element = IntegerLLItr.next();
		         System.out.println(element + " ");
		      }
		      System.out.println("------------------------");
		
		   System.out.println("-----Custom Object LinkedList-------");  
			List<Employee>EmployeeLinkedList = new LinkedList<>();
			
			
			
			EmployeeLinkedList.add(e1);
			EmployeeLinkedList.add(e2);
			EmployeeLinkedList.add(e3);
			EmployeeLinkedList.add(e4);
			
				
			EmployeeLinkedList.remove(3);

			System.out.println(EmployeeLinkedList.get(0));
			System.out.println(EmployeeLinkedList.contains(e2));

			System.out.println("------foreach------");
			for(Employee employeeObj:EmployeeLinkedList){
				System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
			}
			
			 // Use iterator to display contents of al
			System.out.println("------iterator------");
		      Iterator CustomLLItr = EmployeeLinkedList.iterator();
		      while(CustomLLItr.hasNext()) {
		         Employee element = (Employee)CustomLLItr.next();
		         System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
		      }
		      System.out.println("------------------------");

		
		System.out.println("------------------------------------");

		System.out.println("--------------Vector Demo-----------");
		System.out.println("-----String Vector-------");
		
		List<String>StringVector = new Vector<>();
		StringVector.add("Hello");
		StringVector.add("String");
		StringVector.add("LinkedList");
		StringVector.add("Demo");
		
		
		StringVector.remove("Demo");

		System.out.println(StringVector.get(0));
		System.out.println(StringVector.contains("LinkedList"));

		System.out.println("------foreach------");
		for(String string:StringVector){
			System.out.println(string);
		}
		
		
		 // Use iterator to display contents of al
		System.out.println("------iterator------");
	      Iterator StringVectorItr = StringVector.iterator();
	      while(StringVectorItr.hasNext()) {
	         Object element = StringVectorItr.next();
	         System.out.println(element + " ");
	      }
	      System.out.println("------------------------");
		
	      System.out.println("-----Integer Vector-------");  
			List<Integer>IntegerVector = new Vector<>();
			IntegerVector.add(0);
			IntegerVector.add(1);
			IntegerVector.add(2);
			IntegerVector.add(3);
			
			IntegerVector.remove(3);

			System.out.println(IntegerVector.get(0));
			System.out.println(IntegerVector.contains(2));

			System.out.println("------foreach------");
			for(Integer number:IntegerVector){
				System.out.println(number);
			}
			
			 // Use iterator to display contents of al
			System.out.println("------iterator------");
		      Iterator IntegerVectorItr = IntegerVector.iterator();
		      while(IntegerVectorItr.hasNext()) {
		         Object element = IntegerVectorItr.next();
		         System.out.println(element + " ");
		      }
		      System.out.println("------------------------");
		
		   System.out.println("-----Custom Object Vector-------");  
			List<Employee>EmployeeVector = new Vector<>();
		
			
			
			EmployeeVector.add(e1);
			EmployeeVector.add(e2);
			EmployeeVector.add(e3);
			EmployeeVector.add(e4);
			
				
			EmployeeVector.remove(3);

			System.out.println(EmployeeVector.get(0));
			System.out.println(EmployeeVector.contains(e2));

			System.out.println("------foreach------");
			for(Employee employeeObj:EmployeeVector){
				System.out.println(employeeObj.getFirstName()+" "+employeeObj.getLastName()+" "+employeeObj.getSalary());
			}
			
			 // Use iterator to display contents of al
			System.out.println("------iterator------");
		      Iterator CustomVectorItr = EmployeeVector.iterator();
		      while(CustomVectorItr.hasNext()) {
		         Employee element = (Employee)CustomVectorItr.next();
		         System.out.println(element.getFirstName()+" "+element.getLastName()+" "+element.getSalary());
		      }
		      System.out.println("------------------------");

		
		System.out.println("------------------------------------");
		
	
		
		

	}

}
