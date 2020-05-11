package com.pfa.revent.service;

import com.pfa.revent.entity.User;

import java.util.List;

public interface UserServiceInterface {
    User save(User user);
    User update(long userId, User user);
    void remove(long userId, User user);
    User getUser(long userId);
    List<User> getAllUsers();
}
