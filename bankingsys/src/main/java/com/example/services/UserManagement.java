package com.example.services;

import com.example.model.User;
import com.example.repo.UserDB;

public class UserManagement {
    private final UserDB data;

    public UserManagement(UserDB data) {
        this.data = data;
    }

    public void addUser(User newUser) {
        data.addUser(newUser);
    }

    public void removeUser(User toDelete) {
        data.removeUser(toDelete);
    }

    public User searchUser(User user) {
        return data.viewUser(user);
    }

    public void updateUser(User user) {
        data.updateUser(user);
    }
}
