package com.tharuka.aad.travel_service.controller;

import com.tharuka.aad.travel_service.entity.TravelPackage;
import com.tharuka.aad.travel_service.service.TravelPackageService;
import com.tharuka.aad.travel_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/packages")
public class TravelPackageController {
    @Autowired
    private TravelPackageService travelPackageService;

    @PostMapping(value = "/add_package")
    public Response addTravelPackage(@RequestBody TravelPackage travelPackage) {
        return new Response("Ok","Successfully Added..!",travelPackageService.addTravelPackage(travelPackage));
    }

    @PutMapping(value = "/update_package")
    public Response updateTravelPackage(@RequestBody TravelPackage travelPackage) {
        return new Response("Ok","Updated Travel Packages..!",travelPackageService.updateTravelPackage(travelPackage));
    }

    @DeleteMapping(value = "/delete_package")
    public Response deletePackage(@RequestParam Integer id){
        travelPackageService.deletePackage(id);
        return new Response("Ok","Deleted Travel Packages..!",null);
    }

    @GetMapping(value = "/get_packages")
    public Response fetchAllPackages(){
        return new Response("Ok","Done", travelPackageService.fetchAllPackages());
    }

}
