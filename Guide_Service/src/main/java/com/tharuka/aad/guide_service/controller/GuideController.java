package com.tharuka.aad.guide_service.controller;

import com.tharuka.aad.guide_service.entity.Guide;
import com.tharuka.aad.guide_service.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/guide")
public class GuideController {

    @Autowired
    private GuideService guideService;

    @PostMapping(value = "/add_guide")
    public Guide addGuide(@RequestBody Guide guide){
        return guideService.addGuide(guide);
    }

    @PutMapping(value = "/update_guide")
    public Guide updateGuide(@RequestBody Guide guide){
        return guideService.updateGuide(guide);
    }

    @DeleteMapping("/del_guide")
    public void deleteGuide(@RequestParam String guideId){
        guideService.deleteGuide(guideId);
    }
}
