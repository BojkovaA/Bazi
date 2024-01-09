package com.example.hotel.hotelreservation.web;

import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import com.example.hotel.hotelreservation.model.views.Rezervacii;
import com.example.hotel.hotelreservation.model.views.SlobodniSobi;
import com.example.hotel.hotelreservation.service.modelService.HotelService;
import com.example.hotel.hotelreservation.service.viewService.ListaHoteliService;
import com.example.hotel.hotelreservation.service.viewService.RezervaciiService;
import com.example.hotel.hotelreservation.service.viewService.SlobodniSobiService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HotelReservationMainController {

    private final HotelService hotelService;
    private final ListaHoteliService listaHoteliService;
    private final SlobodniSobiService slobodniSobiService;
    private final RezervaciiService rezervaciiService;

    public HotelReservationMainController(HotelService hotelService, ListaHoteliService listaHoteliService, SlobodniSobiService slobodniSobiService, RezervaciiService rezervaciiService) {
        this.hotelService = hotelService;
        this.listaHoteliService = listaHoteliService;
        this.slobodniSobiService = slobodniSobiService;
        this.rezervaciiService = rezervaciiService;
    }

    @GetMapping
    public String getMainPage(Model model){
        List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
        model.addAttribute("hotelsWithCities", hotelsWithCities);
        return "home";
    }

    @GetMapping("/free_rooms")
    public String getFreeRooms(){
        return "free_rooms";
    }

    @PostMapping("/free_rooms")
    public String searchFreeRooms(Model model,
                                  @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                  @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        List<SlobodniSobi> freeRooms = slobodniSobiService.findAvailableRoomsByDateRange(startDate, endDate);
        model.addAttribute("freeRooms", freeRooms);
        return "free_rooms";
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
        if (city == "") {
            List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
            model.addAttribute("hotelsWithCities", hotelsWithCities);
        }
        else{
            model.addAttribute("hotelsWithCities",listaHoteliService.getAllHotelsByCityName(city));
        }
        return "search";
    }

    @GetMapping("/rezervacii")
    public String getAllRezervacii(Model model) {
        List<Rezervacii> rezervaciiList = rezervaciiService.findAllRezervacii();
        model.addAttribute("rezervaciiList", rezervaciiList);
        return "rezervacii";
    }

    @GetMapping("/reservation")
    public String getMakeAReservation(Model model){
        return "reservation";
    }
}
