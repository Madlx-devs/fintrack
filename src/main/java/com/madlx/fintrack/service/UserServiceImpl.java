package com.madlx.fintrack.service;

import com.madlx.fintrack.entity.User;
import com.madlx.fintrack.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private  final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        Optional<User> u = userRepo.findById(id);
        u.ifPresent(userRepo::delete);
        return true;
    }

    @Override
    public User updateUser(long id, User user) {
        Optional<User> user1 = userRepo.findById(id);
        user1.ifPresent(userRepo::delete);
        userRepo.save(user);
        return user;
    }
}
