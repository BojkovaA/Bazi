package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> getAllReservations();
    Reservation getReservationById(Integer id);
    void saveReservation(Reservation reservation);
    void deleteReservation(Integer id);
}
