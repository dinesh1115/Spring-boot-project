package com.dinesh.backend.userservice.Service;

import com.dinesh.backend.userservice.dto.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String createUser(CreateUserRequest request) {
        // business logic goes here
        return "User " + request.getName() + " created successfully";
    }
}
