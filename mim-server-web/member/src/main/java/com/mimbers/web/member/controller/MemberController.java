package com.mimbers.web.member.controller;

import com.mimbers.common.dto.*;
import com.mimbers.domain.member.*;
import com.mimbers.member.domain.member.dto.*;
import com.mimbers.member.domain.member.service.*;
import com.mimbers.web.member.dto.response.*;
import com.mimbers.web.member.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private static final String ID = "/{id}";

    private final MemberService service;


    /**
     * 회원 정보 조회
     *
     * @param id 회원 식별자
     * @return 회원정보
     */
    @GetMapping(ID)
    public ResponseDto<MemberInfoResponse.Response.MemberInfo> getMember(@PathVariable Long id) {

        return ResponseDto.<MemberInfoResponse>builder()
                .response(service.getMember(id))
                .build();
    }

    /**
     * 회원 정보 저장(회원가입)
     *
     * @param member 회원정보
     * @return 회원정보
     */
    @PostMapping
    public ResponseDto<MemberInfoResponse.Response.MemberInfo> saveMember(@RequestBody MemberInfoResponse.Response.MemberInfo member) {

        return ResponseDto.<MemberInfoResponse.Response.MemberInfo>builder()
                .response(service.saveMember(member))
                .build();
    }

    @PutMapping
    public ResponseDto<MemberInfoResponse.Response.MemberInfo> updateMember(@RequestBody MemberInfoResponse.Response.MemberInfo member) {

        return ResponseDto.<MemberInfoResponse.Response.MemberInfo>builder()
                .response(service.updateMember(member))
                .build();
    }
}
