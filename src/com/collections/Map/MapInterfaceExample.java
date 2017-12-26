package com.collections.Map;

import java.util.*;

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

		Map<String, Student> hashmap = new HashMap<String, Student>();
		hashmap.put("srinivas", new Student("Srinivas", 10, 1));
		hashmap.put("sankar", new Student("Mounika", 10, 2));
		hashmap.put("satya", new Student("Sankar", 10, 3));
		hashmap.put("mounika", new Student("Satya", 10, 4));
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(map.containsValue(new Student("Srinivas", 10, 1)));
	}
}