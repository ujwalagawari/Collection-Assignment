/**
 * 
 */
package com.cg.movie.model;

import java.util.Comparator;

/**
 * @author ugawari
 * Used for sorting in ascending order of Genre
 */
public class SortByGenre implements Comparator<MovieDetails>{


	@Override
	public int compare(MovieDetails movieDetails1, MovieDetails movieDetails2) {
		return movieDetails1.getGenre().compareTo(movieDetails2.getGenre());
	}

}
