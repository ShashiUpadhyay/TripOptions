package com.altimetric.travel.travellingoption.mockData;

import com.altimetric.travel.travellingoption.model.Air;

import java.util.ArrayList;
import java.util.List;

public class AirData {

    public AirData() {
        setAirData();
    }

    List<Air> airData;

    public List<Air> getAirData() {
        return airData;
    }

    public void setAirData() {

        Air air1 = new Air("Newyork", "Chicago", 80.00, "Delta", "2010-12-05", "2010-12-08", 3);
        Air air2 = new Air("Newyork", "Chicago", 80.00, "Delta", "2010-12-05", "2010-12-08", 3);
        Air air3 = new Air("Newyork", "Chicago", 80.00, "Delta", "2010-12-05", "2010-12-08", 3);
        Air air4 = new Air("Newyork", "Chicago", 80.00, "Delta", "2010-12-05", "2010-12-08", 3);
        Air air5 = new Air("Newyork", "Chicago", 80.00, "Delta", "2010-12-05", "2010-12-08", 3);

        airData = new ArrayList<>();
        airData.add(air1);
        airData.add(air2);
        airData.add(air3);
        airData.add(air4);
        airData.add(air5);
    }
}
