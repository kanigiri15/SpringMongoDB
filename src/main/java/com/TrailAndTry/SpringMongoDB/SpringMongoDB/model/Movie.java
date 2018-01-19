package com.TrailAndTry.SpringMongoDB.SpringMongoDB.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topRatedIndianMovies")
public class Movie {
	
	private String id;
	private String title;
	private String year;
	private String[] genres;
	private int[] ratings;
	private String poster;
	private String contentRating;
	private String duration;
	private Date relaeaseDate;
	private int averageRating;
	private String originalTitle;
	private String storyline;
	private String[] actors;
	private float imdbRating;
	private String posterurl;
	public Movie(String title, String year, String[] genres, int[] ratings, String poster, String contentRating,
			String duration, Date relaeaseDate, int averageRating, String originalTitle, String storyline,
			String[] actors, float imdbRating, String posterUrl) {
		super();
		this.title = title;
		this.year = year;
		this.genres = genres;
		this.ratings = ratings;
		this.poster = poster;
		this.contentRating = contentRating;
		this.duration = duration;
		this.relaeaseDate = relaeaseDate;
		this.averageRating = averageRating;
		this.originalTitle = originalTitle;
		this.storyline = storyline;
		this.actors = actors;
		this.imdbRating = imdbRating;
		this.posterurl = posterUrl;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String[] getGenres() {
		return genres;
	}
	public void setGenres(String[] genres) {
		this.genres = genres;
	}
	public int[] getRatings() {
		return ratings;
	}
	public void setRatings(int[] ratings) {
		this.ratings = ratings;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getContentRating() {
		return contentRating;
	}
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Date getRelaeaseDate() {
		return relaeaseDate;
	}
	public void setRelaeaseDate(Date relaeaseDate) {
		this.relaeaseDate = relaeaseDate;
	}
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getStoryLine() {
		return storyline;
	}
	public void setStoryLine(String storyline) {
		this.storyline = storyline;
	}
	public String[] getActors() {
		return actors;
	}
	public void setActors(String[] actors) {
		this.actors = actors;
	}
	public float getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(float imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getPosterUrl() {
		return posterurl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterurl = posterUrl;
	}
	public String getId() {
		return id;
	}
}
