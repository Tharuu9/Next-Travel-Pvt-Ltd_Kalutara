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
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Integer hotelId) {
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public List<Hotel> fetchAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> findAllByStarRate(Integer starRate) {
        return hotelRepository.fingAllByStarRate(starRate);
    }

    @Override
    public Object searchHotel(Integer id) {
        return hotelRepository.findById(id);
    }
}
