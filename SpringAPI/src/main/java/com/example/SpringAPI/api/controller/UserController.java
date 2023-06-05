package com.example.SpringAPI.api.controller;

import com.example.SpringAPI.api.model.User;
import com.example.SpringAPI.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestParam Integer id) {
        return userService.deleteUser(id);
    }

    @PostMapping("/user")
    public User addUser(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer age, @RequestParam String email) {
        return userService.addUser(id, name, age, email);
    }
}
