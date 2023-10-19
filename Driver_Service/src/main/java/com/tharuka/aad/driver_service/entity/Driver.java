package com.tharuka.aad.driver_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver_details")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String contactNum;
    private String nic;
    private String address;
    private String status;
    private String drivingLicenseFrontImg;
    private String drivingLicenseRearImg;
}
