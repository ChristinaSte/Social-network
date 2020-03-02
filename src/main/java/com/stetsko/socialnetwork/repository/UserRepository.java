package com.stetsko.socialnetwork.repository;

import com.stetsko.socialnetwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
