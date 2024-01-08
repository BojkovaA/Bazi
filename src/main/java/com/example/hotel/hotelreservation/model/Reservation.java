package com.example.hotel.hotelreservation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private Integer id;

    @Column(name = "reservation_date", nullable = false)
    private LocalDate reservationDate;

    @Column(name = "payment", nullable = false)
    private String payment;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "check_in_date", nullable = false)
    private LocalDate checkInDate;

    @Column(name = "check_out_date", nullable = false)
    private LocalDate checkOutDate;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "room_number", referencedColumnName = "room_number"),
            @JoinColumn(name = "id_hotel", referencedColumnName = "id_hotel")
    })
    private Room room;

    @ManyToOne
    @JoinColumn(name = "id_guest", nullable = false)
    private Guest guest;}
