package com.example.userservice.repository;


import com.example.userservice.entity.UserRole;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRoleRepo extends R2dbcRepository<UserRole, Long> {

}
