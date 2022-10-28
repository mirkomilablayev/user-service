package com.example.userservice.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table("users")
public class User {
    @Column("fullName")
    private String fullName;
    @Column("username")
    private String username;
    @Column("password")
    private String password;
    @Column("roleIds")
    private Set<Long> roleIds;
}
