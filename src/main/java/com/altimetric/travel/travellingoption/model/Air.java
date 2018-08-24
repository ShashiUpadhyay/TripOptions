package com.altimetric.travel.travellingoption.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Air {

    private String OriginCity;
    private String destinationCity;
    private Double price;
    private String airLineName;
    private String departureDate;
    private String returnDate;
    private Integer travelTime;

    public Air(String originCity, String destinationCity, Double price, String airLineName, String departureDate, String returnDate, Integer travelTime) {
        OriginCity = originCity;
        this.destinationCity = destinationCity;
        this.price = price;
        this.airLineName = airLineName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.travelTime = travelTime;
    }

}
