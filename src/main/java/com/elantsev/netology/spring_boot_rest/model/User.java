package com.elantsev.netology.spring_boot_rest.model;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<Authorities> permissions;

    @Bean
    public User getUser(String userName, String password, List<Authorities> permissions) {
        this.userName = userName;
        this.password = password;
        this.permissions = permissions;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getPermissions() {
        return permissions;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPermissions(List<Authorities> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
