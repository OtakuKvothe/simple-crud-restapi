package com.swarnendu.restapi.endpoints.detail;

import java.util.Optional;

import com.swarnendu.restapi.domain.user.User;
import com.swarnendu.restapi.domain.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailUserService {
    
    @Autowired
    UserRepository userRepository;

    public Optional<User> listUser(Long id){
        Optional<User> user = userRepository.findById(id);

        if(!user.isPresent()){
            throw new UserNotFoundException(id);
        }else{
            return userRepository.findById(id);
        }
    }
}
