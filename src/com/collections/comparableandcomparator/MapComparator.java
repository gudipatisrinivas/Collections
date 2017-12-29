package com.collections.comparableandcomparator;

import java.util.Collections;
import java.util.HashMap;


public class MapComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Movie> movie=new HashMap<String,Movie>();
		movie.put("A", new Movie("EEE", 8.3, 2015));
		movie.put("B", new Movie("EE", 8.3, 2015));
		movie.put("C", new Movie("EEEEE", 8.3, 2015));
		System.out.println(movie);
		///Collections.sort(movie);

	}

}
