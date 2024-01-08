package com.example.hotel.hotelreservation.service.modelService;

import com.example.hotel.hotelreservation.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomById(Integer id);
    void saveRoom(Room room);
    void deleteRoom(Integer id);
}
