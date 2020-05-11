package com.pfa.revent.security.repository;

import com.pfa.revent.security.entity.UserS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserSRepository extends JpaRepository<UserS,Integer> {
    Optional<UserS> findByUsername(String username);
}
