package com.cg.movie.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author ugawari
 *
 * Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), 
 * find_movie_By_mov_Name(), find_movie_By_Genre() to perform functions on Movie Details
 */
public class MovieDetailsList {

	List<MovieDetails> list = new LinkedList<MovieDetails>();
	
	/**
	 * To get all movies list
	 * @return
	 */
	public List<MovieDetails> allMovies(){
		return list;
	}
	
	/**
	 * Add new movie to existing movie list
	 * @param movieDetails
	 */
	public void addMovie(MovieDetails movieDetails){
		list.add(movieDetails);
	}
	
	/**
	 * Remove movie from existing movie list using movie name
	 * @param movieName
	 */
	public void removeMovie(String movieName){
		for(MovieDetails movieDetails : list){
			if(movieName.equals(movieDetails.getMovieName())){
				list.remove(movieDetails);
			}
		}
	}
	
	/**
	 *  Remove all movies from existing movie list
	 */
	public void removeAllMovies(){
		list.clear();
	}
	
	/**
	 * Retrieve movies from list of movies which having same name as passing name
	 * @param movieName
	 * @return
	 */
	public List<MovieDetails> findMovieByMovieName(String movieName){
		List<MovieDetails> arrayList=new ArrayList<MovieDetails>();
		for(MovieDetails movieDetails : list){
			if(movieName.equals(movieDetails.getMovieName())){
				arrayList.add(movieDetails);
			}
		}
		return arrayList;
	}
	
	/**
	 * Retrieve movies from list of movies which having same name as passing genre
	 * @param movieName
	 * @return
	 */
	public List<MovieDetails> findMovieByGenre(String genre){
		List<MovieDetails> arrayList=new ArrayList<MovieDetails>();
		for(MovieDetails movieDetails : list){
			if(genre.equals(movieDetails.getGenre())){
				arrayList.add(movieDetails);
			}
		}
		return arrayList;
	}
	
	/**
	 * Sort coming movies list based on given type like MovieName, Genre, LeadActor, LeadActress etc
	 * @param movieList
	 * @param type
	 * @return
	 */
	public List<MovieDetails> sortList(List<MovieDetails> movieList, String type){
		switch (type) {
		case "Genre":
			Collections.sort(movieList, new SortByGenre());
			break;
		case "MovieName":
			Collections.sort(movieList, new SortByMovieName());
			break;
		case "LeadActor":
			Collections.sort(movieList, new SortByLeadActor());
			break;
		case "LeadActress":
			Collections.sort(movieList, new SortByLeadActress());
			break;
		default:
			break;
		}
		return movieList;
	}
	

}
