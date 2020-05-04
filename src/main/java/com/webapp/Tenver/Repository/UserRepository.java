package com.webapp.Tenver.Repository;

import com.webapp.Tenver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
