package com.altimetric.travel.travellingoption.service;

import com.altimetric.travel.travellingoption.mockData.AirData;
import com.altimetric.travel.travellingoption.model.Air;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FastestTravelOption {

    public Air calculateFastestTravelOptions(){


            List<Air> airs = new AirData().getAirData();
            return airs.get(0);

            /*String url = "https://api.sandbox.amadeus.com/v1.2/flights/inspiration-search";
            RestTemplate restTemplate = new RestTemplate();
            responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, Air.class);
*/

    }
}
