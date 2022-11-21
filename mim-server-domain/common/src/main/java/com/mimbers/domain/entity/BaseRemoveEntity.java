package com.mimbers.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseRemoveEntity extends BaseTimeEntity {

    private LocalDateTime deletedAt;

}