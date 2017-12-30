package com.collections.comparableandcomparator.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapIteration mapIteration = new MapIteration();
		Map<Integer, Employee> studentHashMap = mapIteration.getStudentDetails();
		List<Employee> listOfEmp = new ArrayList<Employee>(studentHashMap.values());
		Collections.sort(listOfEmp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getLastname().compareTo(o2.getLastname());
			}

		});
		//System.out.println("Collection of Employee" + listOfEmp.toString());
		//System.out.println(studentHashMap);
		LinkedHashMap<Integer, Employee> linkedHashMap = new LinkedHashMap<Integer, Employee>();
		for (Employee emp : listOfEmp) {
			Integer key = getKeyFromValue(emp, studentHashMap);
			if (key != null) {
				linkedHashMap.put(key, emp);
			}
		}
		System.out.println("Result"+linkedHashMap);

	}

	private static Integer getKeyFromValue(Employee emp, Map<Integer, Employee> studentHashMap) {
		// TODO Auto-generated method stub

		for (Entry<Integer, Employee> ent : studentHashMap.entrySet()) {
			if (ent.getValue().equals(emp)) {
				return ent.getKey();
			}
		}
		return null;
	}

}
