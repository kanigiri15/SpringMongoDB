package com.TrailAndTry.SpringMongoDB.SpringMongoDB.DAO;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.TrailAndTry.SpringMongoDB.SpringMongoDB.model.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO {
	@Autowired
	MongoTemplate mongoTemplete;
	public List<Movie> AllMovies(){
		List<Movie> movies = mongoTemplete.findAll(Movie.class);
		System.out.println(movies.size());
		
		List<Movie> moviesWithA = mongoTemplete.findAll(Movie.class);
		System.out.println(moviesWithA.size());
		return movies;
	}
	@Override
	public List<Movie> getMoviesLike(String name) {
		List<Movie> moviesLike = mongoTemplete.find(new Query(Criteria.where("title").regex(name,"i")), Movie.class);
		System.out.println(moviesLike.size());
		return moviesLike;
	}
	@Override
	public Movie getMovie(String mid) {
		ObjectId id = new ObjectId(mid);
		Movie movie = mongoTemplete.findOne(new Query(Criteria.where("_id").is(id)), Movie.class);
		System.out.println(movie.getTitle());
		System.out.println(movie.getDuration());
		System.out.println(movie.getStoryLine());
		return movie;
	}
}
