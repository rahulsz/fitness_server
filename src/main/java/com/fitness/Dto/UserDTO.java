package com.fitness.Dto;

import com.fitness.Entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO
{


    private int userId;

    private String username;

    private String email;

    private String password;


    public User toUserEntity() {
        User user = new User();
        user.setUserId(this.userId);
        user.setUsername(this.username);
        user.setEmail(this.email);
        user.setPassword(this.password);
        return user;
    }
}
