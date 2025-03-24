package com.cinesage.service;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;

import org.springframework.stereotype.Service;

import com.cinesage.model.Ticket;
import com.cinesage.model.User;
import com.cinesage.repository.UserRepository;
import com.cinesage.exception.UserNotFoundException;
import com.cinesage.exception.EmptyTicketsListException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // register user
    public String registerUser(User user) {
        userRepository.save(user);
        return "User registered!";
    }

    // get all users
    public List<User> getUsers() {
        List<User> usersList = userRepository.findAll();
        usersList.sort(Comparator.comparing(User::getUserId));
        if (usersList.isEmpty()) {
            throw new UserNotFoundException("No users found!");
        }
        return usersList;
    }

    // get user by userId
    public User getUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException("Invalid User Id!");
        }
    }

    // search users by username
    public List<User> searchUsers(String searchString) {
        List<User> usersList = userRepository.searchUsers(searchString);
        if (usersList.isEmpty()) {
            throw new UserNotFoundException("No user found!");
        }
        return usersList;
    }

    // // get tickets booked by a user
    // public List<Ticket> getTickets(String userId) {
    // Optional<User> user = userRepository.findById(userId);
    // if (user.isPresent()) {
    // if (user.get().getTicketsList().isEmpty()) {
    // List<Ticket> ticketsList = user.get().getTicketsList();
    // ticketsList.sort(Comparator.comparing(Ticket::getBookingDate));
    // return ticketsList;
    // } else {
    // throw new EmptyTicketsListException("No tickets booked!");
    // }
    // } else {
    // throw new UserNotFoundException("Invalid User Id!");
    // }
    // }

}
