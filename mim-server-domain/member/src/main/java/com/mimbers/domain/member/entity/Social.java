package com.mimbers.domain.member.entity;

import com.mimbers.domain.common.entity.*;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Social extends BaseRemoveEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String serviceProvider;
}
