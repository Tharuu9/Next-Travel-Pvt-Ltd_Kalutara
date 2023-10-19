package com.tharuka.aad.driver_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Response {
    private String status;
    private String message;
    private Object data;
}
