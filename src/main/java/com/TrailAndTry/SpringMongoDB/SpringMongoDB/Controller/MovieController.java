package com.TrailAndTry.SpringMongoDB.SpringMongoDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.TrailAndTry.SpringMongoDB.SpringMongoDB.Service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value="/movies",method = RequestMethod.GET)
	public String showMovies(ModelMap model) {
		model.put("movies", movieService.topRatedMovies());
		return "movies";
	}
	@RequestMapping(value="/movies/{searchTerm}",method = RequestMethod.GET)
	public String showMovies(@PathVariable("searchTerm") String searchTerm, ModelMap model) {
		model.put("movies", movieService.serchMoviesLike(searchTerm));
		return "movies";
	}

	@RequestMapping(value="/movies",method = RequestMethod.POST)
	public String searchMovies(@RequestParam("movieName") String movieName, ModelMap model) {
		model.put("movies", movieService.serchMoviesLike(movieName));
		return "movies";
	}

	@RequestMapping(value="/movies/movie/{objId}",method = RequestMethod.GET)
	public String showMovie(@PathVariable("objId") String objId, ModelMap model) {
		model.put("movie", movieService.serchMovie(objId));
		return "movie";
	}

	@RequestMapping(value="/movies/actor/{name}",method = RequestMethod.GET)
	public String showActorMovies(@PathVariable("name") String name, ModelMap model) {
		model.put("movies", movieService.searchActorMovie(name));
		
		return "movies";
	}
}