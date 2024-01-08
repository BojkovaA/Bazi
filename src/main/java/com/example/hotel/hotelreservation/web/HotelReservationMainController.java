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
    public String getMainPage(){
        return "home";
    }

    @GetMapping("/add")
    public String getAddHotel(){ return "addhotel"; }

    @GetMapping("/search")
    public String getSearchHotel(Model model){
        //model.addAttribute("list", listaHoteliService.findAllListaHoteli(city));
        return "search";
    }
//    @PostMapping("/search")
//    public String postSearchHotel(Model model, @RequestParam String city)
//    {
//        //List<ListaHoteli> hotels = listaHoteliService.findAllListaHoteli(city);
//        //model.addAttribute("hotels", hotels);
//        return "search";
//        //model.addAttribute("list",listaHoteliService.getAllHotelsByCity(city));
//        //return "search";
//    }
        @PostMapping("/search")
        public String postSearchHotel(Model model, @RequestParam String city)
        {
            // Добивање на хотелите за дадениот град
//            List<ListaHoteli> hotels = listaHoteliService.getAllHotelsByCity(city);
//            model.addAttribute("hotels", hotels);
            return "search";
        }

//    @GetMapping("/search")
//    public String getSearchHotel(Model model) {
//        return "search";
//    }
//
//    @PostMapping("/search")
//    public String postSearchHotel(Model model, @RequestParam String city) {
//        List<ListaHoteli> hotels = listaHoteliService.findHotelsByCity(city);
//        model.addAttribute("hotels", hotels);
//        return "search";
//    }

    @GetMapping("/reservation")
    public String getMakeAReservation(Model model){
        return "reservation";
    }
}
