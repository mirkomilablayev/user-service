package com.example.userservice.repository;

import com.example.userservice.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepo extends R2dbcRepository<User, Long> {

}
