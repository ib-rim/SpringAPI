package com.example.SpringAPI.service;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Ibrahim", 21, "ib.bashir@hotmail.com");
        User user2 = new User(2, "Atikah", 22, "a@hotmail.com");

        userList.addAll(Arrays.asList(user1, user2));
    }
    public User getUser(Integer id) {
        for (User user: userList) {
            if(id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return userList;
    }

    public User deleteUser(Integer id) {
        for (User user: userList) {
            if(id == user.getId()) {
                userList.remove(user);
                return user;
            }
        }
        return null;
    }

    public User addUser(Integer id, String name, Integer age, String email) {
        User user = new User(id, name, age, email);
        userList.add(user);
        return user;
    }

}
