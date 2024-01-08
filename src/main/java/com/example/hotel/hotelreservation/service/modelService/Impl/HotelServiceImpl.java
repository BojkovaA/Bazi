package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.City;
import com.example.hotel.hotelreservation.model.Hotel;
import com.example.hotel.hotelreservation.repository.HotelRepository;
import com.example.hotel.hotelreservation.service.modelService.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Integer id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public void saveHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Integer id) {
        hotelRepository.deleteById(id);
    }


}
