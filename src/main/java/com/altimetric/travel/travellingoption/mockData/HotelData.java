package com.altimetric.travel.travellingoption.mockData;

import com.altimetric.travel.travellingoption.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelData {

    List<Hotel> HotelData;

    public HotelData() {
        setHotelData();
    }

    public List<Hotel> getHotelData() {
        return HotelData;
    }

    public void setHotelData() {

        Hotel hotel1 = new Hotel("Newyork", "2010-12-05", "2010-12-08",80.00);
        Hotel hotel2 = new Hotel("Newyork",  "2010-12-05", "2010-12-08",80.00);
        Hotel hotel3 = new Hotel("Newyork",  "2010-12-05", "2010-12-08",80.00);
        Hotel hotel4 = new Hotel("Newyork",  "2010-12-05", "2010-12-08",80.00);

        HotelData = new ArrayList<>();
        HotelData.add(hotel1);
        HotelData.add(hotel2);
        HotelData.add(hotel3);
        HotelData.add(hotel4);
    }
}
