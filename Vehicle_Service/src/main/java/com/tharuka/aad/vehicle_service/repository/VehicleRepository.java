package com.tharuka.aad.vehicle_service.repository;

import com.tharuka.aad.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
