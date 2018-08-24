package com.altimetric.travel.travellingoption.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    private String location;
    private String pickUp;
    private String dropOff;
    private String Category;
    private String Type;

    public Car(String location, String pickUp, String dropOff, String category, String type) {
        this.location = location;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
        Category = category;
        Type = type;
    }
}
