package com.example.hotel.hotelreservation.repository.viewsRepo;

import com.example.hotel.hotelreservation.model.views.SlobodniSobi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface SlobodniSobiRepository extends JpaRepository<SlobodniSobi, Integer> {
    @Query(value = "SELECT * FROM slobodni_sobi WHERE  check_in_date < :startDate or check_out_date < :endDate", nativeQuery = true)
    List<SlobodniSobi> findAllSlobodniSobiByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

}
