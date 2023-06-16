package com.fitness.Service;

import com.fitness.Dto.LoginDTO;
import com.fitness.Dto.UserDTO;
import com.fitness.response.LoginResponse;

public interface UserService {
    public String addUser(UserDTO userDTO);

    public LoginResponse loginUser(LoginDTO loginDTO);
    public void logout(String email);

}
