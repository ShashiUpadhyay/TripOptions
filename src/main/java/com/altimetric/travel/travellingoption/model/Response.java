package com.altimetric.travel.travellingoption.model;

public class Response {

    public TripOption faster;
    public TripOption cheaper;
    public TripOption comfortable;

    Response(TripOption faster, TripOption cheaper, TripOption comfortable){
        this.faster = faster;
        this.cheaper = cheaper;
        this.comfortable = comfortable;
    }
}
