package com.collections.comparableandcomparator.Set;

import java.util.Set;
import java.util.TreeSet;

//Driver class
public class MovieMain
{
	public Set<Movie> add() {
		TreeSet<Movie> set = new TreeSet<Movie>();
	    set.add(new Movie("Force Awakens", 8.3, 2015));
        set.add(new Movie("Star Wars", 8.7, 1977));
        set.add(new Movie("Empire Strikes Back", 8.8, 1980));
        set.add(new Movie("Return of the Jedi", 8.4, 1983));
		return set;

	}
	public static void main(String[] args)
	{
		MovieMain movieMain=new MovieMain();
		Set<Movie> set=movieMain.add();
		//Collections.sort(set);

		System.out.println("Movies after sorting : ");
		for (Movie movie: set)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}