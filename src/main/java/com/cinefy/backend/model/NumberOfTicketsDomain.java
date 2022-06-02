package com.cinefy.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NumberOfTicketsDomain {


    private Long id;

    public NumberOfTicketsDomain() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    private int movieId;
    private int numberOfTickets;
    private int bookingId;
    private PriceDomain price;

    public NumberOfTicketsDomain(Long id, int movieId, int numberOfTickets, int bookingId, PriceDomain price) {
        this.id = id;
        this.movieId = movieId;
        this.numberOfTickets = numberOfTickets;
        this.bookingId = bookingId;
        this.price = price;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }



    public void setPrice(PriceDomain price) {
        this.price = price;
    }
}
