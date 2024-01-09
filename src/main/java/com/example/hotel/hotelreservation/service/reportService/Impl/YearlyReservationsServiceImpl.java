package com.example.hotel.hotelreservation.service.reportService.Impl;

import com.example.hotel.hotelreservation.model.reports.YearlyReservations;
import com.example.hotel.hotelreservation.repository.reportsRepo.YearlyReservationsRepository;
import com.example.hotel.hotelreservation.service.reportService.YearlyReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class YearlyReservationsServiceImpl implements YearlyReservationsService {

    private final YearlyReservationsRepository yearlyReservationsRepository;

    @Autowired
    public YearlyReservationsServiceImpl(YearlyReservationsRepository yearlyReservationsRepository) {
        this.yearlyReservationsRepository = yearlyReservationsRepository;
    }

    @Override
    public List<YearlyReservations> getYearlyReservations(BigDecimal selectedYear) {
        return yearlyReservationsRepository.findByYear(selectedYear);
    }
}