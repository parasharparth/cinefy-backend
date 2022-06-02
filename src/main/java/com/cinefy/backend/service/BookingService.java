package com.cinefy.backend.service;

import com.cinefy.backend.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface BookingService {

    public List<LocationDomain> getLocationDomainList();
    public List<BookingPageDomain> getBookingPageDomainsList();
    public List<NumberOfTicketsDomain> getNumberOfTicketsDomainList();
    public List<PriceDomain> getPriceDomainList();
    public String convert(List<BookingPageDomain> list) throws JsonProcessingException;
    public String objectBuilder(String bookingpageObject) throws JsonProcessingException;
}
