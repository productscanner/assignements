/*This Program along with Customers.java and CustomersAgeComparator.java 
 * demonstrates the use of comparable and comparator for a TreeSet.  
 * */
package org.jnit.collections;

import java.util.TreeSet;
import java.util.Set;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		Customers c1 =  new Customers("john", "NewYork",23);
		Customers c2 =  new Customers("james","NewJersey",45);
		Customers c3 =  new Customers("mike","Dallas",17);
		Customers c4 =  new Customers("nina","Seattle",29);
		Customers c5 =  new Customers("henry","NewYork",11);
		Customers c6 =  new Customers("john","NewYork",23);
		
		
	    Set<Customers>CustomersCityTreeSet = new TreeSet<>();
	    CustomersCityTreeSet.add(c1);
	    CustomersCityTreeSet.add(c2);
	    CustomersCityTreeSet.add(c3);
	    CustomersCityTreeSet.add(c4);
	    CustomersCityTreeSet.add(c5);
	    CustomersCityTreeSet.add(c6);
	    
	    System.out.println("------foreach------");
		for(Customers CustomerObj:CustomersCityTreeSet){
			System.out.println(CustomerObj.getName()+" "+CustomerObj.getCity()+" "+CustomerObj.getAge());
		}
	    
		Set<Customers>CustomersAgeTreeSet = new TreeSet< >();
		CustomersAgeTreeSet.add(c1);
		CustomersAgeTreeSet.add(c2);
		CustomersAgeTreeSet.add(c3);
		CustomersAgeTreeSet.add(c4);
		CustomersAgeTreeSet.add(c5);
		CustomersAgeTreeSet.add(c6);
		
		System.out.println("------foreach------");
		for(Customers CustomerObj:CustomersAgeTreeSet){
			System.out.println(CustomerObj.getName()+" "+CustomerObj.getCity()+" "+CustomerObj.getAge());
		}
	}

}
