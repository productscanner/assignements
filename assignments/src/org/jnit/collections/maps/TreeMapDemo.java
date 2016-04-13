package org.jnit.collections.maps;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> students = new TreeMap<String, Integer>();
		students.put("Ravi", 1);
		students.put("James", 10);
		students.put("Andrew", 43);
		students.put("Zen", 2);

		System.out.println("Sorted Treemap result based on the key");
		for (String key : students.keySet()) {
			System.out.println(key + " :: " + students.get(key));
		}
	}
}
