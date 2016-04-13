package org.jnit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
		List<Integer>List1 = new ArrayList<>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);

		List<Integer>List2 = new ArrayList<Integer>(List1);
		//Collections.copy(List2, List1);
		
		for(Integer numbers:List2){
			System.out.println(numbers);
		}

	}

}
