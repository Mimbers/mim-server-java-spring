package com.mimbers.domain.chat.entity;

import com.mimbers.domain.common.entity.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingList extends BaseRemoveEntity {

    @Column(nullable = false)
    private String lastMessage;
}
