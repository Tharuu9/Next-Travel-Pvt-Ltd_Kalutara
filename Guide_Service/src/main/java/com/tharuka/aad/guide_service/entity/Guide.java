package com.tharuka.aad.guide_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Guide {

    @Id
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String address;
    private String contactNumber;
    private double manDayPrice;
    private String status;
}
