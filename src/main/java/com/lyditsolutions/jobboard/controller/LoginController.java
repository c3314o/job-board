package com.lyditsolutions.jobboard.controller;

import com.lyditsolutions.jobboard.dto.LoginUserDetailsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ResponseEntity<?> loginSuccessful(String username) {

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
