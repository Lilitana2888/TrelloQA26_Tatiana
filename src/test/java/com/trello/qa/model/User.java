package com.trello.qa.model;

public class User {

    String email;
    String pswd;

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPswd(String pswd) {
        this.pswd = pswd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getPswd() {
        return pswd;
    }
}
