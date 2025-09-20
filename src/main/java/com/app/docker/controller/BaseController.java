package com.app.docker.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor

@RestController
public class BaseController {

    private final  RedisTemplate<String, Object> redisTemplate;

    @GetMapping("")
    public String index() {
        redisTemplate.opsForValue().set("abc", "def");

        return "Hello World";
    }

}
