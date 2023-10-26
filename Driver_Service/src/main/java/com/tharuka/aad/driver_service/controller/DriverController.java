package com.tharuka.aad.driver_service.controller;

import com.tharuka.aad.driver_service.entity.Driver;
import com.tharuka.aad.driver_service.service.DriverService;
import com.tharuka.aad.driver_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping(value = "/add_driver", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public Response addDriver(Driver driver, @RequestPart ("imgFile")MultipartFile file) {
        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            uploadsDir.mkdir();
            file.transferTo(new File(uploadsDir.getAbsoluteFile() + "/" + file.getOriginalFilename()));
            driver.setDrivingLicenseImg("uploads/" + file.getOriginalFilename());
            return new Response("Ok","Driver Successfully Registered..!",driverService.addDriver(driver));
        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(value = "/fetch_driver")
    public List<Driver> fetchAllUsers() {
//        return new Response("Ok","Done",
                return driverService.fetchAllDriver();
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
