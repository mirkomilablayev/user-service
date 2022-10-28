package com.example.userservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table("user_user_roles")
public class UserUserRole {
    @Id
    @Column("id")
    private Long id;
    @Column("user_id")
    private Long userId;
    @Column("role_id")
    private Long roleId;
}
