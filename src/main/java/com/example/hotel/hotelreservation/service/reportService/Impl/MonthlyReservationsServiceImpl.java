package com.example.hotel.hotelreservation.service.reportService.Impl;

import com.example.hotel.hotelreservation.model.reports.MonthlyReservations;
import com.example.hotel.hotelreservation.repository.reportsRepo.MonthlyReservationsRepository;
import com.example.hotel.hotelreservation.service.reportService.MonthlyReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MonthlyReservationsServiceImpl implements MonthlyReservationsService {

    private final MonthlyReservationsRepository monthlyReservationsRepository;

    public MonthlyReservationsServiceImpl(MonthlyReservationsRepository monthlyReservationsRepository) {
        this.monthlyReservationsRepository = monthlyReservationsRepository;
    }
    @Override
    public List<MonthlyReservations> getReservationsByMonth(BigDecimal selectedMonth) {
        return monthlyReservationsRepository.findByMonth(selectedMonth);
    }
}