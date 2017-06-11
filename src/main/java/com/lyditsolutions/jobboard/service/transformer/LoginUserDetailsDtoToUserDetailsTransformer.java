package com.lyditsolutions.jobboard.service.transformer;

import com.lyditsolutions.jobboard.dto.LoginUserDetailsDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class LoginUserDetailsDtoToUserDetailsTransformer {

    public UserDetails transform(LoginUserDetailsDto loginUserDetailsDto){
        return null;
    }

}
