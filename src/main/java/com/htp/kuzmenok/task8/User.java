package com.htp.kuzmenok.task8;

public class User {
    private String login;
    private String name;
    private String email;
    private int password;
    private int phone;

    public User () {
    }

    public User(String login, String name, String email, int password, int phone) {
        this.login = login;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
