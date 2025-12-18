package com.dinesh.backend.userservice.controller;

import com.dinesh.backend.userservice.dto.CreateUserRequest;
import com.dinesh.backend.userservice.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> createUser(
            @Valid @RequestBody CreateUserRequest request
    ) {
        String response = userService.createUser(request);
        return ResponseEntity.ok(response);
    }
}
