/**
 * 
 */
package com.cg.movie.model;

import java.util.Comparator;

/**
 * @author ugawari
 *
 */
public class SortByMovieName implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails movieDetails1, MovieDetails movieDetails2) {
		return movieDetails1.getMovieName().compareTo(movieDetails2.getMovieName());
	}

	
}
