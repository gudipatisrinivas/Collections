package com.collections.comparableandcomparator.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Driver class
public class MovieMain
{
	public List<Movie> add(){
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("EEE", 8.3, 2015));
		list.add(new Movie("E", 8.7, 1977));
		list.add(new Movie("EE", 8.8, 1980));
		list.add(new Movie("EEEE", 8.4, 1983));
		return list;

	}
	public static void main(String[] args)
	{
		MovieMain movieMain=new MovieMain();
		List<Movie> list=movieMain.add();
		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}
}