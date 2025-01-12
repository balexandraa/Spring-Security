package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model){
        List<UserDTO> userDtos = userService.getAllUsers();
        model.addAttribute("title", "Users");
        model.addAttribute("users", userDtos);
        return "users";
    }

    @GetMapping("/users/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        if (userService.getUserById(id) != null) {
            userService.deleteUserById(id);
        }
        return "redirect:/users";
    }

}
