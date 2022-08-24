package com.may.Later.controllers;

import com.may.Later.models.User;
import com.may.Later.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers () {
        return userService.getUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
