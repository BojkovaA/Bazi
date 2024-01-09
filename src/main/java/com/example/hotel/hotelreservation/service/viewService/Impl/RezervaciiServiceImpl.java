package com.example.hotel.hotelreservation.service.viewService.Impl;

import com.example.hotel.hotelreservation.model.views.Rezervacii;
import com.example.hotel.hotelreservation.repository.viewsRepo.RezervaciiRepository;
import com.example.hotel.hotelreservation.service.viewService.RezervaciiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervaciiServiceImpl implements RezervaciiService {

    private final RezervaciiRepository rezervaciiRepository;

    @Autowired
    public RezervaciiServiceImpl(RezervaciiRepository rezervaciiRepository) {
        this.rezervaciiRepository = rezervaciiRepository;
    }

    @Override
    public List<Rezervacii> findAllRezervacii() {
        return rezervaciiRepository.findAllRezervacii();
    }
}