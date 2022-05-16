package com.cinefy.backend.model;

public class FeaturedMovieDomain {

    private Long movieId;
    private String movieName;
    private int movieRating;
    private String posterURL;

    public FeaturedMovieDomain() {
    }

    public FeaturedMovieDomain(Long movieId, String movieName, int movieRating, String posterURL) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.posterURL = posterURL;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }
}
