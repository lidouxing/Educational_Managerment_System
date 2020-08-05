package com.ed.controller;

import com.ed.pojo.User;
import com.ed.service.UserBookService;
import org.apache.shiro.SecurityUtils;
import org.intellij.lang.annotations.RegExp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("userbookController")
public class UserBookController {

    @Autowired
    private UserBookService userBookService;
    @RequestMapping("userbook.do")
    public String usernbook(Model model){

      User user=userBookService.who();
       model.addAttribute("user",user);
       model.addAttribute("books",user.getBooks());
        return "student/UserBook";
    }
}
