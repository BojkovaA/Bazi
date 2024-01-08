package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.City;
import com.example.hotel.hotelreservation.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAllHotels();
    Hotel getHotelById(Integer id);
    void saveHotel(Hotel hotel);
    void deleteHotel(Integer id);



}
