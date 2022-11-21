package com.mimbers.entity;

import com.mimbers.domain.entity.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingList extends BaseRemoveEntity {

    @Column(nullable = false)
    private String lastMessage;
}
