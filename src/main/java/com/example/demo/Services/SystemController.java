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

    public Boolean login(String password, String name) {
        if (loggedInUser.setLoggedInUser(password, name)) {
            return true;
        } else {
            return false;
        }
    }

    public void logout() {}

    public void createUser(String name, String password, int number1, int number2, String road, int number, int zip, String region) {
        userFactory.createUser(name, password, number1, number2, road, number, zip, region);
    }

    public void editUser() {}

    public void deleteUser() {}

    public void createAd() {}

    public void deleteAd() {}
}