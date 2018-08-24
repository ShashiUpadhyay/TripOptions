package com.altimetric.travel.travellingoption.service;

import com.altimetric.travel.travellingoption.mockData.CarData;
import com.altimetric.travel.travellingoption.model.Car;
import com.altimetric.travel.travellingoption.model.CarResponseList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class MostComfortableOption {

    public Car calculateComfortableOptions(){
        ResponseEntity<String> responseEntity = null;

            List<Car> cars = new CarData().getCarData();
            // logic to find the comfortable car
            return cars.get(0);

            /*HttpHeaders httpHeaders = new HttpHeaders();
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
            responseEntity = restTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, httpEntity, String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            CarResponseList cars = objectMapper.readValue(responseEntity.getBody(),CarResponseList.class);
            System.out.println(responseEntity.getBody());
            JSONParser parser = new JSONParser();
            JSONPObject json = (JSONPObject) parser.parse(responseEntity.getBody());*/



    }
}
