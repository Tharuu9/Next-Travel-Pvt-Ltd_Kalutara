package com.tharuka.aad.common_service.service;

import com.tharuka.aad.common_service.dto.TravelPackageDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class TravelPackageService {
    private RestTemplate restTemplate;

    public List<TravelPackageDTO> getAllTravelPackages() {
        return restTemplate.getForObject("http://TRAVEL-SERVICE/packages/get", List.class);
    }
}
