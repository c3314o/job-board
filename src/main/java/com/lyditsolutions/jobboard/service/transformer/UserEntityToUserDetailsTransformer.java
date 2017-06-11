package com.lyditsolutions.jobboard.service.transformer;

import com.lyditsolutions.jobboard.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserEntityToUserDetailsTransformer {

    public UserDetails transform(User user) {

        final List<GrantedAuthority> list = new ArrayList<>();
        user.getRoles().stream().forEach(x -> list.add(new SimpleGrantedAuthority(x.getName())));

        return com.lyditsolutions.jobboard.domain.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .accountNonExpired(user.isAccountNonExpired())
                .accountNonLocked(user.isAccountNonLocked())
                .enabled(user.isEnabled())
                .authorities(list)
                .credentialsNonExpired(user.isCredentialsNonExpired())
                .build();
    }

}
