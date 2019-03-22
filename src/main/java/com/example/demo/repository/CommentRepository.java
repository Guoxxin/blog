package com.example.demo.repository;

import com.example.demo.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    public List<Comment> findByBlogId(Integer blogId);
    public Comment findByReplyUserId(Integer replyUserId);
    public Comment findByUserId(Integer userId);
    public Comment findByComtId(Integer comtId);

}
