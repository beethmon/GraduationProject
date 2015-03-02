package org.sl.shop.service;

import org.sl.shop.mapper.UserMapper;
import org.sl.shop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User Login(User user){
        return userMapper.login(user);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUser(User user){
        return userMapper.getAllUser(user);
    }

    @Transactional
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Transactional
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @Transactional
    public boolean deleteUser(User user) {
        userMapper.deleteUser(user);
        return true;
    }
}
