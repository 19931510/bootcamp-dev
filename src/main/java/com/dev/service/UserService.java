package com.dev.service;

import com.dev.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
