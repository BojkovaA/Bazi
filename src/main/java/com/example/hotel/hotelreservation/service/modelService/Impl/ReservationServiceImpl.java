package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.Reservation;
import com.example.hotel.hotelreservation.repository.ReservationRepository;
import com.example.hotel.hotelreservation.service.modelService.ReservationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    @Transactional
    @Override
    public void createReservation(
            LocalDate reservationDate,
            String paymentType,
            Integer price,
            LocalDate checkInDate,
            LocalDate checkOutDate,
            Integer roomNumber,
            Integer hotelId,
            Integer guestId
    ) {
        reservationRepository.insertReservation(
                reservationDate,
                paymentType,
                price,
                checkInDate,
                checkOutDate,
                roomNumber,
                hotelId,
                guestId
        );
    }
}