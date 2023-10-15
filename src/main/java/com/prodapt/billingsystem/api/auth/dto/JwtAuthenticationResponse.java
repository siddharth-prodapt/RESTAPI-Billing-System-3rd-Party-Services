package com.prodapt.billingsystem.api.auth.dto;


import lombok.Data;

import java.util.UUID;

@Data
public class JwtAuthenticationResponse {
    private UUID uuid;
    private String email;
    private String name;
    private String token;
    private String refreshToken;

}
