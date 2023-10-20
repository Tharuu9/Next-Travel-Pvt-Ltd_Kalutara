package com.tharuka.aad.payment_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservation_details")
public class Reservation {

    @Id
    private int reservationId;
    private String hotelId;
    private String hotelName;
    private String vehicleRegNumber;
    private String userName;
    private String idNumOrPassportNumber;
    private String status;
    private double totalAmount;
    private String driverName;
    private int headCount;
    private Date reservedDate;
}
