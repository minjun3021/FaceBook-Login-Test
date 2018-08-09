package com.example.kmj.facebooklogin;

public class FacebookLoginModel {
    private String username;
    private String id;
    private String gender;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FacebookLoginModel(String username, String id, String gender, String email) {
        this.username = username;

        this.id = id;
        this.gender = gender;
        this.email = email;
    }
}
