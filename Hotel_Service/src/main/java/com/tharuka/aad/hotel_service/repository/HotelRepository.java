package com.tharuka.aad.hotel_service.repository;

import com.tharuka.aad.hotel_service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {

    boolean existsByIdAndName(Integer id, String name);
}
