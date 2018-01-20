package com.example.service.impl;

import com.example.auth.AuthQuery;
import com.example.service.AuthService;
import com.example.servicedto.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    @Override
    public User auth(AuthQuery query) {
        return null;
    }
}
