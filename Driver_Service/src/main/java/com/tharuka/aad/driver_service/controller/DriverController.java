package com.tharuka.aad.driver_service.controller;

import com.tharuka.aad.driver_service.entity.Driver;
import com.tharuka.aad.driver_service.service.DriverService;
import com.tharuka.aad.driver_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping(value = "/add_driver")
    public Response addDriver(@ModelAttribute Driver driver) {
        driverService.addDriver(driver);
        return new Response("Ok","Successfully Registered..!",null);
    }

    @GetMapping("fetch_driver")
    public Response fetchAllUsers() {
        return new Response("Ok","Done",driverService.fetchAllDriver());
    }

    @GetMapping(value = "/check")
    public Boolean checkDriverExists(@RequestParam Integer driverId, @RequestParam String name) {
        return driverService.checkExistsDriver(driverId,name);
    }
    @PostMapping(value = "update_driver")
    public Response updateDriver(@RequestBody Driver driver){
        driverService.updateDriver(driver);
        return new Response("Ok","Done",null);
    }
    @GetMapping(value = "/search_driver")
    public Response searchDriverById(@RequestParam Integer driverId){
        return new Response("Ok","Done",driverService.searchDriver(driverId));
    }

}
