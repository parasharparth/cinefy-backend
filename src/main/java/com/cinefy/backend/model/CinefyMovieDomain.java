package com.cinefy.backend.model;

public class CinefyMovieDomain {

    private long movieId;
    private String movieName;
    private int cityId; //This cityID will be matched in the controller to the city id selected by the user
    private int movieRating;
    private String posterURL;


    public CinefyMovieDomain() {
    }

    public CinefyMovieDomain(long movieId, String movieName, int cityId, int movieRating, String posterURL) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.cityId = cityId;
        this.movieRating = movieRating;
        this.posterURL = posterURL;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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
