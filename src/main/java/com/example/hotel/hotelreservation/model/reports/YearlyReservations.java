package com.example.hotel.hotelreservation.model.reports;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Data
@Entity
@Immutable
@Table(name = "yearly_reservations")
@NoArgsConstructor
@AllArgsConstructor
public class YearlyReservations {

    @Id
    private Long report_id;
    private Integer id_guest;
    private String first_name;
    private BigDecimal year;
    private Long total_reservations;
    private Long total_payment;
}
