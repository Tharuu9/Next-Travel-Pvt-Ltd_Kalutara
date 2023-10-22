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

    @PostMapping("/add_hotel")
    public Response addHotel(@RequestBody Hotel hotel){
        return new Response("Ok","Added..!",hotelService.addHotel(hotel));
    }

    @GetMapping
    public Response fetchAllHotel(){
        return new Response("Ok","Done..!",hotelService.fetchAllHotel());
    }

    @GetMapping(value = "/check")
    public Boolean checkHotelExists(@RequestParam Integer hotelId,@RequestParam String name){
        return hotelService.checkExistsHotel(hotelId,name);
    }
}
