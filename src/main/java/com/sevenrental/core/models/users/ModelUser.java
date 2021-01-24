package com.sevenrental.core.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModelUser {
    private Long id;
    private String firstName;
    private String lastName;
}
