package com.collections.comparableandcomparator.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapIteration {
	
	public Map<Integer, Employee> getStudentDetails() {

		Map<Integer, Employee> mapOfStudent = new HashMap<Integer, Employee>();
		mapOfStudent.put(1212, new Employee("Gudipati", "Srinivas", "CS", 100.00));
		mapOfStudent.put(1213, new Employee("Yabaluri", "Sankara", "EC", 110.00));
		mapOfStudent.put(1214, new Employee("Machiraju", "Mounika", "IT", 120.00));
		mapOfStudent.put(1215, new Employee("Gottiparthi", "Manasa", "EIE", 140.00));

		return mapOfStudent;
	}

	public static void main(String[] args) {
		// Iterator Way -1
		Map<Integer, Employee> studentDetails = new MapIteration().getStudentDetails();
		System.out.println(studentDetails);
		for (Entry<Integer, Employee> entry : studentDetails.entrySet()) {
			System.out.println("Way -1 Key and Value" + entry.getKey() + entry.getValue());
		}

		// Iterator Way -2
		for (Integer rollno : studentDetails.keySet()) {
			System.out.println("Way -2 Key and Value" + rollno + "Value" + studentDetails.get(rollno));
		}

		// Iterator Way -3

		Iterator<Entry<Integer, Employee>> iterator = studentDetails.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Employee> entry = iterator.next();
			System.out.println("Way -3 Key and Value " + entry.getKey() + "" + entry.getValue());
		}

		// Iterator Way -4

		// iterating over keys only
		for (Integer key : studentDetails.keySet()) {
			System.out.print("Key = " + key);
		}

		// iterating over values only
		for (Employee value : studentDetails.values()) {
			System.out.println("\t Value = " + value);
		}

	}

}
