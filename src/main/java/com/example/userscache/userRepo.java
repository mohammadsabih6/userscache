package com.example.userscache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
@Component
public class userRepo implements Iuser{
    @Cacheable("users")
    @Override
    public Users getByname(String name) {
        return new Users("CND "+name);
        
    }
}