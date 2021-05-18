package com.elantsev.netology.spring_boot_rest.repository;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import com.elantsev.netology.spring_boot_rest.model.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@Configuration
@ConfigurationProperties(prefix = "users-list")
public class UserRepository {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list;
        for (User u : users) {
            if (u.getUserName().equals(user) && u.getPassword().equals(password)) {
                list = u.getPermissions();
                return list;
            }
        }
        return new ArrayList<>();
    }


}