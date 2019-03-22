package com.example.demo.entity;

import javax.persistence.*;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_blog")
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="blog_idauto",initialValue=30,allocationSize=1)
    @Column(name = "blogid")
    private Integer blogId;
    @Column(name = "userid")
    private Integer userId;
    @Column(name = "blogtitle")
    private String blogTitle;
    @Column(name = "blogcontent")
    private String blogContent;
    @Column(name = "blogdate")
    private String blogDate;
    @Column(name = "blogimg")
    private String blogImg;
    @Column(name = "classname")
    private String className;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate;
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg;
    }

    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
