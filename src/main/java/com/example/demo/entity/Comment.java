package com.example.demo.entity;

import javax.persistence.*;

/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="comment_idauto",initialValue=30,allocationSize=1)
    @Column(name = "comtid")
    private Integer comtId;
    @Column(name = "blogid")
    private Integer blogId;
    @Column(name = "comtdate")
    private String comtDate ;
    @Column(name = "comtcontent")
    private String comtContent ;
    @Column(name = "userid")
    private Integer userId;
    @Column(name = "replyuserid")
    private Integer replyUserId;

    public Integer getComtId() {
        return comtId;
    }

    public void setComtId(Integer comtId) {
        this.comtId = comtId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }



    public String getComtDate() {
        return comtDate;
    }

    public void setComtDate(String comtDate) {
        this.comtDate = comtDate;
    }

    public String getComtContent() {
        return comtContent;
    }

    public void setComtContent(String comtContent) {
        this.comtContent = comtContent;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }
}
