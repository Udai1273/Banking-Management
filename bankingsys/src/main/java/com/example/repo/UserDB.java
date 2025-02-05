package com.example.repo;

import com.example.model.User;
import java.util.List;

public class UserDB {
    List<User> users;

    public User viewUser(User user) {
        for (User it : users) {
            if (it.getId().equals(user.getId())) {
                return it;
            }
        }
        return null;
    }

    public boolean addUser(User newUser) {
        if (viewUser(newUser) == null) return users.add(newUser);
        else return false;
    }

    public boolean removeUser(User user) {
        if (viewUser(user) == null) return false;

        for (User it : users) {
            if (it.getId().equals(user.getId())) {
                it.setIsDeleted(true);
            }
        }

        return true;
    }

    public boolean updateUser(User user) {
        users.remove(viewUser(user));
        return addUser(user);
    }
}
