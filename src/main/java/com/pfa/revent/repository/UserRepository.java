package com.pfa.revent.repository;

import com.pfa.revent.entity.Editor;
import com.pfa.revent.entity.Moderator;
import com.pfa.revent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //@Query("SELECT u FROM user u WHERE u.user_id = ?1")
    User findByUsername(String username);
}
