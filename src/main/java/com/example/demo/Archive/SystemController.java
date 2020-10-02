package com.example.demo.Archive;

import java.util.ArrayList;

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
        return loggedInUser.setLoggedInUser(password, name);
    }

    public void logout() {}

    public void createUser(String name, String password, int number1, int number2, String road, int number, int zip, String region) {
        userFactory.createUser(name, password, number1, number2, road, number, zip, region);
    }

    public void editUser(String name, int number1, int number2, String road, int number, int zip, String region) {
        loggedInUser.editLoggedInUser(name, number1, number2, road, number, zip, region);
    }

    public void createAd() {}

    public void deleteAd() {}

    public String showUser() {
        ArrayList<User> users = userContainer.getAllUsers();

        String result = "";
        for (User user: users) {
            result += user.toString() + "<br>";
        }

        return result;
    }
}