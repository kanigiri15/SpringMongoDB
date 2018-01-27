package com.TrailAndTry.SpringMongoDB.SpringMongoDB.Service;

import java.util.List;

import com.TrailAndTry.SpringMongoDB.SpringMongoDB.model.Movie;

public interface MovieService {
	public List<Movie> topRatedMovies();
	public List<Movie> serchMoviesLike(String name);
	public Movie serchMovie(String id);
	public List<Movie> searchActorMovie(String actorName);
}
