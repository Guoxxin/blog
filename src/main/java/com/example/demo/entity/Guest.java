package com.example.demo.entity;

import javax.persistence.*;

/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_guest")
public class Guest {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="guest_idauto",initialValue=3,allocationSize=1)
    @Column(name = "guestid")
    private Integer guestId;
    @Column(name = "userid")
    private Integer userId;
    @Column(name = "gcontent")
    private String gContent;
    @Column(name = "date")
    private String date;
    @Column(name = "touserid")
    private Integer toUserId;
    @Column(name = "reply")
    private String reply;

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getgContent() {
        return gContent;
    }

    public void setgContent(String gContent) {
        this.gContent = gContent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
