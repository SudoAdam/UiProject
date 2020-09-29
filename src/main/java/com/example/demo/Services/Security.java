package com.example.demo.Services;

public class Security {

    private String password;

    public Security(String password) {
        this.password = password;
    }

    public Boolean validate(String password) {
        if (password == this.password) {
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(String password, String newPassword) {
        if (this.validate(password)) {
            this.password = newPassword;
        }
    }

}
