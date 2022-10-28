package com.example.userservice.controller;


import com.example.userservice.dto.RegisterDto;
import com.example.userservice.entity.User;
import com.example.userservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    @PostMapping("/register")
    public Mono<User> registerUser(@RequestBody RegisterDto registerDto){
        return authService.register(registerDto);
    }



}
