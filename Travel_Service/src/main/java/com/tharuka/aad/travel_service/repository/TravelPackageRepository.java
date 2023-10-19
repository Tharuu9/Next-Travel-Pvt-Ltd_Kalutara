package com.tharuka.aad.travel_service.repository;

import com.tharuka.aad.travel_service.entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TravelPackageRepository extends JpaRepository<TravelPackage, Integer> {
    Boolean existsByPackageCategory(String packageCategory);
}
