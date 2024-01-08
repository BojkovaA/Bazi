package com.example.hotel.hotelreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Embeddable
public class PhoneNumberId implements Serializable {

    @Column(name = "phone_number_id")
    private Integer phone_number_id;

    @ManyToOne
    @JoinColumn(name = "id_hotel", nullable = false)
    private Hotel hotel;
}
