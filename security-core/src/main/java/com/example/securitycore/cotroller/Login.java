package com.example.securitycore.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: zhangDongkun
 * @date: 2019-09-22 21:34
 **/
@RestController
@RequestMapping("/core")
public class Login {
    @GetMapping("/login")
    public String login() {
        return  "success";
    }

}
