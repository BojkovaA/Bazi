package com.example.hotel.hotelreservation.repository.reportsRepo;

import com.example.hotel.hotelreservation.model.reports.YearlyReservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface YearlyReservationsRepository extends JpaRepository<YearlyReservations, Long> {

    @Query("SELECT yr FROM YearlyReservations yr WHERE yr.year = :selectedYear")
    List<YearlyReservations> findByYear(@Param("selectedYear") BigDecimal selectedYear);
}