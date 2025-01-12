package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.RegistrationRequest;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    boolean checkEmail(String email);

    UserDTO registerUser(RegistrationRequest registrationRequest);

    UserDTO getLoginUser();

    UserDTO getUserById(Integer id);

    List<UserDTO> getAllUsers();

    UserDTO createUser(User user);

    UserDTO updateUser(User user);

    void deleteUserById(Integer id);

    UserDTO registerAdmin(RegistrationRequest registrationRequest);

}
