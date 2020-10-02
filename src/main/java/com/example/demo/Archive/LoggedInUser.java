package com.example.demo.Archive;

public class LoggedInUser {

    private User loggedInUser;
    private UserContainer userContainer;
    // private PasswordAttempt passwordAttempt;

    public LoggedInUser(AdContainer adContainer, UserContainer userContainer) {
        adContainer = adContainer;
        userContainer = userContainer;
    }

    public void logOut (){
        loggedInUser = null;
    }

    public void editLoggedInUser(String name, int number1, int number2, String road, int number, int zip, String region) {
        loggedInUser.setName(name);
        loggedInUser.setPhone(number1, number2);
        loggedInUser.setAddress(road, number, zip, region);
    }

    public void changePassword(String password, String newPassword) {
        // If password is correct, let password be changed
        if (loggedInUser.validatePassword(password)) {
            loggedInUser.setPassword(newPassword);
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public Boolean setLoggedInUser(String password, String name) {
        // User exists in UserContainer
        if (userContainer.getUserByName(name) != null) {

            // Get user object
            User user = userContainer.getUserByName(name);

            // If password is correct select user -and save password?
            if (user.validatePassword(password)) {
                loggedInUser = user;
                return true;
            }
        }
        return false;
    }

}
