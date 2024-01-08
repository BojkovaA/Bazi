package com.example.hotel.hotelreservation.repository;

import com.example.hotel.hotelreservation.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
