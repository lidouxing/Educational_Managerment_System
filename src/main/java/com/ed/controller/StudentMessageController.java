package com.ed.controller;


import com.ed.config.UserRealm;
import com.ed.pojo.User;
import com.ed.service.StudentMessageService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("studentController")
@Controller
public class StudentMessageController {


  @RequestMapping("personMessage.do")
  public String studentmessage(Model model){
    User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");//得到当前对象的session中的值
    model.addAttribute("user",user);//通过视觉图层将数据放到model中。然后返回或者说跳到指定的页面
      return "student/StudentMessage";//其中的"user"，user对应的是在前端的user，userSno
  }

  //照片上传
    @RequestMapping("/Phtotoup.do")
    public  String phtotoup(@RequestParam("files")String file, HttpServletRequest request){
//      //得到路径
//         String phtotopath=request.getSession().getServletContext().getRealPath("/Phtotoup.do");
//         boolean is=saveFile(file,phtotopath);
//         if (is){
//                request.setAttribute("info","上传成功");
//         }else {
//             request.setAttribute("info","上传失败");
//         }
//      return "jsp/StudentMessage";

      return  null;

    }
}
