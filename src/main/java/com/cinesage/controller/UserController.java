package com.cinesage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinesage.model.Ticket;
import com.cinesage.model.User;
import com.cinesage.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // check
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    // register user
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // get all registered users
    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // get user by userId
    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    // search users by username
    @GetMapping("/search-user")
    public List<User> searchUsers(@RequestParam String searchString) {
        return userService.searchUsers(searchString);
    }

    // // get all tickets booked by user
    // @GetMapping("/getTickets/{userId}")
    // public List<Ticket> getTickets(@PathVariable String userId) {
    // return userService.getTickets(userId);
    // }

}
