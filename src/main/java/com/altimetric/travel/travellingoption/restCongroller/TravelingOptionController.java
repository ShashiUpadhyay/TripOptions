package com.altimetric.travel.travellingoption.restCongroller;

import com.altimetric.travel.travellingoption.model.Car;
import com.altimetric.travel.travellingoption.service.MostComfortableOption;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TravelingOptionController {

    @Autowired
    private MostComfortableOption carService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> test(@RequestParam(value = "", required = false) String Input){
        carService.calculateComfortableOptions();
        return new ResponseEntity<>("Altimetric", HttpStatus.OK);



    }
}
