package com.example.hotel.hotelreservation.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Immutable
@Table(name = "slobodni_sobi")
@NoArgsConstructor
@AllArgsConstructor
public class SlobodniSobi {

    @Id
    private Integer room_number;
    private Integer id_hotel;
    private String name;
    private String room_type;
    private LocalDate check_in_date;
    private LocalDate check_out_date;
    private Integer price;
}
