package com.cinefy.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutUsDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String photoURL;
    private String githubAccountInfo;

    //Constructors required for calling the methods.
    public AboutUsDomain() {
    }

    public AboutUsDomain(String name, String photoURL) {
        this.name = name;
        this.photoURL = photoURL;
    }

    public AboutUsDomain(String name, String photoURL, String githubAccountInfo) {
        this.name = name;
        this.photoURL = photoURL;
        this.githubAccountInfo = githubAccountInfo;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getGithubAccountInfo() {
        return githubAccountInfo;
    }

    public void setGithubAccountInfo(String githubAccountInfo) {
        this.githubAccountInfo = githubAccountInfo;
    }
}

