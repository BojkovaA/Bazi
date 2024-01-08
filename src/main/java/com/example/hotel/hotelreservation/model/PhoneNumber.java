package com.example.hotel.hotelreservation.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "phone_number")
public class PhoneNumber {
    @EmbeddedId
    private PhoneNumberId id;
}
