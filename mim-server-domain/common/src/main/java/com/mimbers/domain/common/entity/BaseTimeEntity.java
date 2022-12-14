package com.mimbers.domain.common.entity;

import lombok.*;
import org.springframework.data.annotation.*;

import javax.persistence.*;
import java.time.*;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseTimeEntity extends BaseEntity {


    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
