package com.fitness.Service.impl;

import com.fitness.Dto.LoginDTO;
import com.fitness.Dto.UserDTO;
import com.fitness.Entity.User;
import com.fitness.Repo.UserRepo;
import com.fitness.Service.UserService;
import com.fitness.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepo userRepo;

    @Autowired
    public UserImpl(PasswordEncoder passwordEncoder, UserRepo userRepo) {
        this.passwordEncoder = passwordEncoder;
        this.userRepo = userRepo;
    }

    @Override
    public String addUser(UserDTO userDTO) {
        String email = userDTO.getEmail();
        User existingUser = userRepo.findByEmail(email);
        if (existingUser != null) {
            return "Employee with email " + email + " already exists.";
        }

        User user = userDTO.toUserEntity();
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepo.save(user);
        return user.getUsername();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> employee = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}

