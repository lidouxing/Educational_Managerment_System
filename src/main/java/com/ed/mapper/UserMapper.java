package com.ed.mapper;

import com.ed.pojo.Achievement;
import com.ed.pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User queryPersonByPersonName(String userSno);

    String selectRole(String userSno);

    User selectstudentmakeup(String userSno);

    User userbook(String userSno);
}