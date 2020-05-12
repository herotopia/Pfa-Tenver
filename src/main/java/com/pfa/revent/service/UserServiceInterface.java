package com.pfa.revent.service;

import com.pfa.revent.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    User save(User user);
    User update(long userId, User user);
    void remove(long userId, User user);
    List<User> getUserById(Optional<Long> userId);
    List<User> getUserByUsername(Optional<String> username);
    List<User> getUserByRoles(Optional<String> roles);
    List<User> getAllUsers();
}
