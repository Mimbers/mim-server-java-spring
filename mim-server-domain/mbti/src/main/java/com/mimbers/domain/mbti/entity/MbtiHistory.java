package com.mimbers.domain.mbti.entity;

import com.mimbers.domain.common.entity.*;
import com.mimbers.domain.entity.*;
import com.mimbers.domain.member.entity.*;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MbtiHistory extends BaseTimeEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Mbti mbti;
}
