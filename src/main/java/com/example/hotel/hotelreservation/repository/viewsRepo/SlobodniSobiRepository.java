package com.example.hotel.hotelreservation.repository.viewsRepo;

import com.example.hotel.hotelreservation.model.views.SlobodniSobi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SlobodniSobiRepository extends JpaRepository<SlobodniSobi, Integer> {
    @Query(value = "SELECT * FROM slobodni_sobi", nativeQuery = true)
    List<SlobodniSobi> findAllSlobodniSobi();
}
