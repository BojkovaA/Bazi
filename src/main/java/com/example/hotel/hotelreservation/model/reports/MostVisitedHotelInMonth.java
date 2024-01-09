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
@Table(name = "most_visited_hotel_in_month")
@NoArgsConstructor
@AllArgsConstructor
public class MostVisitedHotelInMonth {

    @Id
    private Long report_id;
    private String name;
    private BigDecimal month;
    private BigDecimal year;
    private Long total_reservations;
    private Long total_payment;
}
