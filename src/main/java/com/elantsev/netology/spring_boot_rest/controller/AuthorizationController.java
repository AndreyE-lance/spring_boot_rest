package com.elantsev.netology.spring_boot_rest.controller;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import com.elantsev.netology.spring_boot_rest.model.User;
import com.elantsev.netology.spring_boot_rest.model.UserAnnotation;
import com.elantsev.netology.spring_boot_rest.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;
@Validated
@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @UserAnnotation User user) {
        System.out.println(user.getUserName()+" "+user.getPassword());
        return service.getAuthorities(user);
    }

    /*@GetMapping("/error")
    public String getError(){
        return "ERROR!";
    }
*/
}
