package com.tharuka.aad.travel_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "travel_packages_details")
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String packageCategory;
    private int starRate;
    private String description;
}
