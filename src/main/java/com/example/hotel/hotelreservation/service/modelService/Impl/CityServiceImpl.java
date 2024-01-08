package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.City;
import com.example.hotel.hotelreservation.repository.CityRepository;
import com.example.hotel.hotelreservation.service.modelService.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(Integer id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCity(City city) {
        cityRepository.save(city);
    }

    @Override
    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }
}
