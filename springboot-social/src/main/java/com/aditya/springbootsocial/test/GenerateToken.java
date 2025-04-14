package com.aditya.springbootsocial.test;

import com.aditya.springbootsocial.config.JwtProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class GenerateToken {
    public static void main(String[] args) {
        String email = "test@example.com";
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(email, null);
        String token = JwtProvider.generateToken(auth);
        System.out.println("Generated Token: " + token);
    }
}
