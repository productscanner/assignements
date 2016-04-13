package org.jnit.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class ListIteratorDemo {

	public static void main(String[] args) {
				
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        ListIterator<Integer> litr = null;
        litr=list.listIterator();
       
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
	

}
