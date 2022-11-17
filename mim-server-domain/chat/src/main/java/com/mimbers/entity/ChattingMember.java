package com.mimbers.entity;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingMember extends BaseTimeEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatting_list_id", nullable = false)
    private ChattingList chattingList;

    @Column(nullable = false)
    private LocalDate joinTime;

    @Column(nullable = false)
    private LocalDate leaveTime;
}
