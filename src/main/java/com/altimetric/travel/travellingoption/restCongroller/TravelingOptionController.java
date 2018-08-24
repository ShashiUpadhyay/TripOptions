package com.altimetric.travel.travellingoption.restCongroller;

import com.altimetric.travel.travellingoption.model.TravelParameters;
import com.altimetric.travel.travellingoption.service.CheapestTravelOptions;
import com.altimetric.travel.travellingoption.service.FastestTravelOption;
import com.altimetric.travel.travellingoption.service.MostComfortableOption;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TravelingOptionController {

    @Autowired
    private MostComfortableOption carService;

    @Autowired
    private FastestTravelOption fastestTravelOption;

    @Autowired
    private CheapestTravelOptions cheapestTravelOptions;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test(@ApiParam(value = "travelParameter", required = false) @RequestParam(value = "travelParameter", required = false) TravelParameters travelParameters) {

        if(travelParameters == null){
            travelParameters = new TravelParameters();
        }
        if (travelParameters.getComfortOptions() == "Cheapest") {
            return cheapestTravelOptions.calculateCheapestTravelOptions().toString();
        } else if (travelParameters.getComfortOptions() == "Fastest") {
            return fastestTravelOption.calculateFastestTravelOptions().toString();
        } else {
            return carService.calculateComfortableOptions().toString();
        }

    }
}
