package com.gelecex.upwork.rsstracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author obetron
 * @date 31.10.2023 - 06:28
 */
@Getter
@Setter
@MappedSuperclass //to indicate that this class is not an entity itself, but its fields should be included in the mapping of entities that extend it.
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    protected LocalDateTime createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    protected LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
