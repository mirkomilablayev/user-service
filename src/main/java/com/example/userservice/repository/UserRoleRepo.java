package com.example.userservice.repository;


import com.example.userservice.entity.UserRole;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserRoleRepo extends R2dbcRepository<UserRole, Long> {

}
