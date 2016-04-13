package org.jnit.collections;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberList {

	public static void main(String[] args) {
		List<Integer>List1 = new ArrayList<>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);

		List<Integer>List2 = new ArrayList<>();
		List2.add(4);
		List2.add(5);
		List2.add(6);
		List2.add(7);
		
		List<Integer>List3 = new ArrayList<>();
		
		for(Integer number:List1){
			if(List3.contains(number)){
				continue;
			}else{
				List3.add(number);
			}
		}
		
		for(Integer number:List2){
			if(List3.contains(number)){
				continue;
			}else{
				List3.add(number);
			}
		}
		
		for(Integer uniqueNum:List3){
			System.out.println(uniqueNum);
		}
		
	}

}
