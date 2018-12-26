/**
 * 
 */
package com.cg.movie.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.movie.model.MovieDetails;
import com.cg.movie.model.MovieDetailsList;
import com.cg.movie.model.SortByGenre;
import com.cg.movie.model.SortByLeadActor;
import com.cg.movie.model.SortByLeadActress;
import com.cg.movie.model.SortByMovieName;

/**
 * @author ugawari
 *
 */
public class MovieDetailsSortTest {

	private MovieDetails movieDetails1, movieDetails2, movieDetails3, movieDetails4;
	private MovieDetailsList movieDetailsList;
	private List<MovieDetails> list;
	
	@Before
	public void setUp() {
		movieDetailsList = new MovieDetailsList();
		movieDetails1=new MovieDetails("Robot 2.0", "Akshay Kumar", "Ami Jackson", "Action");
		movieDetails2=new MovieDetails("3 Idiots", "Amir khan", "Karina Kapoor", "Love Story");
		movieDetails3=new MovieDetails("Bhaubali", "Prabhas", "Anushka", "Drama");
		movieDetails4=new MovieDetails("3 Idiots", "Amir khan", "Karina Kapoor Khan", "Love Story");
	}

	@Test
	public void testForSortByGenre() {
		list = new ArrayList<MovieDetails>();
		list.add(movieDetails1);
		list.add(movieDetails2);
		list.add(movieDetails3);
		list.add(movieDetails4);
		String type="Genre";
		movieDetailsList.sortList(list, type);
		String expected = "[MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0],"
				+ " MovieDetails [genre=Drama, leadActress=Anushka, leadActor=Prabhas, movieName=Bhaubali], MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor Khan, leadActor=Amir khan, movieName=3 Idiots]]";
		Assert.assertEquals(expected, list.toString());
	}
	
	@Test
	public void testForSortByMovieName() {
		list = new ArrayList<MovieDetails>();
		list.add(movieDetails1);
		list.add(movieDetails2);
		list.add(movieDetails3);
		list.add(movieDetails4);
		String type="MovieName";
		movieDetailsList.sortList(list, type);
		String expected = "[MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor Khan, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Drama, leadActress=Anushka, leadActor=Prabhas, movieName=Bhaubali],"
				+ " MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0]]";
		Assert.assertEquals(expected, list.toString());
	}
	
	@Test
	public void testForSortByLeadActor() {
		list = new ArrayList<MovieDetails>();
		list.add(movieDetails1);
		list.add(movieDetails2);
		list.add(movieDetails3);
		list.add(movieDetails4);
		String type="LeadActor";
		movieDetailsList.sortList(list, type);
		System.out.println(list.toString());
		String expected = "[MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor Khan, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Drama, leadActress=Anushka, leadActor=Prabhas, movieName=Bhaubali]]";
		Assert.assertEquals(expected, list.toString());
	}
	
	@Test
	public void SortByLeadActress() {
		list = new ArrayList<MovieDetails>();
		list.add(movieDetails1);
		list.add(movieDetails2);
		list.add(movieDetails3);
		list.add(movieDetails4);
		String type="LeadActress";
		movieDetailsList.sortList(list, type);
		System.out.println(list.toString());
		String expected = "[MovieDetails [genre=Action, leadActress=Ami Jackson, leadActor=Akshay Kumar, movieName=Robot 2.0],"
				+ " MovieDetails [genre=Drama, leadActress=Anushka, leadActor=Prabhas, movieName=Bhaubali], MovieDetails [genre=Love Story, leadActress=Karina Kapoor, leadActor=Amir khan, movieName=3 Idiots],"
				+ " MovieDetails [genre=Love Story, leadActress=Karina Kapoor Khan, leadActor=Amir khan, movieName=3 Idiots]]";
		Assert.assertEquals(expected, list.toString());
	}
	
	@After
	public void tearDown() {
		list = null;
	}

}
