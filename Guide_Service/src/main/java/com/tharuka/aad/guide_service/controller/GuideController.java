package com.tharuka.aad.guide_service.controller;

import com.tharuka.aad.guide_service.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/guide")
public class GuideController {

    @Autowired
    private GuideService guideService;
}
