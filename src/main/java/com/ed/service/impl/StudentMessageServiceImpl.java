package com.ed.service.impl;

import com.ed.mapper.UserMapper;

import com.ed.pojo.User;
import com.ed.service.StudentMessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
class StudentMessageServiceImpl implements StudentMessageService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectstudent(User user) {
        return  userMapper.queryPersonByPersonName(user.getUserSno());
    }
}
