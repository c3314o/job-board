package com.lyditsolutions.jobboard.service.auth;

import com.lyditsolutions.jobboard.entity.repo.UserRepository;
import com.lyditsolutions.jobboard.service.transformer.UserEntityToUserDetailsTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;
    private UserEntityToUserDetailsTransformer userEntityToUserDetailsTransformer;

    @Autowired
    public UserDetailsServiceImpl (UserRepository userRepository,
                                   UserEntityToUserDetailsTransformer userEntityToUserDetailsTransformer){
        this.userRepository = userRepository;
        this.userEntityToUserDetailsTransformer = userEntityToUserDetailsTransformer;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userEntityToUserDetailsTransformer.transform(userRepository.findUserByUsername(username));
    }
}
