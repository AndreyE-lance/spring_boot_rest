package com.elantsev.netology.spring_boot_rest.service;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import com.elantsev.netology.spring_boot_rest.exceptions.InvalidCredentials;
import com.elantsev.netology.spring_boot_rest.exceptions.UnauthorizedUser;
import com.elantsev.netology.spring_boot_rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AuthorizationService {
    @Autowired
    UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) throws InvalidCredentials, UnauthorizedUser{
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}