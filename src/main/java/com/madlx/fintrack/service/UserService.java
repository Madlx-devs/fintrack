package com.madlx.fintrack.service;


import com.madlx.fintrack.entity.User;

public interface UserService {

    User createUser(User user);
    boolean deleteUser(Long id);
    User updateUser(long id , User user);
}
