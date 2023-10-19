package com.tharuka.aad.vehicle_service.repository;

import com.tharuka.aad.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    List<Vehicle> findByCategory(String category);
    Boolean existsByRegNumber(String regNumber);

    void deleteByRegNumber(String regNumber);
}
