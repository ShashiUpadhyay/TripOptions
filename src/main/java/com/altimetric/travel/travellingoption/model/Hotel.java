package com.altimetric.travel.travellingoption.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {

    private String location;
    private String checkinDate;
    private String checkoutDate;
    private Double price;

    public Hotel(String location, String checkinDate, String checkoutDate, Double price) {
        this.location = location;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.price = price;
    }

}
