package com.tharuka.aad.vehicle_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicle_details")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String regNumber;
    private String brand;
    private String category;
    private String fuelType;
    private boolean hybrid;
    private String fuelUsage;
    private String frontImgUrl;
    private String rearImgUrl;
    private String transmissionType;
    private int seatCapacity;
    private String vehicleType;
}
