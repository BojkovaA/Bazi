package com.example.hotel.hotelreservation.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Embeddable
public class PassportNumberId implements Serializable {
    @Column(name = "id_pass_number")
    private Integer id_pass_number;

    @ManyToOne
    @JoinColumn(name = "id_guest", nullable = false)
    private Guest guest;
}
