package com.pfa.revent.controller;

import com.pfa.revent.entity.User;
import com.pfa.revent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService usersService;

    @RequestMapping("/user/{userId}")
    public User getUser(@PathVariable long userId)
    {
        return usersService.getUser(userId);
    }

    @RequestMapping("/users")
    public List<User> getAllUsers()
    {
        return usersService.getAllUsers();
    }


    @RequestMapping(method= RequestMethod.POST, value="/user")
    public void addUser(@RequestBody User user)
    {
        usersService.save(user);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/User/{userId}")
    public void updateUser(@RequestBody User user, @PathVariable long userId)
    {
        usersService.update(userId, user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/user/{userId}")
    public void removeUser(@RequestBody User user, @PathVariable long userId)
    {
        usersService.remove(userId, user);
    }
}
