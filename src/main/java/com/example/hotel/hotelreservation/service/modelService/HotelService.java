package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.City;
import com.example.hotel.hotelreservation.model.Hotel;

import java.util.List;

public interface HotelService {

    void createHotel(
            String hotelName,
            String hotelAddress,
            Integer cityId,
            Integer roomNumber,
            String roomType
    );



}
