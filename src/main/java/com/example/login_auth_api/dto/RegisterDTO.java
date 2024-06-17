package com.example.login_auth_api.dto;

public record RegisterDTO(
        String name,
        String email,
        String password
) {
}
