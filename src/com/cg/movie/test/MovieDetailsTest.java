package com.cg.movie.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.movie.model.MovieDetails;
import com.cg.movie.model.MovieDetailsList;

/**
 * @author ugawari
 */
public class MovieDetailsTest {

	private MovieDetails movieDetails;
	private MovieDetailsList movieDetailsList;
	
	@Before
	public void setUp(){
		movieDetailsList = new MovieDetailsList();
		movieDetails=new MovieDetails("Robot 2.0", "Akshay Kumar", "Ami Jackson", "Action");
		movieDetailsList.addMovie(movieDetails);
		movieDetails=new MovieDetails("3 Idiots", "Amir khan", "Karina Kapoor", "Love Story");
		movieDetailsList.addMovie(movieDetails);
		movieDetails=new MovieDetails("Bhaubali", "Prabhas", "Anushka", "Drama");
		movieDetailsList.addMovie(movieDetails);
		movieDetails=new MovieDetails("3 Idiots", "Amir khan", "Karina Kapoor Khan", "Love Story");
		movieDetailsList.addMovie(movieDetails);
	}


	@Test
	public void testForAddingNewMovie() {
		movieDetails=new MovieDetails("Ramleela", "Ranveer", "Deepika", "Drama");
		movieDetailsList.addMovie(movieDetails);
		String expected="[MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Drama, leadActress=Anushka, leadActor=Prabhas, movieName=Bhaubali],"
				+ " MovieDetails [genre=Drama, leadActress=Deepika, leadActor=Ranveer, movieName=Ramleela]]";
		Assert.assertEquals(expected, (movieDetailsList.allMovies()).toString());	
	}
	
	@Test
	public void testForFindMovieByMovieName() {
		String movieName="Robot 2.0";
		String expected="[MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0]]";
		Assert.assertEquals(expected, (movieDetailsList.findMovieByMovieName(movieName)).toString());
	}
	
	@Test
	public void testForFindMovieByMovieGenre() {
		String genre="Love Story";
		String expected="[MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor Khan, leadActor=Amir khan, movieName=3 Idiots]]";
		Assert.assertEquals(expected, (movieDetailsList.findMovieByGenre(genre)).toString());
	}

	@Test
	public void testForRemoveMovieByMovieName() {
		String movieName="Bhaubali";
		movieDetailsList.removeMovie(movieName);
		Assert.assertEquals("[]", (movieDetailsList.findMovieByMovieName(movieName)).toString());
	}
	
	@Test
	public void testForRemoveAllMovies() {
		movieDetailsList.removeAllMovies();
		Assert.assertEquals("[]", (movieDetailsList.allMovies()).toString());
	}
	
	@After
	public void tearDown(){
	}
}
