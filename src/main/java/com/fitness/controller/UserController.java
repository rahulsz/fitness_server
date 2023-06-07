package com.fitness.controller;

import com.fitness.Dto.LoginDTO;
import com.fitness.Dto.UserDTO;
import com.fitness.Service.UserService;
import com.fitness.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/fitness/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String saveUser(@RequestBody UserDTO userDTO) {
        String id = userService.addUser(userDTO);
        return id;
    }


    @PostMapping("/signin")
    public ResponseEntity<?> LoginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}