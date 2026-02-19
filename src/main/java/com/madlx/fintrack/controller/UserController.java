package com.madlx.fintrack.controller;

import com.madlx.fintrack.entity.User;
import com.madlx.fintrack.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping(path = "/delete")
    public boolean deleteUser(@RequestParam Long id){
        return userService.deleteUser(id);
    }
}
