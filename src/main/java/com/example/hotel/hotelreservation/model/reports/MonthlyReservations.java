package com.example.hotel.hotelreservation.model.reports;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Entity
@Immutable
@Table(name = "monthly_reservations")
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyReservations {
    @Id
    private Long report_id;
    private String name;
    private BigDecimal month;
    private Long total_reservations;
    private Long total_payment;


}
