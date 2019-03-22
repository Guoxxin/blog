package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    BookQueryService bookQueryService;
    @Autowired
    BookRepository bookRepository;
    @RequestMapping("/findBookNoQuery")
    public String Paging(Model model, @RequestParam(value = "page", defaultValue = "0") Integer page,
                         @RequestParam(value = "size", defaultValue = "4") Integer size){
        Page<Book> datas = bookQueryService.findBookNoCriteria(page, size);
        model.addAttribute("datas", datas);
        System.out.println("当前总记录数"+datas.getTotalElements());
        System.out.println("当前页面的记录数"+datas.getNumberOfElements());
        System.out.println("总页数"+datas.getTotalPages());
        System.out.println("当前页面的List"+datas.getContent());
        System.out.println("当前页码"+(datas.getNumber()+1));
       model.addAttribute("page",page);
       model.addAttribute("size",size);
       model.addAttribute("totalPages",datas.getTotalPages());
       System.out.println(page);
       System.out.println("size"+size);
       return "index1";
    }
}