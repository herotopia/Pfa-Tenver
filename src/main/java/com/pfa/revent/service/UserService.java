package com.pfa.revent.service;

import com.pfa.revent.entity.User;
import com.pfa.revent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    public User save(User user)
    {
        return userRepository.save(user);
    }

    public User update(long userId, User user)
    {
        if(userId!=user.getUserId())
            return null;
        return userRepository.save(user);
    }

    public void remove(long userId, User user)
    {
        if(userId!=user.getUserId())
            return;
        userRepository.delete(user);
    }

    public User getUser(long userId)
    {
        return userRepository.findById(userId).orElse(null);
    }

    // edited
    public List<User> getAllUsers()

    {
        return new ArrayList<>(userRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<User> users = new ArrayList<>();
        UserRepository.findAll().forEach(users::add);
        return users;
    }*/
}
