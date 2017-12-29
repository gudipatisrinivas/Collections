package com.collections.Map;

import java.util.*;
import java.util.Collections;

class MapInterfaceExample {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(map.containsKey(100));
		
		Comparator<Student> comparator2 = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub

				String name1 = o1.getName().toUpperCase();
				String name2 = o2.getName().toUpperCase();
				return name1.compareTo(name2);

			}
		};

		Map<String, Student> hashmap = new HashMap<String, Student>();
		hashmap.put("srinivas", new Student("Srinivas", 10, 1));
		hashmap.put("sankar", new Student("Mounika", 12, 2));
		hashmap.put("satya", new Student("Sankar", 14, 3));
		hashmap.put("mounika", new Student("Satya", 16, 4));
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(map.containsValue(new Student("Srinivas", 10, 1)));

	
		
	}
}