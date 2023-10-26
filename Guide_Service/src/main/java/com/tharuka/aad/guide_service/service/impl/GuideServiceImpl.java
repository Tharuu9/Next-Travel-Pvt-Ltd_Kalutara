package com.tharuka.aad.guide_service.service.impl;

import com.tharuka.aad.guide_service.entity.Guide;
import com.tharuka.aad.guide_service.repository.GuideRepository;
import com.tharuka.aad.guide_service.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideRepository guideRepository;
    @Override
    public Guide addGuide(Guide guide) {
        return guideRepository.save(guide);
    }

    @Override
    public Guide updateGuide(Guide guide) {
        return guideRepository.save(guide);
    }

    @Override
    public void deleteGuide(Integer guideId) {
        guideRepository.deleteById(guideId);
    }

    @Override
    public Guide getAvailableGuide() {
        Guide guide = guideRepository.findFirstAvailableGuide();
        if (guide == null){
            throw new RuntimeException("Oops!There is no available guide at this moment");
        }
        guide.setStatus("Unavailable");
        updateGuide(guide);
        return guide;
    }
}
