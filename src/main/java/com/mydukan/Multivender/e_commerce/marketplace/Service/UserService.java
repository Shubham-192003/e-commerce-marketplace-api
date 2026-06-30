package com.mydukan.Multivender.e_commerce.marketplace.Service;

import com.mydukan.Multivender.e_commerce.marketplace.Entity.User;
import com.mydukan.Multivender.e_commerce.marketplace.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void saveUser(User user) {
        userRepo.save(user);
    }
    public Iterable<User> findAll() {
        return userRepo.findAll();
    }
    public User findOne(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}