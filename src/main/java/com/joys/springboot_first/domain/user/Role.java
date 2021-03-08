package com.joys.springboot_first.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GETST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
