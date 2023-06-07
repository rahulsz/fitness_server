package com.fitness.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", length = 45)
    private int userId;


    @Column(name="user_name", length = 255)
    private String username;

    @Column(name="email", length = 255)
    private String email;

    @Column(name="password", length = 255)
    private String password;
}
