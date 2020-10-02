package com.example.demo.Archive;

public class Security {

    private String password;

    public Security(String password) {
        this.password = password;
    }

    public Boolean validate(PasswordAttempt passwordAttempt) {
        if (this.password.equals(passwordAttempt.get())) {
            return true;
        } else {
            return false;
        }
    }

    public void setPassword(PasswordAttempt passwordAttempt, String newPassword) {
        if (this.validate(passwordAttempt)) {
            this.password = newPassword;
        }
    }
}
