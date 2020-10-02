package com.example.demo.Archive;

import java.util.ArrayList;

public class UserContainer {

    private ArrayList<User> userList;

    public UserContainer() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public ArrayList<User> getAllUsers() {
        return this.userList;
    }

    public User getUserByID(String userID) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserID().equals(userID)) {
                return userList.get(i);
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) {
                return userList.get(i);
            }
        }
        return null;
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

}
