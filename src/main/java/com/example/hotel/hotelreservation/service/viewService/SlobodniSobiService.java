package com.example.hotel.hotelreservation.service.viewService;

import com.example.hotel.hotelreservation.model.views.SlobodniSobi;

import java.time.LocalDate;
import java.util.List;

public interface SlobodniSobiService {
    List<SlobodniSobi> findAvailableRoomsByDateRange(LocalDate startDate, LocalDate endDate);
}