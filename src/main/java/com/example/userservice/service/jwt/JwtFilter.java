package com.example.userservice.service.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class JwtFilter {
    private final JwtProvider jwtProvider;
}
