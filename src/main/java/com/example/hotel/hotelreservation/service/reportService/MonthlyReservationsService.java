package com.example.hotel.hotelreservation.service.reportService;

import com.example.hotel.hotelreservation.model.reports.MonthlyReservations;
import com.example.hotel.hotelreservation.repository.reportsRepo.MonthlyReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface MonthlyReservationsService {
    List<MonthlyReservations> getReservationsByMonth(BigDecimal selectedMonth);
}