package com.altimetric.travel.travellingoption.service;

import com.altimetric.travel.travellingoption.model.Hotel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CheapestTravelOptions {

    public ResponseEntity calculateCheapestTravelOptions(Hotel hotel){
        ResponseEntity<Hotel> responseEntity = null;
        try {

            String url = "https://api.sandbox.amadeus.com/v1.2/cars/search-airport";
            RestTemplate restTemplate = new RestTemplate();
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Hotel.class);


        }catch (Exception e){
            e.printStackTrace();
        }
        return responseEntity;
    }
}
