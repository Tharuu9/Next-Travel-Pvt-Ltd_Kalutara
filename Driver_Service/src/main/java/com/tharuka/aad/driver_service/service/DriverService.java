package com.tharuka.aad.driver_service.service;

import com.tharuka.aad.driver_service.entity.Driver;

import java.util.List;

public interface DriverService {
    Driver addDriver(Driver driver);
    List<Driver> fetchAllDriver();
    boolean checkExistsDriver(Integer driverId,String name);
    void updateDriver(Driver driver);
    Object searchDriver(Integer id);
}
