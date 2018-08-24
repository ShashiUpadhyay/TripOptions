package com.altimetric.travel.travellingoption.service;

import com.altimetric.travel.travellingoption.model.Car;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MostComfortableOption {

    public ResponseEntity calculateComfortableOptions(){
        ResponseEntity<Car> responseEntity = null;
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("Host", "api.sandbox.amadeus.com");
            String url = "https://api.sandbox.amadeus.com/v1.2/cars/search-airport";
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url);
            uriComponentsBuilder
                    .queryParam("apikey","Xgn2B0fGDheopfmSOSuAOMXXRzplmCXT")
                    .queryParam("location","NCE")
                    .queryParam("pick_up","2018-12-07")
                    .queryParam("drop_off","2018-12-08");

            HttpEntity httpEntity = new HttpEntity(httpHeaders);
            RestTemplate restTemplate = new RestTemplate();
            responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, Car.class);
            System.out.println(responseEntity);

        }catch (Exception e){
            throw new RuntimeException("Exception while fetching data.");
        }
        return responseEntity;
    }
}
