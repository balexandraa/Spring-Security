package com.example.demo.mapper;

import com.example.demo.dto.RoleDTO;
import com.example.demo.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleMapper {

    public RoleDTO roleEntityToDTO(Role role) {
        return RoleDTO.builder()
                .role(role.getRole())
                .build();
    }

    public List<RoleDTO> roleListEntityToDTO(List<Role> roles) {
        return roles.stream()
                .map(role -> roleEntityToDTO(role))
                .toList();
    }

    public Role roleDTOToEntity(RoleDTO roleDTO) {
        return Role.builder()
                .role(roleDTO.role())
                .build();
    }

    public List<Role> roleListDTOToEntity(List<RoleDTO> roleDTOS) {
        return roleDTOS.stream()
                .map(roleDTO -> roleDTOToEntity(roleDTO))
                .toList();
    }

}
