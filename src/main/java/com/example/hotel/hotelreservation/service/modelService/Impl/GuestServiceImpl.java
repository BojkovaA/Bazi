package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.Guest;
import com.example.hotel.hotelreservation.repository.GuestRepository;
import com.example.hotel.hotelreservation.service.modelService.GuestService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;
    @Autowired
    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Transactional
    @Override
    public void createUser(String firstName, String lastName) {

        guestRepository.insertGuest(firstName, lastName);
    }
}
