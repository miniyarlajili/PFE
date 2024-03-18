package com.hotelApplication.Repository;

import com.hotelApplication.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository

public interface userRepository extends JpaRepository<user, Long>{




    /*Optional<user> findByEmailAndPassword(String email, String password);
    user findByEmail(String email);*/
    Optional<user> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
