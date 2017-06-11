package com.lyditsolutions.jobboard.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Value(staticConstructor = "of")
@Getter
@AllArgsConstructor
@Builder
public class LoginUserDetailsDto {

    @NotNull
    private String userName;

    @Email
    private String emailAddress;

    @NotNull
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastEntryTs;

}
