package com.ed.mapper;

import com.ed.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UserMapperTest {


    @Autowired
    private  UserMapper userMapper;
    @Test
    public void userbook() {


        User selectstudentmakeup = userMapper.selectstudentmakeup("20203");

    }


    @Test
    public void testUserbook() {
       User users= userMapper.userbook("20203");
    }
}