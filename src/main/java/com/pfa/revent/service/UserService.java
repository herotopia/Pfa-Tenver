package com.pfa.revent.service;

import com.pfa.revent.entity.User;
import com.pfa.revent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        /*if(user.getAvatarImage() == null){
            user.setAvatarImage(getUser(userId).getAvatarImage());
        }*/
        return usersRepository.save(user);
    }

    public User update(String username, User user)
    {
        if(!username.toLowerCase().equals(user.getUsername().toLowerCase()))
            return null;
        /*if(user.getAvatarImage() == null){
            user.setAvatarImage(getUser(userId).getAvatarImage());
        }*/
        return usersRepository.save(user);
    }

    public void remove(long userId, User user)
    {
        if(userId!=user.getUserId())
            return;
        usersRepository.delete(user);
    }

    public List<User> getUserById(Optional<Long> userId)
    {
        List<User> users = new ArrayList<User>();
        if (!userId.isPresent()) {
            return new ArrayList<>(usersRepository.findAll());
        }
        else {
            Optional<User> optionalUser = usersRepository.findById(userId.get());
            optionalUser.ifPresent(users::add);
            return users;
        }
    }

    public List<User> getUserByUsername(Optional<String> username)
    {
        return usersRepository.queryFindByUsername(username.orElse("_"));
    }

    public List<User> getUserByRoles(Optional<String> roles)
    {
        return usersRepository.findByRoles(roles.orElse("_"));
    }

    // edited
    public List<User> getAllUsers()
    {
        return new ArrayList<>(usersRepository.findAll());
    }
}
