package com.example.demo.service;

import com.example.demo.entity.Blog;
import com.example.demo.entity.Comment;
import com.example.demo.repository.BlogRepository;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private BlogRepository blogRepository;

    public List<Comment> findByBlogId( Integer blogId) {
        List<Comment> all = commentRepository.findByBlogId(blogId);
        return all;
    }
    public List<Comment> findAll(){
        List<Comment> all = commentRepository.findAll();
        return all;
    }

    public Blog look(Integer blogId) {
        Optional<Blog> opBlogEntity = blogRepository.findById(blogId);
        Blog blog = opBlogEntity.get();
        return blog;
    }
    public boolean add(Comment comment) {
        commentRepository.save(comment);
        return true;
    }
//    public Integer getReplyUserId(Integer replyUserId){
//        return commentRepository.findByReplyUserId(replyUserId).getReplyUserId();
//    }
    public Integer getComtId(Integer blogId){
        return commentRepository.findByComtId(blogId).getComtId();
    }
//    public Integer getUserId(Integer comtId) {
//        return commentRepository.findByUserId(comtId).getUserId();
//    }
}
