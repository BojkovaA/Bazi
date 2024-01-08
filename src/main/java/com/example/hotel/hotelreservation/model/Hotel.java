package com.example.hotel.hotelreservation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hotel")
    private Integer id_hotel;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "adress", nullable = false)
    private String adress;
    @ManyToOne
    @JoinColumn(name = "id_city")
    private City city;

}
