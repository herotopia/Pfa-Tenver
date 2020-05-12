package com.pfa.revent.repository;

import com.pfa.revent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.username LIKE %?1%")
    List<User> queryFindByUsername(String username);
    Optional<User> findByUsername(String username);
    @Query("SELECT u FROM User u WHERE u.roles LIKE %?1%")
    List<User> findByRoles(String roles);
    Optional<User> findByEmail(String username);
}
