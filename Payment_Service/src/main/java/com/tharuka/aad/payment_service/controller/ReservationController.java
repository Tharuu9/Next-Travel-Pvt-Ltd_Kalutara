package com.tharuka.aad.payment_service.controller;

import com.tharuka.aad.payment_service.entity.Reservation;
import com.tharuka.aad.payment_service.service.ReservationService;
import com.tharuka.aad.payment_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping(value = "/make")
    public Response makeReservation(@RequestBody Reservation reservation){
        return new Response(HttpStatus.OK,"Reserved Successfully..!",reservationService.makeReservation(reservation));
    }

    @PutMapping(value = "/edit")
    public Response editReservation(@RequestBody Reservation reservation){
        if (findDateDifference(String.valueOf(reservation.getReservationId()))){
            return new Response(HttpStatus.OK,"Edited..!",reservationService.editReservation(reservation));
        }
        return new Response(HttpStatus.SERVICE_UNAVAILABLE,"Can't Edited..!",null);
    }

    private boolean findDateDifference(String valueOf) {
    }

}
