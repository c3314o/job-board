package com.lyditsolutions.jobboard.entity;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "T_ROLE")
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}