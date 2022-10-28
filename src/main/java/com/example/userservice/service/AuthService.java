package com.example.userservice.service;


import com.example.userservice.dto.RegisterDto;
import com.example.userservice.entity.User;
import com.example.userservice.entity.UserRole;
import com.example.userservice.repository.UserRepo;
import com.example.userservice.repository.UserRoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepo userRepo;
    private final UserRoleRepo userRoleRepo;


    public Mono<User> register(RegisterDto registerDto) {
        return null;
    }
}
