package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {

    private final SimpleStringProperty username;
    private final SimpleStringProperty password;
    private final SimpleStringProperty accountcreated;
    private final SimpleStringProperty accountstatus;

    public User(String uname, String pword, String dcreated, String astatus) {

        this.username = new SimpleStringProperty(uname);
        this.password = new SimpleStringProperty(pword);
        this.accountcreated = new SimpleStringProperty(dcreated);
        this.accountstatus = new SimpleStringProperty(astatus);
    }

    /*private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }*/

    public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getAccountcreated() {
        return accountcreated.get();
    }

    public String getAccountstatus() {
        return accountstatus.get();
    }
}
