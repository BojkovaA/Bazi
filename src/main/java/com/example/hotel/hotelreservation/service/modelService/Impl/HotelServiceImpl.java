package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.City;
import com.example.hotel.hotelreservation.model.Hotel;
import com.example.hotel.hotelreservation.repository.HotelRepository;
import com.example.hotel.hotelreservation.service.modelService.HotelService;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public void createHotel(String hotelName, String hotelAddress, Integer cityId, Integer roomNumber, String roomType) {
        hotelRepository.insertHotelAndRooms(hotelName, hotelAddress, cityId, roomNumber, roomType);
    }
}
