package com.mimbers.domain.member;

import com.mimbers.common.exception.*;
import com.mimbers.domain.member.*;
import com.mimbers.common.status.Error;
import com.mimbers.member.domain.member.dto.*;
import com.mimbers.web.member.dto.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;

@Slf4j
@Service
@RequiredArgsConstructor
class MemberService {

    private final MemberRepository repoMember;

    public MemberDto.Response.MemberInfo getMember(Long id) {

        return MemberDto.Response.MemberInfo.of(repoMember.findById(id).orElseThrow(
                () -> new CustomException(Error.Common.NOT_FOUND)));
    }

    public MemberDto.Response.MemberInfo saveMember(MemberDto.Response.MemberInfo member) {

        if (!duplicateCheck(member.username(), member.nickname())) {

            return MemberDto.Response.MemberInfo.of(repoMember.save(Member.builder()
                    .username(member.username())
                    .nickname(member.nickname())
                    .birthDay(member.birthDay())
                    .email(member.email())
                    .address(member.address())
                    .gender(member.gender())
                    .score(member.score())
                    .mbti(member.mbti())
                    .role(member.role())
                    .build()));
        } else {
            throw new CustomException(Error.Common.ALREADY_EXISTS);
        }
    }

    public boolean duplicateCheck(String userName, String nickName) {

         if (repoMember.existsMemberByUsername(userName)) {
             log.info("중복된 $userName = {}", userName);
             return true;
         } else if (repoMember.existsMemberByNickname(nickName)) {
             log.info("중복된 $nickName = {}", nickName);
             return true;
         }
        return false;
    }

    public MemberDto.Response.MemberInfo updateMember(MemberDto.Response.MemberInfo member) {

        repoMember.findById(member.id()).orElseThrow(
                () -> new CustomException(Error.Common.NOT_FOUND)
        );

        return MemberDto.Response.MemberInfo.of(repoMember.save(Member.builder()
                .username(member.username())
                .nickname(member.nickname())
                .birthDay(member.birthDay())
                .email(member.email())
                .address(member.address())
                .gender(member.gender())
                .score(member.score())
                .mbti(member.mbti())
                .role(member.role())
                .build()));
    }
}
