package com.lyditsolutions.jobboard.service.transformer;

import com.lyditsolutions.jobboard.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsToUserEntityTransformer {

    public User transform(UserDetails userDetails){
        return null;
    }

}
