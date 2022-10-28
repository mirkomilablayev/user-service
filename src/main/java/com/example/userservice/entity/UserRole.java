package com.example.userservice.entity;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table("user_roles")
public class UserRole {
    private Long id;
    private String name;
}
