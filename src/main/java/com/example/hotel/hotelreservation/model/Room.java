package com.example.hotel.hotelreservation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "room")
public class Room {

    @EmbeddedId
    private RoomId id;

    @Column(name = "room_type", nullable = false)
    private String roomType;

}
