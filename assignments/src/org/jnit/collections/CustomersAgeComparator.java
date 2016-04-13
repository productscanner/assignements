package org.jnit.collections;

import java.util.Comparator;

public class CustomersAgeComparator implements Comparator<Customers>{

	@Override
	public int compare(Customers o1, Customers o2) {
		Integer intObj1 =  o1.getAge();//new Integer(o1.getAge());
		Integer intObj2 =  o2.getAge();//new Integer(o2.getAge());
		return intObj1.compareTo(intObj2);
	}

	
	
}
