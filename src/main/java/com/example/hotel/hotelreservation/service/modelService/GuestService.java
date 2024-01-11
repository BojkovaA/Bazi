package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Guest;

import java.time.LocalDate;
import java.util.List;

public interface GuestService {
    void createUser(
            String firstName,
            String lastName
    );
}
