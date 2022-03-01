package com.swarnendu.restapi.endpoints.list;

import java.util.List;

import com.swarnendu.restapi.domain.user.User;
import com.swarnendu.restapi.domain.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListUserService {
    
    @Autowired
    UserRepository userRepository;

    public List<User> listAllUsers(){
        return userRepository.findAll();
    }
}
