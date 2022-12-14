package com.mimbers.domain.member.entity;

import lombok.*;

import javax.persistence.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String detailAddress;
}
