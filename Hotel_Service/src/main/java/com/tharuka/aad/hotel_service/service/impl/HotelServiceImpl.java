package com.tharuka.aad.hotel_service.service.impl;

import com.tharuka.aad.hotel_service.entity.Hotel;
import com.tharuka.aad.hotel_service.repository.HotelRepository;
import com.tharuka.aad.hotel_service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        if (hotelRepository.existsByIdAndName(hotel.getId(),hotel.getName())){
            return hotelRepository.save(hotel);
        }
        throw new RuntimeException("Hotel Already Exists..!");
    }

    @Override
    public List<Hotel> fetchAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public boolean checkExistsHotel(Integer hotelId, String name) {
        return hotelRepository.existsByIdAndName(hotelId,name);
    }
}
