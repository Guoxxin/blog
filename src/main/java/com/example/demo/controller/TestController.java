package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:jobs
 * @date:2018/11/27 14:14
 * @description:
 */
@RestController
public class TestController {
    @Autowired
    private  BlogRepository blogRepository;
    @RequestMapping("/getUser")
    public List<Blog> toBlog(){
        List<Blog> all=blogRepository.findAll();
        return all;
    }
}
