package com.cinefy.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PriceDomain {
    private Long id;

    public PriceDomain() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    //get the list of prices of movies in the table
    private int price;
    private int featurePrice;
    private int discount;
    private int movieid;
    private String movieName;
    private Date releaseDate;

    public PriceDomain(Long id, int price, int movieid, String movieName, Date releaseDate) {
        this.id = id;
        this.price = price;
        this.movieid = movieid;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    public PriceDomain(Long id, int price, int featurePrice, int discount, int movieid, String movieName, Date releaseDate) {
        this.id = id;
        this.price = price;
        this.featurePrice = featurePrice;
        this.discount = discount;
        this.movieid = movieid;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFeaturePrice() {
        return featurePrice;
    }

    public void setFeaturePrice(int featurePrice) {
        this.featurePrice = featurePrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
