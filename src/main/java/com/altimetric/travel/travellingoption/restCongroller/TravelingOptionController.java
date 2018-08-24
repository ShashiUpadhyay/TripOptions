package com.altimetric.travel.travellingoption.restCongroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TravelingOptionController {

    @GetMapping("/")
    public String test(){
        return "hello Altrimetric";
    }
}
