package com.mimbers.domain.member;

import com.mimbers.domain.common.entity.*;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;
import java.time.*;

@Entity
@Builder
@Access(AccessType.FIELD) //JPA 전용
@Accessors(fluent = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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

    public MemberResponse toResponse() {
        return new MemberResponse(
                this.username,
                this.nickname,
                this.birthDay,
                this.email,
                this.address,
                this.gender,
                this.score,
                this.mbti,
                this.role);
    }
}
