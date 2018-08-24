package com.altimetric.travel.travellingoption.mockData;

import com.altimetric.travel.travellingoption.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarData {
    List<Car> CarData;

    public CarData() {
        setCarData();
    }

    public List<Car> getCarData() {
        return CarData;
    }

    public void setCarData() {

        Car Car1 = new Car("Newyork", "2010-12-08", "2010-12-08","Special", "Special");
        Car Car2 = new Car("Newyork", "2010-12-08", "2010-12-08","Intermediate", "suv");
        Car Car3 = new Car("Newyork", "2010-12-08", "2010-12-08","standard", "convirtible");
        Car Car4 = new Car("Newyork", "2010-12-08", "2010-12-08","premium", "2/4");

        CarData = new ArrayList<>();
        CarData.add(Car1);
        CarData.add(Car2);
        CarData.add(Car3);
        CarData.add(Car4);
    }
}
