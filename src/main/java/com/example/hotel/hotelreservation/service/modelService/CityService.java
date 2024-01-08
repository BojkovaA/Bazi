package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities();
    City getCityById(Integer id);
    void saveCity(City city);
    void deleteCity(Integer id);
}
