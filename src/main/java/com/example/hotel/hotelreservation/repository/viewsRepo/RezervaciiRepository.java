package com.example.hotel.hotelreservation.repository.viewsRepo;

import com.example.hotel.hotelreservation.model.views.Rezervacii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RezervaciiRepository extends JpaRepository<Rezervacii, Integer> {
    @Query(value="SELECT * FROM rezervacii", nativeQuery = true)
    List<Rezervacii> findAllRezervacii();
}
