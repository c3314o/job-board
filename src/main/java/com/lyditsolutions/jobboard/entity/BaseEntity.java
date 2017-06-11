package com.lyditsolutions.jobboard.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
abstract class BaseEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "version")
    private Long version;
}
