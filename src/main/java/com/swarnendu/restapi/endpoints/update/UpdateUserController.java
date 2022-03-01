package com.swarnendu.restapi.endpoints.update;

import com.swarnendu.restapi.domain.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/{id}")
public class UpdateUserController {
    
    @Autowired
    UpdateUserService service;

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<User> updateUser_whenPutUser(@RequestBody User user, @PathVariable Long id){
        return ResponseEntity.ok().body(service.updateUser(id, user));
    }
}
