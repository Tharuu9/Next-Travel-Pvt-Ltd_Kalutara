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

    @PostMapping(value = "/add_hotel")
    public Response addHotel(@RequestBody Hotel hotel){
        return new Response("Ok","Added..!",hotelService.addHotel(hotel));
    }

    @PutMapping(value = "/update_hotel")
    public Response updateHotel(@RequestBody Hotel hotel){
        return new Response("Ok","Done..!",hotelService.updateHotel(hotel));
    }

    @DeleteMapping(value = "/delete_hotel")
    public Response deleteHotel(@RequestParam String hotelId){
        hotelService.deleteHotel(Integer.valueOf(hotelId));
        return new Response("Ok","Deleted..!",null);
    }

    @GetMapping(value = "/view_all")
    public Response fetchAllHotel(){
        return new Response("Ok","Done..!",hotelService.fetchAllHotel());
    }

    @GetMapping
    public Response getHotelsByCategory(@RequestParam Integer starRate) {
        return new Response("Ok", "Done..!", hotelService.findAllByStarRate(starRate));
    }
    @GetMapping(value = "/search")
    public Response searchHotelById(@RequestParam Integer id){
        return new Response("Okay","Done..!",hotelService.searchHotel(id));
    }
}
