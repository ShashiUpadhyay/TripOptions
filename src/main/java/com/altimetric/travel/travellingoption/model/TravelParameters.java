package com.altimetric.travel.travellingoption.model;

public class TravelParameters {


    private String OriginCity;
    private String DestinationCity;
    private String StartDate;
    private int Days;
    private String comfortOptions;

    public TravelParameters() {
    }

    public TravelParameters(String originCity, String destinationCity, String startDate, int days, String comfortOptions) {
        OriginCity = originCity;
        DestinationCity = destinationCity;
        StartDate = startDate;
        Days = days;
        this.comfortOptions = comfortOptions;
    }

    public String getOriginCity() {
        return OriginCity;
    }

    public void setOriginCity(String originCity) {
        OriginCity = originCity;
    }

    public String getDestinationCity() {
        return DestinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        DestinationCity = destinationCity;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public int getDays() {
        return Days;
    }

    public void setDays(int days) {
        Days = days;
    }

    public String getComfortOptions() {
        return comfortOptions;
    }

    public void setComfortOptions(String comfortOptions) {
        this.comfortOptions = comfortOptions;
    }
}
