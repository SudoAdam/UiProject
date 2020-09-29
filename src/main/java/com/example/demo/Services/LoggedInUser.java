package com.example.demo.Services;

public class LoggedInUser {

    private User loggedInUser;
    private UserContainer userContainer;
    private PasswordAttempt passwordAttempt;

    public LoggedInUser(AdContainer adContainer, UserContainer userContainer) {
        adContainer = adContainer;
        userContainer = userContainer;
    }

    public void logOut (){
        loggedInUser = null;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public Boolean setLoggedInUser(String password, String name) {
        if (userContainer.getUserByName(name) != null) {
            User user = userContainer.getUserByName(name);
            if (user.validatePassword(passwordAttempt)) {
                loggedInUser = user;
                passwordAttempt = new PasswordAttempt(password);
                return true;
            }
        }
        return false;
    }
}
