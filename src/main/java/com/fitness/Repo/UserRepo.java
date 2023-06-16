package com.fitness.Repo;

import com.fitness.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends CrudRepository<User , Integer> {

    Optional<User> findOneByEmailAndPassword(String email, String password);

    User findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.status = :status WHERE u.email = :email")
    void updateStatusByEmail(String email, String status);
}
