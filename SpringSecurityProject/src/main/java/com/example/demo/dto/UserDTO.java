package com.example.demo.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record UserDTO (
        Integer id,
        String username,
        List<RoleDTO> roles,
        String firstName,
        String lastName,
        String emailAddress
    ) {}
