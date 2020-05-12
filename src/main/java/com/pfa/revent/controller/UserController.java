package com.pfa.revent.controller;

import com.pfa.revent.entity.User;
import com.pfa.revent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService usersService;

    @RequestMapping("/api/users")
    public List<User> getAllUsers()
    {
        return usersService.getAllUsers();
    }

    @GetMapping("/api/users/id")
    public List<User> getUserById(@RequestParam Optional<Long> userId, @RequestParam Optional<String> username)
    {
        return usersService.getUserById(userId);
    }
    @GetMapping("/api/users/username")
    public List<User> getUserByUsername(@RequestParam Optional<String> username )
    {
        return usersService.getUserByUsername(username);
    }
    @GetMapping("/api/users/roles")
    public List<User> getUserByRoles(@RequestParam Optional<String> roles )
    {
        return usersService.getUserByRoles(roles);
    }

    @RequestMapping(method= RequestMethod.POST, value="/api/user")
    public void addUser(@RequestBody User user)
    {
        usersService.save(user);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/api/User/{userId}")
    public void updateUser(@RequestBody User user, @PathVariable long userId)
    {
        usersService.update(userId, user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/api/user/{userId}")
    public void removeUser(@RequestBody User user, @PathVariable long userId)
    {
        usersService.remove(userId, user);
    }
}
