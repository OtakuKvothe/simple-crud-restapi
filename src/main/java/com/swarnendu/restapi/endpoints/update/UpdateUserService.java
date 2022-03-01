package com.swarnendu.restapi.endpoints.update;

import java.util.Optional;

import com.swarnendu.restapi.domain.user.User;
import com.swarnendu.restapi.domain.user.UserRepository;
import com.swarnendu.restapi.endpoints.detail.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserService {
    
    @Autowired
    UserRepository userRepository;

    public User updateUser(Long id, User user){
        Optional<User> userOptional = userRepository.findById(id);

        if(!userOptional.isPresent()){
            throw new UserNotFoundException(id);
        }else{
            userRepository.findById(id);
            return userRepository.save(user);
        }
    }
}
