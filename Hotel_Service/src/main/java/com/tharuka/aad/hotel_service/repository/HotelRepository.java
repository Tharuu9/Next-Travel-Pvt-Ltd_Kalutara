package com.tharuka.aad.hotel_service.repository;

import com.tharuka.aad.hotel_service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {

    List<Hotel> findAllByStarRate(Integer statRate);
}
