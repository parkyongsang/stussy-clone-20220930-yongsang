package com.stussy.stussyclone20220930yongsang.controller;


import com.stussy.stussyclone20220930yongsang.dto.RegisterReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class accountController {

    @GetMapping("/account/login")
    public String login() {
        return "account/login";
    }

    @GetMapping("/account/register")
    public String register(RegisterReqDto registerReqDto) {
        System.out.println(registerReqDto);
        return "account/register";
    }


}
