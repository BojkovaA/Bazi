package com.example.hotel.hotelreservation.web;

import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import com.example.hotel.hotelreservation.service.modelService.HotelService;
import com.example.hotel.hotelreservation.service.viewService.ListaHoteliService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HotelReservationMainController {

    private final HotelService hotelService;
    private final ListaHoteliService listaHoteliService;

    public HotelReservationMainController(HotelService hotelService, ListaHoteliService listaHoteliService) {
        this.hotelService = hotelService;
        this.listaHoteliService = listaHoteliService;
    }

    @GetMapping
    public String getMainPage(Model model){
        List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
        model.addAttribute("hotelsWithCities", hotelsWithCities);
        return "home";
    }

    @GetMapping("/add")
    public String getAddHotel(){ return "addhotel"; }


    @GetMapping("/search")
    public String getSearchHotel(Model model){
        List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
        model.addAttribute("hotelsWithCities", hotelsWithCities);
        return "search";
    }
    @PostMapping("/search")
    public String postSearchHotel(Model model, @RequestParam String city) {
        if (city == null) {
            List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
            model.addAttribute("hotelsWithCities", hotelsWithCities);
            return "search";
        }
        return "search";
    }


    @GetMapping("/reservation")
    public String getMakeAReservation(Model model){
        return "reservation";
    }
}
