package com.altimetric.travel.travellingoption.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfCar {
    List<Vehicle_info> cars;
}
