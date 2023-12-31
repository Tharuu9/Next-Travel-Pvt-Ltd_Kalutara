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
    private Integer id;
    private String carName;
    private String regNumber;
    private String brand;
    private String category;
    private String fuelType;
    private String fuelUsage;
    private String transmissionType;
    private Integer seatCapacity;
    private double pricePerDay;
    private String status;
}
