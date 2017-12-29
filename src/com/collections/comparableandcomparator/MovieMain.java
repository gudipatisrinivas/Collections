package com.collections.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

//Driver class
public class MovieMain
{
	public static void main(String[] args)
	{
		ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
		list.add(new MovieComparable("Force Awakens", 8.3, 2015));
		list.add(new MovieComparable("Star Wars", 8.7, 1977));
		list.add(new MovieComparable("Empire Strikes Back", 8.8, 1980));
		list.add(new MovieComparable("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (MovieComparable movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}