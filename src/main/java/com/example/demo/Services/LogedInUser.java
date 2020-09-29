package com.example.demo.Services;

public class LogedInUser {
    private User user;

    public void logOut (){
        user = null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
