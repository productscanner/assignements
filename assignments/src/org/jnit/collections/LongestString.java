package org.jnit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestString implements Comparator<String>{

	public static void main(String[] args) {
		List<String>StringArrayList = new ArrayList<>();
		StringArrayList.add("Temperature"); //temperature
		StringArrayList.add("String");
		StringArrayList.add("Arraylist");
		StringArrayList.add("Today'sWeatherIsVeryGood");
		
		Collections.sort(StringArrayList, new LongestString());
		
		/*for(String string:StringArrayList){
			System.out.println(string);
		}*/
		
		System.out.println("Longest String is : " +StringArrayList.get(StringArrayList.size()-1));
		System.out.println("Length of the Longest String is : " +StringArrayList.get(StringArrayList.size()-1).length());
	}

	/*@Override
	public int compareTo(String arg0) {
		Integer intObj =  new Integer(this.toString().length());
		System.out.println(intObj);
		return intObj.compareTo(arg0.length());
	}*/

	@Override
	public int compare(String arg0, String arg1) {
		Integer length0 =  new Integer(arg0.length());
		Integer length1 =  new Integer(arg1.length());
		return length0.compareTo(length1);
	}
	

}
