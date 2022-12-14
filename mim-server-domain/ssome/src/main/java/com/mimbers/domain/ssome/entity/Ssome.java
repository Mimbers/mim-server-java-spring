package com.mimbers.domain.ssome.entity;

import com.mimbers.domain.common.entity.*;
import com.mimbers.domain.member.entity.*;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ssome extends BaseRemoveEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "my_member_id")
    private Member myMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "your_member_id")
    private Member yourMember;
}
