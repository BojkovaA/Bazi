package com.example.hotel.hotelreservation.web;

import com.example.hotel.hotelreservation.model.reports.MonthlyReservations;
import com.example.hotel.hotelreservation.model.reports.MostVisitedHotelInMonth;
import com.example.hotel.hotelreservation.model.reports.YearlyReservations;
import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import com.example.hotel.hotelreservation.model.views.Rezervacii;
import com.example.hotel.hotelreservation.model.views.SlobodniSobi;
import com.example.hotel.hotelreservation.service.modelService.GuestService;
import com.example.hotel.hotelreservation.service.modelService.HotelService;
import com.example.hotel.hotelreservation.service.modelService.ReservationService;
import com.example.hotel.hotelreservation.service.reportService.MonthlyReservationsService;
import com.example.hotel.hotelreservation.service.reportService.MostVisitedHotelInMonthService;
import com.example.hotel.hotelreservation.service.reportService.YearlyReservationsService;
import com.example.hotel.hotelreservation.service.viewService.ListaHoteliService;
import com.example.hotel.hotelreservation.service.viewService.RezervaciiService;
import com.example.hotel.hotelreservation.service.viewService.SlobodniSobiService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HotelReservationMainController {

    private final HotelService hotelService;
    private final ListaHoteliService listaHoteliService;
    private final SlobodniSobiService slobodniSobiService;
    private final RezervaciiService rezervaciiService;
    private final MonthlyReservationsService monthlyReservationsService;
    private final YearlyReservationsService yearlyReservationsService;
    private final MostVisitedHotelInMonthService mostVisitedHotelInMonthService;
    private final ReservationService reservationService;
    private final GuestService guestService;

    public HotelReservationMainController(HotelService hotelService, ListaHoteliService listaHoteliService, SlobodniSobiService slobodniSobiService, RezervaciiService rezervaciiService, MonthlyReservationsService monthlyReservationsService, MostVisitedHotelInMonthService mostVisitedHotelInMonthService, YearlyReservationsService yearlyReservationsService, MostVisitedHotelInMonthService mostVisitedHotelInMonthService1, ReservationService reservationService, GuestService guestService) {
        this.hotelService = hotelService;
        this.listaHoteliService = listaHoteliService;
        this.slobodniSobiService = slobodniSobiService;
        this.rezervaciiService = rezervaciiService;
        this.monthlyReservationsService = monthlyReservationsService;
        this.yearlyReservationsService = yearlyReservationsService;
        this.mostVisitedHotelInMonthService = mostVisitedHotelInMonthService1;
        this.reservationService = reservationService;

        this.guestService = guestService;
    }

    @GetMapping
    public String getMainPage(Model model) {
        List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
        model.addAttribute("hotelsWithCities", hotelsWithCities);
        return "home";
    }

    @GetMapping("/free_rooms")
    public String getFreeRooms() {
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
    public String getAddHotel() {
        return "addhotel";
    }


    @GetMapping("/search")
    public String getSearchHotel(Model model) {
        List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
        model.addAttribute("hotelsWithCities", hotelsWithCities);
        return "search";
    }

    @PostMapping("/search")
    public String postSearchHotel(Model model, @RequestParam String city) {
        if (city == "") {
            List<ListaHoteli> hotelsWithCities = listaHoteliService.getAllHotelsWithCity();
            model.addAttribute("hotelsWithCities", hotelsWithCities);
        } else {
            model.addAttribute("hotelsWithCities", listaHoteliService.getAllHotelsByCityName(city));
        }
        return "search";
    }

    @GetMapping("/rezervacii")
    public String getAllRezervacii(Model model) {
        List<Rezervacii> rezervaciiList = rezervaciiService.findAllRezervacii();
        model.addAttribute("rezervaciiList", rezervaciiList);
        return "rezervacii";
    }

    @PostMapping("/rezervacii")
    public String showReservations(Model model,
                                   @RequestParam("selectedMonth") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) BigDecimal selectedMonth) {
        List<MonthlyReservations> reservations = monthlyReservationsService.getReservationsByMonth(selectedMonth);
        model.addAttribute("reservations", reservations);

        return "reservationsMonth";
    }

    @GetMapping("/yearlyReservations")
    public String getYearReservations(Model model) {
        return "yearlyReservations";
    }

    @PostMapping("/yearlyReservations")
    public String showYearlyReservations(Model model,
                                         @RequestParam("selectedYear") BigDecimal selectedYear) {
        List<YearlyReservations> yearlyReservations = yearlyReservationsService.getYearlyReservations(selectedYear);
        model.addAttribute("yearlyReservations", yearlyReservations);
        return "yearlyReservations";
    }

    @GetMapping("/most_visited_hotel")
    public String getMostVisitedHotelPage() {
        return "most_visited";
    }

    @PostMapping("/most_visited")
    public String showMostVisitedHotel(Model model,
                                       @RequestParam("selectedMonth") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) BigDecimal selectedMonth,
                                       @RequestParam("selectedYear") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) BigDecimal selectedYear) {
        List<MostVisitedHotelInMonth> mostVisitedHotelList = mostVisitedHotelInMonthService.getMostVisitedHotelInMonth(selectedMonth, selectedYear);
        model.addAttribute("mostVisitedHotelList", mostVisitedHotelList);

        return "most_visited";
    }


    @GetMapping("/reservation")
    public String getMakeAReservation(Model model) {

        return "reservation";
    }

    @PostMapping("/reservation")
    public ResponseEntity<String> createReservation(
            @RequestParam("reservationDate") LocalDate reservationDate,
            @RequestParam("paymentType") String paymentType,
            @RequestParam("price") Integer price,
            @RequestParam("checkInDate") LocalDate checkInDate,
            @RequestParam("checkOutDate") LocalDate checkOutDate,
            @RequestParam("roomNumber") Integer roomNumber,
            @RequestParam("hotelId") Integer hotelId,
            @RequestParam("guestId") Integer guestId) {

        try {
            // Implementacija logike za pravljenje rezervacije u bazu
            reservationService.createReservation(reservationDate, paymentType, price, checkInDate, checkOutDate, roomNumber, hotelId, guestId);

            // Redirekcija na /home nakon uspešne rezervacije
            return ResponseEntity.status(HttpStatus.CREATED).body("Reservation created successfully");
        } catch (Exception e) {
            e.printStackTrace(); // Dodajte logovanje ili ispisivanje greške radi lakšeg otklanjanja problema
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating reservation");
        }
    }
    @GetMapping("/add_user")
    public String getAddUser(Model model) {

        return "add_user";
    }

    @PostMapping("/add_user")
    public ResponseEntity<String> createUser(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
            ) {

        try {
            guestService.createUser(firstName, lastName);

            // Redirekcija na /home nakon uspešne rezervacije
            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding user");
        }
    }

    @GetMapping("/add_hotel")
    public String getAddHotel(Model model) {
        return "add_hotel";
    }

    @PostMapping("/add_hotel")
    public ResponseEntity<String> createHotel(
            @RequestParam("hotelName") String hotelName,
            @RequestParam("hotelAddress") String hotelAddress,
            @RequestParam("cityId") Integer cityId,
            @RequestParam("roomNumber") Integer roomNumber,
            @RequestParam("roomType") String roomType
    ) {

        try {
            hotelService.createHotel(hotelName, hotelAddress, cityId, roomNumber, roomType);

            // Redirekcija na /home nakon uspešne rezervacije
            return ResponseEntity.status(HttpStatus.CREATED).body("Hotel added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding hotel");
        }
    }

}
