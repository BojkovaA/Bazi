package com.example.hotel.hotelreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class RoomId implements Serializable {

    @Column(name = "room_number")
    private Integer roomNumber;

    @ManyToOne
    @JoinColumn(name = "id_hotel", nullable = false)
    private Hotel hotel;
}
