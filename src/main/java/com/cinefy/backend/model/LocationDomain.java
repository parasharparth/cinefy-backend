package com.cinefy.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocationDomain {


    private Long id;

    public LocationDomain() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    private String location;
    private int bookingId;
    private NumberOfTicketsDomain numberOfTickets;

    public LocationDomain(Long id, String location, int bookingId, NumberOfTicketsDomain numberOfTickets) {
        this.id = id;
        this.location = location;
        this.bookingId = bookingId;
        this.numberOfTickets = numberOfTickets;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setNumberOfTickets(NumberOfTicketsDomain numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
