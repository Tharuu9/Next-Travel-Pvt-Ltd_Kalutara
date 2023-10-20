package com.tharuka.aad.payment_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Response {
    private HttpStatus status;
    private String message;
    private Object data;
}
