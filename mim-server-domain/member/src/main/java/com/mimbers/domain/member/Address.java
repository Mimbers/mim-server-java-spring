package com.mimbers.domain.member;

import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;

@Builder
@Embeddable
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String detailAddress;
}
