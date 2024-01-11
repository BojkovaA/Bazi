package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Integer> {

    @Modifying
    @Query(value = "CALL insert_guest(:p_NewFirstName, :p_NewLastName)", nativeQuery = true)
    void insertGuest(
            @Param("p_NewFirstName") String firstName,
            @Param("p_NewLastName") String lastName
    );
}
