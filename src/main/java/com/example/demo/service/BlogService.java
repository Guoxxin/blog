package com.example.demo.service;

import com.example.demo.entity.Blog;
import com.example.demo.entity.User;
import com.example.demo.entity.Visitor;
import com.example.demo.repository.BlogRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VisitorRepository visitorRepository;

    public List<Blog> findAll() {
        List<Blog> all = blogRepository.findAll();
        return all;
    }
    public Page<Blog> findByClassNameAndUserId(String className,Integer userId,Integer page, Integer size){
        Pageable pageable = new PageRequest(page, size, Sort.Direction.DESC, "blogDate");
        Page<Blog> all=blogRepository.findByClassNameAndUserId(className,userId,pageable);
        return all;
    }
    public Page<Blog> findByUserId(Integer userId,Integer page, Integer size){
        Pageable pageable = new PageRequest(page, size, Sort.Direction.DESC, "blogDate");
        Page<Blog> all=blogRepository.findByUserId(userId,pageable);
        return all;
    }
//    public Visitor edit(Integer userId) {
//        Optional<Visitor> opVisitorEntity = Optional.ofNullable(visitorRepository.findByUserId(userId));
//        Visitor visitor = opVisitorEntity.get();
//        return visitor;
//    }
    public List<Visitor> findByuserId(Integer userId){
        List<Visitor> all=visitorRepository.findByUserId(userId);
        return all;
    }
    public boolean add(Blog blog) {
        blogRepository.save(blog);
        return true;
    }
    public boolean delete(Integer blogId){
        blogRepository.deleteById(blogId);
        return true;
    }
    public boolean findBlog(Integer blogId){
        List<Blog> findblog=blogRepository.findByBlogId(blogId);
        return findblog.size()>0;
    }


}
