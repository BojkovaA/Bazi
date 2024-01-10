package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    @Query(value = "CALL insert_reservation(:p_ReservationDate, :p_PaymentType, :p_Price, :p_CheckInDate, :p_CheckOutDate, :p_RoomNumber, :p_HotelID, :p_GuestID)", nativeQuery = true)
    void insertReservation(
            @Param("p_ReservationDate") LocalDate reservationDate,
            @Param("p_PaymentType") String paymentType,
            @Param("p_Price") Integer price,
            @Param("p_CheckInDate") LocalDate checkInDate,
            @Param("p_CheckOutDate") LocalDate checkOutDate,
            @Param("p_RoomNumber") Integer roomNumber,
            @Param("p_HotelID") Integer hotelId,
            @Param("p_GuestID") Integer guestId
    );
}
