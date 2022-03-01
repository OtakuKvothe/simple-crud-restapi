package com.swarnendu.restapi.endpoints.create;

import java.net.URI;

import com.swarnendu.restapi.domain.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class CreateUserController {
    
    @Autowired
    CreateUserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createNewUser_whenPostUser(@RequestBody User user){
        User createdUser = service.createNewUser(user);

        URI uri = ServletUriComponentsBuilder
        .fromCurrentRequest().path("/{id}")
        .buildAndExpand(createdUser.getId())
        .toUri();

        return ResponseEntity.created(uri).body(createdUser);
    }
}
