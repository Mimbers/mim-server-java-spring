package com.mimbers.domain.member;

import org.springframework.data.repository.*;

interface MemberRepository extends Repository<Member, Long> {

    boolean existsMemberByUsername(String userName);
    boolean existsMemberByNickname(String nickName);
}
