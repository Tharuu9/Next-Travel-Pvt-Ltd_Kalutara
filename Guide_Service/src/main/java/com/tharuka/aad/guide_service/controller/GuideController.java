package com.tharuka.aad.guide_service.controller;

import com.tharuka.aad.guide_service.entity.Guide;
import com.tharuka.aad.guide_service.service.GuideService;
import com.tharuka.aad.guide_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/guide")
public class GuideController {

    @Autowired
    private GuideService guideService;

//    @PostMapping(value = "/add_guide")
//    public Response addGuide(@RequestBody Guide guide){
//        return new Response("OK","Guide Added..!",guideService.addGuide(guide));
//    }

   @PostMapping(value = "/save_guide")
    public void saveGuide(@ModelAttribute Guide guide){
        guideService.addGuide(guide);
    }

    @PutMapping(value = "/update_guide")
    public Response updateGuide(@RequestBody Guide guide){
        return new Response("OK","Guide Updated..!",guideService.updateGuide(guide));
    }

    @DeleteMapping("/del_guide")
    public Response deleteGuide(@RequestParam Integer guideId){
        guideService.deleteGuide(guideId);
        return new Response("OK","Guide Deleted..!",null);
    }

    @GetMapping(value = "/available")
    public Response getAvailableGuide(){
        return new Response("OK","",guideService.getAvailableGuide());
    }

}
