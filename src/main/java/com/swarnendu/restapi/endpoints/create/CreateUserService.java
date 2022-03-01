package com.swarnendu.restapi.endpoints.create;

import com.swarnendu.restapi.domain.user.User;
import com.swarnendu.restapi.domain.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {
    
    @Autowired
    UserRepository userRepository;

    public User createNewUser(User user){
        return userRepository.save(user);
    }
}
