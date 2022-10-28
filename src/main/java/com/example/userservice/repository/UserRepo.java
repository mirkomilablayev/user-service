package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories
public interface UserRepo extends R2dbcRepository<User, Long> {

}
