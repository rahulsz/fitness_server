package com.fitness.Repo;

import com.fitness.Entity.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends CrudRepository<User , Integer> {

    Optional<User> findOneByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}
