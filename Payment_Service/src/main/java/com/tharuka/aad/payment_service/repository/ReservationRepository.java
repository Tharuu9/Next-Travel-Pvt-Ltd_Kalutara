package com.tharuka.aad.payment_service.repository;

import com.tharuka.aad.payment_service.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    @Query("SELECT rr.reservedDate FROM Reservation rr WHERE rr.reservationId=:reservationId")
    Date getReservedDateByReservationId(@Param("reservationId") String reservationId);
}
