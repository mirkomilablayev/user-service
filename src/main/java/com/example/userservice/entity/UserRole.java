package com.example.userservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table("user_roles")
public class UserRole implements GrantedAuthority {
    @Id
    @Column("id")
    private Long id;
    @Column("name")
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
