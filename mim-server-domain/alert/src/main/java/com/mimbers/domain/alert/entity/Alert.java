package com.mimbers.domain.alert.entity;

import com.mimbers.domain.common.entity.*;
import com.mimbers.domain.entity.*;
import com.mimbers.domain.member.entity.*;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Alert extends BaseTimeEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Boolean isRead;
}
