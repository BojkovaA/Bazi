package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.Guest;
import com.example.hotel.hotelreservation.repository.GuestRepository;
import com.example.hotel.hotelreservation.service.modelService.GuestService;
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

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest getGuestById(Integer id) {
        return guestRepository.findById(id).orElse(null);
    }

    @Override
    public void saveGuest(Guest guest) {
        guestRepository.save(guest);
    }

    @Override
    public void deleteGuest(Integer id) {
        guestRepository.deleteById(id);
    }
}
