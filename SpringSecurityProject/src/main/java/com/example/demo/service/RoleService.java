package com.example.demo.service;

import com.example.demo.dto.RoleDTO;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    private final RoleMapper roleMapper;

    public RoleDTO getRoleById(Integer id) {
        return roleMapper.roleEntityToDTO(roleRepository.findById(id).orElse(null));
    }

    public RoleDTO findByRole(String role) {
        return roleMapper.roleEntityToDTO(roleRepository.findByRole(role));
    }

    public List<RoleDTO> getAllRoles() {
        return roleMapper.roleListEntityToDTO(roleRepository.findAll());
    }

    public RoleDTO createRole(Role role) {
        return roleMapper.roleEntityToDTO(roleRepository.save(role));
    }

    public RoleDTO updateRole(Role role) {
        return roleMapper.roleEntityToDTO(roleRepository.save(role));
    }

    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }


}
