package com.ogjg.daitgym.config.security.jwt.dto;

import com.ogjg.daitgym.config.security.OAuth2JwtUserDetails;
import com.ogjg.daitgym.domain.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
public class JwtUserClaimsDto {

    private String email;
    private Role role;

    public JwtUserClaimsDto(String email, Role role) {
        this.email = email;
        this.role = role;
    }

    public static JwtUserClaimsDto from(OAuth2JwtUserDetails userDetails) {
        return JwtUserClaimsDto.builder()
                .email(userDetails.getEmail())
                .role(userDetails.findAnyFirstRole())
                .build();
    }
}
