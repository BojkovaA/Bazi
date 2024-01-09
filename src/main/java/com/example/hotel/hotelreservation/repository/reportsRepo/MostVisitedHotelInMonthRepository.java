package com.example.hotel.hotelreservation.repository.reportsRepo;

import com.example.hotel.hotelreservation.model.reports.MostVisitedHotelInMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MostVisitedHotelInMonthRepository extends JpaRepository<MostVisitedHotelInMonth, Long> {

    @Query("SELECT mh FROM MostVisitedHotelInMonth mh WHERE mh.month = :selectedMonth AND mh.year = :selectedYear")
    List<MostVisitedHotelInMonth> findByMonthAndYear(@Param("selectedMonth") BigDecimal selectedMonth, @Param("selectedYear") BigDecimal selectedYear);
}