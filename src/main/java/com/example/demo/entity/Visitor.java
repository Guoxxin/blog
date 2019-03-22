package com.example.demo.entity;

import javax.persistence.*;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_visitor")
public class Visitor {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="visitor_idauto",initialValue=3,allocationSize=1)
    @Column(name = "visitorid")
    private Integer visitorId;
    @Column(name = "userid")
    private Integer userId;
    @Column(name = "date")
    private  String date;
    @Column(name = "item")
    private String item;
    @Column(name = "touserid")
    private Integer toUserId;

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }
}
