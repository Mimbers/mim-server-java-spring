package com.mimbers.web.member.dto.response;

import com.mimbers.domain.member.*;
import io.swagger.annotations.*;
import lombok.*;
import lombok.experimental.*;

import java.time.*;

@Getter
@Builder
@Accessors(fluent = true)
@AllArgsConstructor
public class MemberUpdateDto {

    @ApiModelProperty("회원 식별자")
    private Long id;

    @ApiModelProperty("회원 아이디")
    private String username;

    @ApiModelProperty("회원 닉네임")
    private String nickname;

    @ApiModelProperty("회원 생년월일 형식 : yyyyMMdd (?)")
    private LocalDate birthDay;

    @ApiModelProperty("회원 이메일")
    private String email;

    @ApiModelProperty("우편번호")
    private Address address;

    @ApiModelProperty("회원 성별")
    private String gender;

    @ApiModelProperty("회원 점수")
    private Double score;

    @ApiModelProperty("회원 MBTI")
    private Mbti mbti;

    @ApiModelProperty("회원 권한")
    private Role role;

    public static Member toEntity(MemberUpdateDto member) {
        return Member.builder()
                .username(member.username())
                .nickname(member.nickname())
                .birthDay(member.birthDay())
                .email(member.email())
                .address(member.address())
                .gender(member.gender())
                .score(member.score())
                .mbti(member.mbti())
                .role(member.role())
                .build();
    }
}
