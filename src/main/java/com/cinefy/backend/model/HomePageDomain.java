package com.cinefy.backend.model;

import java.util.List;

public class HomePageDomain {

    private List<CinefyMovieDomain> movieList;
    private List<FeaturedMovieDomain> featuredMovieList;
    private List<LoginPageDomain> loginPageList;

    public HomePageDomain(List<CinefyMovieDomain> movieList, List<FeaturedMovieDomain> featuredMovieList, List<LoginPageDomain> loginPageList) {
        this.movieList = movieList;
        this.featuredMovieList = featuredMovieList;
        this.loginPageList = loginPageList;
    }

    public HomePageDomain() {
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
