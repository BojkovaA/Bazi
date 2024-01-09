package com.example.hotel.hotelreservation.service.reportService.Impl;

import com.example.hotel.hotelreservation.model.reports.MostVisitedHotelInMonth;
import com.example.hotel.hotelreservation.repository.reportsRepo.MostVisitedHotelInMonthRepository;
import com.example.hotel.hotelreservation.service.reportService.MostVisitedHotelInMonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MostVisitedHotelInMonthServiceImpl implements MostVisitedHotelInMonthService {

    private final MostVisitedHotelInMonthRepository mostVisitedHotelInMonthRepository;

    @Autowired
    public MostVisitedHotelInMonthServiceImpl(MostVisitedHotelInMonthRepository mostVisitedHotelInMonthRepository) {
        this.mostVisitedHotelInMonthRepository = mostVisitedHotelInMonthRepository;
    }

    @Override
    public List<MostVisitedHotelInMonth> getMostVisitedHotelInMonth(BigDecimal selectedMonth, BigDecimal selectedYear) {
        return mostVisitedHotelInMonthRepository.findByMonthAndYear(selectedMonth, selectedYear);
    }
}