package com.tharuka.aad.hotel_service.service;

import com.tharuka.aad.hotel_service.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel addHotel(Hotel hotel);
    List<Hotel> fetchAllHotel();
    boolean checkExixtHotel(Integer hotelId,String name);
}
