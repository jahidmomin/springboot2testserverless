package com.test2.demo;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class JwtValidationFilter extends HttpFilter {
    private final String secretKey = "abc"; // Replace with your actual secret key

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String authHeader = request.getHeader("Authorization");
        log.info("Header Authorization");
        log.info(authHeader);
        chain.doFilter(request, response);
    }
}
