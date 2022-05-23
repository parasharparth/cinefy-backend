package com.cinefy.backend.model;

import javax.persistence.Id;
import java.util.List;

public class BookingPageDomain {


    private String userId;
    private List<CinefyMovieDomain> movieList;
    private Long id;
    private List<FeaturedMovieDomain> featuredMovieList;
    private List<LoginPageDomain> loginPageList;

    public BookingPageDomain(String userId, List<CinefyMovieDomain> movieList, Long id, List<FeaturedMovieDomain> featuredMovieList, List<LoginPageDomain> loginPageList) {
        this.userId = userId;
        this.movieList = movieList;
        this.id = id;
        this.featuredMovieList = featuredMovieList;
        this.loginPageList = loginPageList;
    }

    public BookingPageDomain() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CinefyMovieDomain> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<CinefyMovieDomain> movieList) {
        this.movieList = movieList;
    }

    public List<FeaturedMovieDomain> getFeaturedMovieList() {
        return featuredMovieList;
    }

    public void setFeaturedMovieList(List<FeaturedMovieDomain> featuredMovieList) {
        this.featuredMovieList = featuredMovieList;
    }

    public List<LoginPageDomain> getLoginPageList() {
        return loginPageList;
    }

    public void setLoginPageList(List<LoginPageDomain> loginPageList) {
        this.loginPageList = loginPageList;
    }
}
