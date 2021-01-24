package com.sevenrental.core.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Permission {
    USERS_READ("users:read"),
    USERS_WRITE("users:write");

    private final String permission;
}
