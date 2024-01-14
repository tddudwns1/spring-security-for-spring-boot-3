package com.nahwasa.springsecuritybasicsettingforspringboot3.controller;

import com.nahwasa.springsecuritybasicsettingforspringboot3.dto.MemberLoginDto;
import com.nahwasa.springsecuritybasicsettingforspringboot3.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class LoginController {
    private final MemberService memberService;

    @PostMapping("/logout")
    public String logout() {
        return "login";
    }
}
