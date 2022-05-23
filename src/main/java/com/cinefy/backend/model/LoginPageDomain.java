package com.cinefy.backend.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginPageDomain {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private String username;
    private String password;

    public LoginPageDomain(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginPageDomain() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
