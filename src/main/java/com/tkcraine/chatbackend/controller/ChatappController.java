package com.tkcraine.chatbackend.controller;

import java.util.Map;

import java.util.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import com.tkcraine.chatbackend.entity.*;

@RestController
public class ChatappController {

    @GetMapping("/")
    public String getUser(@AuthenticationPrincipal OAuth2User principal) {
        Map<String,Object> m = principal.getAttributes();
        Set<String> s = m.keySet();
        for (String string : s) {
            System.out.println(string + "  " + principal.getAttribute(string));
        }

        return principal.getAttribute("login");
    }
}
