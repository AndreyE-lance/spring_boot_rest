package com.elantsev.netology.spring_boot_rest.model;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<Authorities> permissions;

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
