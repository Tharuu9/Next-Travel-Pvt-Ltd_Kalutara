package com.tharuka.aad.guide_service.service;

import com.tharuka.aad.guide_service.entity.Guide;

public interface GuideService {

    Guide addGuide(Guide guide);
    Guide updateGuide(Guide guide);
    void deleteGuide(Integer guideId);

    Guide getAvailableGuide();
}
