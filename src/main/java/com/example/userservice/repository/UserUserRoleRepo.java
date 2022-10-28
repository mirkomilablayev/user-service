package com.example.userservice.repository;

import com.example.userservice.entity.UserUserRole;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserUserRoleRepo extends R2dbcRepository<UserUserRole, Long> {
    Mono<List<UserUserRole>> findAllByUserId(Long userId);

}
