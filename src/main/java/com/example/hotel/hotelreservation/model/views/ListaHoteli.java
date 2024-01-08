package com.example.hotel.hotelreservation.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Data
@Entity
@Immutable
@Table(name = "lista_hoteli")
@NoArgsConstructor
@AllArgsConstructor
public class ListaHoteli {
    @Id
    private String hotel_name;

    private String city_name;


}
