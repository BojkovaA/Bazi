package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> getAllGuests();
    Guest getGuestById(Integer id);
    void saveGuest(Guest guest);
    void deleteGuest(Integer id);
}
