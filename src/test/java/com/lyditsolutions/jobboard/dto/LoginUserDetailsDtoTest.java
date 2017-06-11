package com.lyditsolutions.jobboard.dto;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class LoginUserDetailsDtoTest {

    private LoginUserDetailsDto loginUserDetails;
    private static final LocalDateTime lastLoginTime = LocalDateTime.of(2015,01,01,12,0,0);


    @Test
    public void testLastLoginTime(){

        loginUserDetails = LoginUserDetailsDto.builder().lastEntryTs(lastLoginTime).build();
        System.out.println(loginUserDetails.getLastEntryTs());
        assertThat(loginUserDetails.getLastEntryTs(), is(equalTo(lastLoginTime)));
    }

}