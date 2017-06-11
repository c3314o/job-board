package com.lyditsolutions.jobboard.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@Builder
public class LoginUserDetailsDto {

    @NotNull
    private String userName;

    @NotNull
    private String password;

}
