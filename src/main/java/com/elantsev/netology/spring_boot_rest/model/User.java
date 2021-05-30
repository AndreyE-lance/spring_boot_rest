package com.elantsev.netology.spring_boot_rest.model;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Validated
public class User {
    @NotBlank(message = "User field must be filled")
    private String userName;

    @NotBlank(message = "Password field must be filled")
    private String password;
    private List<Authorities> permissions;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
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
