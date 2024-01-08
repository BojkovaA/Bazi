package com.example.hotel.hotelreservation.service.modelService.Impl;

import com.example.hotel.hotelreservation.model.Room;
import com.example.hotel.hotelreservation.repository.RoomRepository;
import com.example.hotel.hotelreservation.service.modelService.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoom(Integer id) {
        roomRepository.deleteById(id);
    }
}
