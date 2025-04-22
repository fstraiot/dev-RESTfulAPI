package me.dio.dev.service;

import me.dio.dev.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
