package com.example.demo.controller;

import com.example.demo.Utils.WebSecurityConfig;
import com.example.demo.entity.Blog;
import com.example.demo.entity.Comment;
import com.example.demo.service.BlogService;
import com.example.demo.service.CommentService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Controller
public class CommentController {

    @Autowired
    CommentService commentService;
    @Autowired
    BlogService blogService;
    @Autowired
    UserService userService;
    /**
     * @creator: jobs
     * @date: 2018/12/2 21:17
     * @param: [model]
     * @return: java.lang.String
     * @description:显示评论
     */
    @RequestMapping("comment")
    public String hello(Model model) {
        List<Comment> all = commentService.findAll();
        model.addAttribute("all", all);
        return "comment";

    }
    /**
     * @creator: jobs
     * @date: 2018/12/2 21:18
     * @param: [blogId, model, map, userId]
     * @return: java.lang.String
     * @description:阅读日志详情
     */
    @RequestMapping("/read/{blogId}")
    public String look(@PathVariable Integer blogId, Model model,HttpSession session) {
        Integer UserId = (Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd/HH:mm");//设置日期格式
        model.addAttribute("userId",UserId);
        model.addAttribute("date",df.format(new Date()));
        model.addAttribute("blogId",blogId);
        List<Comment> all = commentService.findByBlogId(blogId);
        model.addAttribute("all", all);
        boolean findBlog=blogService.findBlog(blogId);
        if(findBlog){
            Blog lookBlog = commentService.look(blogId);
            model.addAttribute("blog", lookBlog);
            return "info";
        }else{
            return "404";
        }
    }
    /**
     * @creator: jobs
     * @date: 2018/12/2 21:18
     * @param: [comment]
     * @return: java.lang.String
     * @description:添加评论
     */
    @RequestMapping("/addComment")
    public String add(Comment comment) {
        commentService.add(comment);
        return "redirect:/blog";

    }
}
