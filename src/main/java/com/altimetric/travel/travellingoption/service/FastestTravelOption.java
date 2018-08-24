package com.altimetric.travel.travellingoption.service;

import com.altimetric.travel.travellingoption.model.Air;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FastestTravelOption {

    public ResponseEntity calculateFastestTravelOptions(Air car){
        ResponseEntity<Air> responseEntity = null;
        try {

            String url = "https://api.sandbox.amadeus.com/v1.2/flights/inspiration-search";
            RestTemplate restTemplate = new RestTemplate();
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Air.class);


        }catch (Exception e){
            e.printStackTrace();
        }
        return responseEntity;
    }
}
