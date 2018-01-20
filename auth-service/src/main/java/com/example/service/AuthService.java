package com.example.service;

import com.example.auth.AuthQuery;
import com.example.servicedto.User;

public interface AuthService {
    User auth(AuthQuery query);
}
