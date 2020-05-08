package com.pfa.revent.controller;

import com.pfa.revent.entity.User;
import com.pfa.revent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{userId}")
    public User getUser(@PathVariable long userId)
    {
        return userService.getUser(userId);
    }

    @RequestMapping("/users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }


    @RequestMapping(method= RequestMethod.POST, value="/user")
    public void addUser(@RequestBody User user)
    {
        userService.save(user);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/User/{userId}")
    public void updateUser(@RequestBody User user, @PathVariable long userId)
    {
        userService.update(userId, user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/user/{userId}")
    public void removeUser(@RequestBody User user, @PathVariable long userId)
    {
        userService.remove(userId, user);
    }
}
