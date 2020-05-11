package com.pfa.revent.service;

import com.pfa.revent.entity.User;
import com.pfa.revent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    UserRepository usersRepository;

    public User save(User user)
    {
        return usersRepository.save(user);
    }

    public User update(long userId, User user)
    {
        if(userId!=user.getUserId())
            return null;
        return usersRepository.save(user);
    }

    public void remove(long userId, User user)
    {
        if(userId!=user.getUserId())
            return;
        usersRepository.delete(user);
    }

    public User getUser(long userId)
    {
        return usersRepository.findById(userId).orElse(null);
    }

    // edited
    public List<User> getAllUsers()

    {
        return new ArrayList<>(usersRepository.findAll());
    }
    /*
    public List<Utilisateur> getAllUtilisaters()

    {
        List<User> users = new ArrayList<>();
        UserRepository.findAll().forEach(users::add);
        return users;
    }*/
}
