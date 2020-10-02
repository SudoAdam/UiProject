package com.example.demo.Archive;

public class UserFactory {

    private int userCounter;
    private UserContainer userContainer;

    public UserFactory(UserContainer userContainer) {
        this.userCounter++;
        this.userContainer = userContainer;
    }

    public void createUser(String name, String password, int number1, int number2, String road, int number, int zip, String region){
        userCounter++;

        User user = new User(name, ""+userCounter, password, number1, number2, road, number, zip, region);

        userContainer.addUser(user);
    }

}
