package com.tharuka.aad.travel_service.service.impl;

import com.tharuka.aad.travel_service.entity.TravelPackage;
import com.tharuka.aad.travel_service.repository.TravelPackageRepository;
import com.tharuka.aad.travel_service.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelPackageServiceImpl implements TravelPackageService {
    @Autowired
    private TravelPackageRepository travelPackageRepository;

    @Override
    public TravelPackage addTravelPackage(TravelPackage travelPackage) {
        if (travelPackageRepository.existsByPackageCategory(travelPackage.getPackageCategory())){
            throw new RuntimeException("Travel Package Already Exists..!");
        }
        return travelPackageRepository.save(travelPackage);
    }

    @Override
    public TravelPackage updateTravelPackage(TravelPackage travelPackage) {
        if (!travelPackageRepository.existsById(travelPackage.getId())){
            throw new RuntimeException("Travel Package Not Found..!");
        }
        return travelPackageRepository.save(travelPackage);
    }

    @Override
    public void deletePackage(Integer id) {
        if (!travelPackageRepository.existsById(id)){
            throw new RuntimeException("Oops!Package Not Found..!");
        }
        travelPackageRepository.deleteById(id);
    }

    @Override
    public List<TravelPackage> fetchAllPackages(){
        return travelPackageRepository.findAll();
    }
}
