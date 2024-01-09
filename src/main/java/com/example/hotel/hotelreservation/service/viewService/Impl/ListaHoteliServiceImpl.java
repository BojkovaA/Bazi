package com.example.hotel.hotelreservation.service.viewService.Impl;

import com.example.hotel.hotelreservation.model.Hotel;
import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import com.example.hotel.hotelreservation.repository.viewsRepo.ListaHoteliRepository;
import com.example.hotel.hotelreservation.service.viewService.ListaHoteliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListaHoteliServiceImpl implements ListaHoteliService {
    private final ListaHoteliRepository listaHoteliRepository;

    @Autowired
    public ListaHoteliServiceImpl(ListaHoteliRepository listaHoteliRepository) {
        this.listaHoteliRepository = listaHoteliRepository;
    }

    @Override
    public List<ListaHoteli> getAllHotelsWithCity() {
        return this.listaHoteliRepository.findAllListaHoteli();
    }
}

