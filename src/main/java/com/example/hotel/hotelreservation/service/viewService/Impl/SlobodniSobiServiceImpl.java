package com.example.hotel.hotelreservation.service.viewService.Impl;

import com.example.hotel.hotelreservation.model.views.SlobodniSobi;
import com.example.hotel.hotelreservation.repository.viewsRepo.SlobodniSobiRepository;
import com.example.hotel.hotelreservation.service.viewService.SlobodniSobiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SlobodniSobiServiceImpl implements SlobodniSobiService {

    private final SlobodniSobiRepository slobodniSobiRepository;

    @Autowired
    public SlobodniSobiServiceImpl(SlobodniSobiRepository slobodniSobiRepository) {
        this.slobodniSobiRepository = slobodniSobiRepository;
    }

    @Override
    public List<SlobodniSobi> findAvailableRoomsByDateRange(LocalDate startDate, LocalDate endDate) {
        return slobodniSobiRepository.findAllSlobodniSobiByDateRange(startDate, endDate);
    }

}
