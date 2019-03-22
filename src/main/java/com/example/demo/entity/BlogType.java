package com.example.demo.entity;

import javax.persistence.*;

/**
 * @author:jobs
 * @date:2018/12/9 17:40
 * @description:
 */
@Entity
@Table(name = "typecount")
public class BlogType {
    @Id
    @Column(name = "classname")
    private String className;
    @Column(name = "totalcount")
    private String totalCount;
    @Column(name = "userid")
    private Integer userId;
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
