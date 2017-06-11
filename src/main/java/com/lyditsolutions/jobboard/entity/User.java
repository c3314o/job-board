package com.lyditsolutions.jobboard.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "T_USER")
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Column(name = "account_non_expired")
    private boolean accountNonExpired;

    @Column(name = "account_non_locked")
    private boolean accountNonLocked;

    @Column(name = "credential_non_expired")
    private boolean credentialsNonExpired;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "password")
    private String password;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "last_entry_ts")
    private LocalDateTime lastEntryTs;
}
