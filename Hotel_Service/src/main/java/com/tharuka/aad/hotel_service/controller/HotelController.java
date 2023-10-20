package com.tharuka.aad.hotel_service.controller;

import com.tharuka.aad.hotel_service.entity.Hotel;
import com.tharuka.aad.hotel_service.service.HotelService;
import com.tharuka.aad.hotel_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/add")
    public Response addHotel(@RequestBody Hotel hotel){
        hotelService.addHotel(hotel);
        return new Response("Ok","Added..!",null);
    }
}
