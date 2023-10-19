package com.tharuka.aad.driver_service.repository;

import com.tharuka.aad.driver_service.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
    boolean existsByIdAndName(Integer driverId,String name);
}
