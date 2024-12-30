package com.example.demo.mapper;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final RoleMapper roleMapper;

    public UserDTO userEntityToDTO(User user) {
        return UserDTO.builder()
                .username(user.getUsername())
                .roles(roleMapper.roleListEntityToDTO(user.getRoles()))
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .build();
    }

    public List<UserDTO> userListEntityToDTO(List<User> users) {
        return users.stream()
                .map(user -> userEntityToDTO(user))
                .toList();
    }

    public User userDTOToEntity(UserDTO userDTO, String password) {
        return User.builder()
                .username(userDTO.username())
                .password(password)
                .roles(roleMapper.roleListDTOToEntity(userDTO.roles()))
                .firstName(userDTO.firstName())
                .lastName(userDTO.lastName())
                .emailAddress(userDTO.emailAddress())
                .build();
    }

    public List<User> userListDTOToEntity(List<UserDTO> userDTOS, String password) {
        return userDTOS.stream()
                .map(userDTO -> userDTOToEntity(userDTO, password))
                .toList();
    }

}
