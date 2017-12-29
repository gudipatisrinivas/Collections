package com.collections.comparableandcomparator.List;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieNameComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieMain movieMain = new MovieMain();
		List<Movie> list = movieMain.add();
		Collections.sort(list, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				String movie1Name = o1.getName();

				String movie2Name = o2.getName();
				return movie1Name.compareTo(movie2Name);
			}

		});

		System.out.println("Movies after sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
	}

}
