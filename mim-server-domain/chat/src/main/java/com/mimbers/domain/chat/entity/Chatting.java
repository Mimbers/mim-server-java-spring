package com.mimbers.domain.chat.entity;

import com.mimbers.domain.common.entity.*;
import com.mimbers.domain.entity.*;
import com.mimbers.domain.member.entity.*;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chatting extends BaseRemoveEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatting_list_id", nullable = false)
    private ChattingList chattingList;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String imgUrl;
}
