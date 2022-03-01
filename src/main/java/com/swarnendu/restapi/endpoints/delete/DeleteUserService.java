package com.swarnendu.restapi.endpoints.delete;

import java.util.Optional;

import com.swarnendu.restapi.domain.user.User;
import com.swarnendu.restapi.domain.user.UserRepository;
import com.swarnendu.restapi.endpoints.detail.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserService {
    
    @Autowired
    UserRepository userRepository;

    public void deleteUser(Long id){
        Optional<User> userOptional = userRepository.findById(id);

        if(!userOptional.isPresent()){
            throw new UserNotFoundException(id);
        }else{
            userRepository.deleteById(id);
        }
    }
}
