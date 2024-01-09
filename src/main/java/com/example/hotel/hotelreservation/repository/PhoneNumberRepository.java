package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.PhoneNumber;
import com.example.hotel.hotelreservation.model.PhoneNumberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, PhoneNumberId> {
}
