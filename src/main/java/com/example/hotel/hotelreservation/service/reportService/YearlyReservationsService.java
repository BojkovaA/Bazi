package com.example.hotel.hotelreservation.service.reportService;

import com.example.hotel.hotelreservation.model.reports.YearlyReservations;

import java.math.BigDecimal;
import java.util.List;

public interface YearlyReservationsService {

    List<YearlyReservations> getYearlyReservations(BigDecimal selectedYear);
}