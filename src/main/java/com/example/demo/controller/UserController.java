package com.example.demo.controller;
import com.example.demo.Utils.MD5Util;
import com.example.demo.Utils.WebSecurityConfig;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }
    //这列的add代表跳转到add.html网页

    //下面的/add和静态网页的action对应
    @RequestMapping("/addUser")
    public String add(String username,String nickname,String password,String pwd,Map<String,String> map){
        User user=new User();
        user.setUserName(username);
        user.setPassWord(MD5Util.encode(password));
        user.setNickName(nickname);
        boolean findUser=userService.verifyLogin(user);
        if (pwd.equals(password)){
            if (!findUser){
                userService.add(user);
                return "login";
            }else{
                map.put("message","<script>layer.msg('用户名已存在', {icon: 5});</script>");
                return "addUser";
            }
        }else {
            map.put("message","<script>layer.msg('两次密码需一致', {icon: 5});</script>");
            return "addUser";
        }
    }

    @RequestMapping("/")
    public String toLogin(){
        return "redirect:/index";
    }
    @RequestMapping("/deleteUser/{userId}")
    public String delete(@PathVariable Integer userId){
        userService.delete(userId);
        return "redirect:/list";
    }

    @RequestMapping("/edit/{userId}")
    public String edit(@PathVariable Integer userId, Model model){
        User editUser = userService.edit(userId);
        model.addAttribute("user",editUser);
        return "edit";
    }
    @RequestMapping("/visit/{userId}")
    public String visitUser(@PathVariable Integer userId, Model model, HttpSession session,Map<String,String> map){
        Integer loginId=(Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("loginId",loginId);
        model.addAttribute("userId",userId);
        map.put("name", userService.getNickName(userId));
        return "perindex";
    }
    @GetMapping("/index")
    public String index(Model model,HttpSession session,Map<String, String> map) {
        Integer UserId = (Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        map.put("name", userService.getNickName(UserId));
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/loginVerify")
    public String loginVerify(String username, String password, HttpSession session, HttpServletRequest httpServletRequest, Map<String, Object> map, Model model){
//        String rightCode = (String) httpServletRequest.getSession().getAttribute("rightCode");
//        String tryCode = httpServletRequest.getParameter("tryCode");
//        System.out.println("rightCode:"+rightCode+" ———— tryCode:"+tryCode);
//        if (!rightCode.equals(tryCode)) {
//            return "400";
//        }
        User user = new User();
        user.setUserName(username);
        user.setPassWord(MD5Util.encode(password));
        System.out.print("**********"+ MD5Util.encode(password)+"**********");
//        user.setPassWord(password);

        boolean verify = userService.verifyLogin(user);
        if (verify) {

            session.setAttribute(WebSecurityConfig.SESSION_KEY, userService.getUserId(username));
            //session.getAttribute(WebSecurityConfig.SESSION_KEY);
            model.addAttribute("name", userService.getNickName(userService.getUserId(username)));
            System.out.println("**********"+userService.getUserId(username)+"**********");
            System.out.println("**********"+username+"**********");
            System.out.println("**********"+session.getAttribute(WebSecurityConfig.SESSION_KEY)+"**********");
            return "index";
        } else {
            map.put("message", "<script>layer.msg('出错了', {icon: 5});</script>");
            System.out.print("********************");
//            http://layer.layui.com/
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }

}
