package com.tharuka.aad.payment_service.controller;

import com.tharuka.aad.payment_service.entity.Reservation;
import com.tharuka.aad.payment_service.service.ReservationService;
import com.tharuka.aad.payment_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping(value = "/make")
    public Response makeReservation(@RequestBody Reservation reservation){
        return new Response(HttpStatus.OK,"Reserved..!",reservationService.makeReservation(reservation))
    }

}
