package org.fai.study.demo_spring_security.payloads.auth;

public class UserLogin {
    private String username;
    private String password;

    public UserLogin() {
    }

    public UserLogin(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
