package com.example.demo.controller;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
import com.example.demo.service.BlogService;
import com.example.demo.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClassifyController {
    @Autowired
    ClassifyService classifyService;
    @Autowired
    BlogService blogService;


}
