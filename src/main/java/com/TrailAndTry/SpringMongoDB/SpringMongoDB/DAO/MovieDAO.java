package com.TrailAndTry.SpringMongoDB.SpringMongoDB.DAO;

import java.util.List;

import com.TrailAndTry.SpringMongoDB.SpringMongoDB.model.Movie;

public interface MovieDAO {
	public List<Movie> AllMovies();
	public List<Movie> getMoviesLike(String name);
	public Movie getMovie(String name);
}
