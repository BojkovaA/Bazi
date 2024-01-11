package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {

    void createReservation(
            LocalDate reservationDate,
            String paymentType,
            Integer price,
            LocalDate checkInDate,
            LocalDate checkOutDate,
            Integer roomNumber,
            Integer hotelId,
            Integer guestId
    );
}
