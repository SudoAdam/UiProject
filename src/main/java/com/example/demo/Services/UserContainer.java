package com.example.demo.Services;

import java.util.ArrayList;

public class UserContainer {

    private ArrayList<User> userList;

    public UserContainer() {}

    public ArrayList<User> getAllUsers() {
        return this.userList;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).equals(name)) {
                return userList.get(i);
            }
        }
        return null;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

}
