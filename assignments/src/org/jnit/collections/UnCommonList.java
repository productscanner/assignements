package org.jnit.collections;

import java.util.ArrayList;
import java.util.List;

public class UnCommonList {

	public static void main(String[] args) {
		List<Integer>List1 = new ArrayList<>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);

		List<Integer>List2 = new ArrayList<>();
		List2.add(3);
		List2.add(4);
		List2.add(5);
		List2.add(6);
		List2.add(7);
		
		for(Integer uniqueNum:List1){
			if(List2.contains(uniqueNum)){
				continue;
			}else{
				System.out.println(uniqueNum);
			}
		}
		
		for(Integer uniqueNum:List2){
			if(List1.contains(uniqueNum)){
				continue;
			}else{
				System.out.println(uniqueNum);
			}
		}
	}

}
