package com.altimetric.travel.travellingoption.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle_info {
       String acriss_code;
               String transmission;
               String fuel;
               String air_conditioning;
               String category;
               String type;

    public String getAcriss_code() {
        return acriss_code;
    }

    public void setAcriss_code(String acriss_code) {
        this.acriss_code = acriss_code;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(String air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
