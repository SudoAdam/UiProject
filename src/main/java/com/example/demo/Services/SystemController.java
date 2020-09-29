package com.example.demo.Services;

public class SystemController {

    AdContainer adContainer;
    UserContainer userContainer;
    UserFactory userFactory;
    LoggedInUser loggedInUser;

    public SystemController() {
            adContainer = new AdContainer();
            userContainer = new UserContainer();
            userFactory = new UserFactory(userContainer);
            loggedInUser = new LoggedInUser(adContainer, userContainer);
    }

    public void login(String password, String name) {
        loggedInUser.setLoggedInUser(password, name);
    }

    public void createUser(String name, String password, int number1, int number2, String road, int number, int zip, String region) {
        userFactory.createUser(name, password, number1, number2, road, number, zip, region);
    }
}
