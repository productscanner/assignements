package org.jnit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestInteger {

	public static void main(String[] args) {
		List<Integer>IntegerList = new ArrayList<>();
		IntegerList.add(56);
		IntegerList.add(99);
		IntegerList.add(4);
		IntegerList.add(87);
		IntegerList.add(23);
		IntegerList.add(16);

		Collections.sort(IntegerList);
		int size = IntegerList.size();
//		for(Integer numbers:IntegerList){
//			System.out.println(numbers);
//		}
		System.out.println("Largest of the Integer is "+IntegerList.get(size-1));
	}

}
