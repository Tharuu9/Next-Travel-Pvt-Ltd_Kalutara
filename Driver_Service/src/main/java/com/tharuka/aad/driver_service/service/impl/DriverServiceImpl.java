package com.tharuka.aad.driver_service.service.impl;

import com.tharuka.aad.driver_service.entity.Driver;
import com.tharuka.aad.driver_service.repository.DriverRepository;
import com.tharuka.aad.driver_service.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepo;
    @Override
    public Driver addDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public List<Driver> fetchAllDriver() {
        return driverRepo.findAll();
    }

    @Override
    public boolean checkExistsDriver(Integer driverId, String name) {
        return driverRepo.existsByIdAndName(driverId,name);
    }

    @Override
    public void updateDriver(Driver driver) {
        if (!driverRepo.existsById(driver.getId())){
            throw new RuntimeException("Oops!Driver Not Found...!");
        }
        driverRepo.save(driver);
    }

    @Override
    public Driver searchDriver(Integer id) {
        return driverRepo.findById(id).get();
    }

    @Override
    public Driver getAvailableDrive() {
        return null;
    }
}
