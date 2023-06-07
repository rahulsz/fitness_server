package com.fitness.Service;

import com.fitness.Dto.LoginDTO;
import com.fitness.Dto.UserDTO;
import com.fitness.response.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
}
