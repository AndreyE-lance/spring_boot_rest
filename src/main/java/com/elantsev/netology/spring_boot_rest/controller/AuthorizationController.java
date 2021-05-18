package com.elantsev.netology.spring_boot_rest.controller;

import com.elantsev.netology.spring_boot_rest.enums.Authorities;
import com.elantsev.netology.spring_boot_rest.service.AuthorizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    /*@GetMapping("/error")
    public String getError(){
        return "ERROR!";
    }
*/
}
