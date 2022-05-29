package com.cinefy.backend.model;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class BookingPageDomain {


    private String userId;
    private List<CinefyMovieDomain> movieList;
    private Long id;
    private List<FeaturedMovieDomain> featuredMovieList;
    private List<LoginPageDomain> loginPageList;
    private Date dateOfBooking;
    private List<LocationDomain> locations;
    private List<PriceDomain> priceOfMovie;
    private List<NumberOfTicketsDomain> numberOfTickets;


    public BookingPageDomain(String userId, List<CinefyMovieDomain> movieList, Long id, List<FeaturedMovieDomain> featuredMovieList, List<LoginPageDomain> loginPageList, Date dateOfBooking, List<LocationDomain> locations, List<PriceDomain> priceOfMovie, List<NumberOfTicketsDomain> numberOfTickets) {
        this.userId = userId;
        this.movieList = movieList;
        this.id = id;
        this.featuredMovieList = featuredMovieList;
        this.loginPageList = loginPageList;
        this.dateOfBooking = dateOfBooking;
        this.locations = locations;
        this.priceOfMovie = priceOfMovie;
        this.numberOfTickets = numberOfTickets;
    }

    public BookingPageDomain(String userId, List<CinefyMovieDomain> movieList, Long id, List<FeaturedMovieDomain> featuredMovieList, List<LoginPageDomain> loginPageList) {
        this.userId = userId;
        this.movieList = movieList;
        this.id = id;
        this.featuredMovieList = featuredMovieList;
        this.loginPageList = loginPageList;
    }

    public BookingPageDomain(String userId, List<CinefyMovieDomain> movieList, Long id, List<FeaturedMovieDomain> featuredMovieList, List<LoginPageDomain> loginPageList, Date dateOfBooking) {
        this.userId = userId;
        this.movieList = movieList;
        this.id = id;
        this.featuredMovieList = featuredMovieList;
        this.loginPageList = loginPageList;
        this.dateOfBooking = dateOfBooking;
    }

    public BookingPageDomain() {

    }

    public List<LocationDomain> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationDomain> locations) {
        this.locations = locations;
    }

    public List<PriceDomain> getPriceOfMovie() {
        return priceOfMovie;
    }

    public void setPriceOfMovie(List<PriceDomain> priceOfMovie) {
        this.priceOfMovie = priceOfMovie;
    }

    public List<NumberOfTicketsDomain> getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(List<NumberOfTicketsDomain> numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
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
