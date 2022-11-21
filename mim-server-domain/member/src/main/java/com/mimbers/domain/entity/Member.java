package com.mimbers.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseRemoveEntity {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private LocalDate birthDay;

    @Column(nullable = false)
    private String email;

    @Embedded
    private Address address;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Double score;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Mbti mbti;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

}
