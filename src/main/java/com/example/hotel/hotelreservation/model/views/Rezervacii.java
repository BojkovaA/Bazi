package com.example.hotel.hotelreservation.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
@Data
@Entity
@Immutable
@Table(name = "rezervacii")
@NoArgsConstructor
@AllArgsConstructor
public class Rezervacii {

    @Id
    private Integer id_reservation;
    private String first_name;
    private String last_name;
    private String name;
    private LocalDate reservation_date;
    private Integer room_number;
}
