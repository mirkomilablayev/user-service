package com.example.userservice.service.jwt;

import com.example.userservice.entity.User;
import com.fasterxml.jackson.core.JsonParseException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class JwtProvider {
    private static final long expireToken = 1000 * 60 * 60;
    private static final String key = "q1w2e4w54e5w4d5454f5r4g5f4g5f4h5fh4";


    public String generateToken(User user) {
        Claims claims = Jwts.claims().setSubject(user.getUsername());
        claims.put("user_roles", user.getRoles());

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expireToken))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
    }


    public String getUsername(String token){
        return Jwts
                .parser()
                .setSigningKey(key)
                .parseClaimsJwt(token)
                .getBody()
                .getSubject();
    }

}
