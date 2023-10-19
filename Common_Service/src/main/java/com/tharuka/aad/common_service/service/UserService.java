package com.tharuka.aad.common_service.service;

import com.tharuka.aad.common_service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    public Boolean checkLogin(String userName, String password){
        return restTemplate.getForObject("http://USER-SERVICE/user/check?userName="+ userName +"&password=" + password, Boolean.class);
    }

    public ResponseEntity<UserDTO> createUser(UserDTO customerDTO){
        return restTemplate.postForEntity("http://USER-SERVICE/user/add",customerDTO, UserDTO.class);
    }
}
