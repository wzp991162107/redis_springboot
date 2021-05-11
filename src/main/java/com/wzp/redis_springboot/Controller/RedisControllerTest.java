package com.wzp.redis_springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redisTest")
public class RedisControllerTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis(){
        //设置值到redis
        redisTemplate.opsForValue().set("name","wzp");
        System.out.println("111111");
        System.out.println("333333333333");
        System.out.println("2222222");

        String name = (String)redisTemplate.opsForValue().get("name");
        return name;
    }
}
