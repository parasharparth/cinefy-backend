package com.cinefy.backend.service;

import com.cinefy.backend.model.BookingPageDomain;
import com.cinefy.backend.model.LocationDomain;
import com.cinefy.backend.model.NumberOfTicketsDomain;
import com.cinefy.backend.model.PriceDomain;
import com.cinefy.backend.repository.BookingRepository;
import com.cinefy.backend.repository.LocationRepository;
import com.cinefy.backend.repository.NumberOfTicketsRepository;
import com.cinefy.backend.repository.PriceRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private NumberOfTicketsRepository numberOfTicketsRepository;

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private BookingRepository bookingRepository;

    //get all the details in the global variables
    public List<LocationDomain> locationDomainList;
    public List<NumberOfTicketsDomain> numberOfTicketsDomainList;
    public List<PriceDomain> priceDomainList;
    public List<BookingPageDomain> bookingPageDomainList;


    @Override
    public List<LocationDomain> getLocationDomainList() {
        locationDomainList = locationRepository.findAll();
        return locationDomainList;
    }

    @Override
    public List<BookingPageDomain> getBookingPageDomainsList() {
        bookingPageDomainList = bookingRepository.findAll();
        return bookingPageDomainList;
    }

    @Override
    public List<NumberOfTicketsDomain> getNumberOfTicketsDomainList() {
        numberOfTicketsDomainList = numberOfTicketsRepository.findAll();
        return numberOfTicketsDomainList;
    }

    @Override
    public List<PriceDomain> getPriceDomainList() {
        priceDomainList = priceRepository.findAll();
        return priceDomainList;
    }

    @Override
    public String convert(List<BookingPageDomain> list) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(list);
        return jsonString;
    }

    @Override
    public String objectBuilder(String bookingpageObject) throws JsonProcessingException {
       String domainstring = convert(bookingPageDomainList);
       domainstring = domainstring + priceDomainList.toString() + locationDomainList.toString() + numberOfTicketsDomainList.toString();
       return domainstring;
    }


}
