package com.mycompany.myproject.verticles.reverseproxy.model;

/**
 * @author hpark
 */
public class User {

    private String userId;
    private String password;
    private String authenticationToken;

    public User() {
        this(null, null, null);
    }

    public User(String userId, String password, String authenticationToken) {
        this.userId = userId;
        this.password = password;
        this.authenticationToken = authenticationToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
}
