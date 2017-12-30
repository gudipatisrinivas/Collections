package com.collections.comparableandcomparator.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Driver class
public class MovieMain
{
	public List<Movie> add() {
		ArrayList<Movie> list = new ArrayList<Movie>();
	    list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
		return list;
	}

	public static void main(String[] args) {
		MovieMain movieMain = new MovieMain();
		List<Movie> list = movieMain.add();
		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}