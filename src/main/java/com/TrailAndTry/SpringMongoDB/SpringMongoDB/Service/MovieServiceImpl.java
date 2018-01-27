package com.TrailAndTry.SpringMongoDB.SpringMongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrailAndTry.SpringMongoDB.SpringMongoDB.DAO.MovieDAO;
import com.TrailAndTry.SpringMongoDB.SpringMongoDB.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO movieDao;
	
	@Override
	public List<Movie> topRatedMovies() {
		return movieDao.AllMovies();
	}

	@Override
	public List<Movie> serchMoviesLike(String name) {
		return movieDao.getMoviesLike(name);
	}

	@Override
	public List<Movie> searchActorMovie(String actorName) {
		return movieDao.getActorMovies(actorName);
	}

	@Override
	public Movie serchMovie(String id) {
		return movieDao.getMovie(id);
	}
	
}
