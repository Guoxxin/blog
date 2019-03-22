package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean add(User user) {
        userRepository.save(user);
        return true;
    }

    public boolean delete(Integer userId) {
        userRepository.deleteById(userId);
        return false;
    }

    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        return all;
    }

    public User edit(Integer userId) {
        Optional<User> opUserEntity = userRepository.findById(userId);
        User user = opUserEntity.get();
        return user;
    }
    public User visit(Integer userId) {
        Optional<User> opUserEntity = userRepository.findById(userId);
        User user = opUserEntity.get();
        return user;
    }
public boolean verifyLogin(User user){
    List<User> userList = userRepository.findByUserNameAndPassWord(user.getUserName(), user.getPassWord());
    return userList.size()>0;
}
    public Integer getUserId(String username) {
        return userRepository.findByUserName(username).getUserId();
    }
    public String getNickName(Integer userId){
        return userRepository.findByUserId(userId).getNickName();
    }
}