package com.swarnendu.restapi.endpoints.detail;

import java.util.Optional;

import com.swarnendu.restapi.domain.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{id}")
public class DetailUserController {
    
    @Autowired
    DetailUserService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<User>> listUser_whenGetUser(@PathVariable Long id){
        return ResponseEntity.ok().body(service.listUser(id));
    }
}
