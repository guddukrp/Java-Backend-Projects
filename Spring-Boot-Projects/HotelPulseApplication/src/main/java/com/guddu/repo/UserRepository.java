package com.guddu.repo;

import com.guddu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByEmail(String mail);

    Optional<User> findByEmail(String email);
}
