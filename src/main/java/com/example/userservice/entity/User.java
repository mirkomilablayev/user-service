package com.example.userservice.entity;

import com.example.userservice.repository.UserRoleRepo;
import com.example.userservice.repository.UserUserRoleRepo;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table("users")

public class User implements UserDetails {

    @Id
    @Column("id")
    private Long id;
    @Column("full_name")
    private String fullName;
    @Column("username")
    private String username;
    @Column("password")
    private String password;
    private Set<UserRole> roles = getUserRoles();
    private UserRoleRepo roleRepo;
    private UserUserRoleRepo userUserRoleRepo;
    public User(UserRoleRepo userRoleRepo, UserUserRoleRepo userUserRoleRepo){
        this.roleRepo = userRoleRepo;
        this.userUserRoleRepo = userUserRoleRepo;

    }

    private Set<UserRole> getUserRoles(){
        assert userUserRoleRepo != null;
        return userUserRoleRepo.findAllByUserId(this.id).map(userUserRoles -> {
            Set<UserRole> userRoleSet = new HashSet<>();
            for (UserUserRole userUserRole : userUserRoles) {
                UserRole block = roleRepo.findById(userUserRole.getRoleId()).block();
                userRoleSet.add(block);
            }
            return userRoleSet;
        }).block();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
