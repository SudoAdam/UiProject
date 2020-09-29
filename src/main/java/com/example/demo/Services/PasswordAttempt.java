package com.example.demo.Services;

public class PasswordAttempt {

    private String password;

    public PasswordAttempt(String password) {
        this.password = password;
    }

    public String get() {
        return this.password;
    }
}
