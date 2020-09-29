package com.example.demo.Services;

public class SystemController {

    AdContainer adContainer;
    UserContainer userContainer;
    LoggedInUser loggedInUser;

    public SystemController() {
        adContainer = new AdContainer();
        userContainer = new UserContainer();
        loggedInUser = new LoggedInUser(adContainer, userContainer);
    }

    public void login(String password, String name) {
        loggedInUser.setLoggedInUser(password, name);
    }

}
