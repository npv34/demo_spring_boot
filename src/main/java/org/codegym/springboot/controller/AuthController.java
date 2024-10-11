package org.codegym.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();

    @RequestMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

}
