package com.tpk.ThymeleafSpringBoot.dto;

import lombok.Builder;

@Builder
public record LoginDto(
        String username,
        String password

) {
}
