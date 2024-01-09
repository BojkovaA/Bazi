package com.example.hotel.hotelreservation.service.reportService;

import com.example.hotel.hotelreservation.model.reports.MostVisitedHotelInMonth;

import java.math.BigDecimal;
import java.util.List;

public interface MostVisitedHotelInMonthService {
    List<MostVisitedHotelInMonth> getMostVisitedHotelInMonth(BigDecimal selectedMonth, BigDecimal selectedYear);
}
