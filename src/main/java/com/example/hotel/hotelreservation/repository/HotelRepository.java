package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    @Modifying
    @Query(value = "CALL sp_InsertHotelAndRooms(:p_HotelName, :p_HotelAddress, :p_CityID, :p_RoomNumber, :p_RoomType)", nativeQuery = true)
    void insertHotelAndRooms(
            @Param("p_HotelName") String hotelName,
            @Param("p_HotelAddress") String hotelAddress,
            @Param("p_CityID") Integer cityId,
            @Param("p_RoomNumber") Integer roomNumber,
            @Param("p_RoomType") String roomType
    );

}
