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
}
