package com.tharuka.aad.common_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String address;
    private String nicOrPassportNum;
    private String userName;
    private String password;
    private String role;
    private String proPicUrl;
}
