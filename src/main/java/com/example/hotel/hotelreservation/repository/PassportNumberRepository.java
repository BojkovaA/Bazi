package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.PassportNumber;
import com.example.hotel.hotelreservation.model.PassportNumberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportNumberRepository extends JpaRepository<PassportNumber, PassportNumberId> {
}
