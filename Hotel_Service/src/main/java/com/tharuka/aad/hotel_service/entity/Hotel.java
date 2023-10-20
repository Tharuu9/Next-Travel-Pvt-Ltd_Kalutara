package com.tharuka.aad.hotel_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel_details")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String name;
    private String hotelCategory;
    private String location;
    private String googleMapCoordinates;
    private String email;
    private String contact;
    private boolean petAreAllowed;
    private double hotelFee;
    private String cancellation_criteria;
}
