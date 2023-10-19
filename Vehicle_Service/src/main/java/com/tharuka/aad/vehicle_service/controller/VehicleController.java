package com.tharuka.aad.vehicle_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping(value = "/add_vehicle")
    public Response addVehicle(@RequestBody Vehicle vehicle) {
        return new Response("Ok","Vehicle Added..!",vehicleService.addVehicle(vehicle));
    }
    @PutMapping(value = "/update_vehicle")
    public Response updateVehicle(@RequestBody Vehicle vehicle){
        return new Response("Ok","Vehicle Updated..!",vehicleService.updateVehicle(vehicle));
    }
    @DeleteMapping(value = "/delete_vehicle")
    public Response deleteVehicle(@RequestParam String regNumber){
        vehicleService.deleteVehicle(regNumber);
        return new Response("Ok","Vehicle Deleted..!",null);
    }

    @GetMapping(value = "/category")
    public Response fetchAllVehicleByCategory(@RequestParam String category) {
        return new Response("Ok","", vehicleService.fetchAllVehicleByCategory(category));
    }
}
