package com.ogjg.daitgym.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER", "일반 회원"),
    ADMIN("ROLE_TRAINER", "트레이너"),
    TRAINER("ROLE_ADMIN", "관리자");


    private final String key;

    private final String title;

    public static Role fromKey(String key) {
        for (Role role : Role.values()) {
            if (key.equals(role.getKey())) {
                return role;
            }
        }
        return Role.USER;
    }
}
