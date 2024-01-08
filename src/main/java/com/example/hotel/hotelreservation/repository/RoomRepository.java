package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
