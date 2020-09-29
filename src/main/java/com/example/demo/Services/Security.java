package com.example.demo.Services;

public class Security {

    private String password;

    public Security(String password) {
        this.password = password;
    }

    public Boolean validate(Password password) {
        if (this.password.equals(password.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(Password password, String newPassword) {
        if (this.validate(password)) {
            this.password = newPassword;
        }
    }
}
