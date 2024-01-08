package com.example.hotel.hotelreservation.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "passport_number")
public class PassportNumber {

    @EmbeddedId
    private PassportNumberId id;
}
