package com.example.hotel.hotelreservation.service.viewService;

import com.example.hotel.hotelreservation.model.Hotel;
import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaHoteliService{

    //List<ListaHoteli> findAllListaHoteli(String city);
//    List<ListaHoteli> findHotelsByCity(String cityName);
    List<ListaHoteli> getAllHotelsWithCity();
    List<ListaHoteli> getAllHotelsByCityName(String city);
}
