package com.example.hotel.hotelreservation.repository.reportsRepo;

import com.example.hotel.hotelreservation.model.reports.MonthlyReservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MonthlyReservationsRepository extends JpaRepository<MonthlyReservations, Long> {

    @Query("SELECT mr FROM MonthlyReservations mr WHERE mr.month = :selectedMonth")
    List<MonthlyReservations> findByMonth(@Param("selectedMonth") BigDecimal selectedMonth);
}