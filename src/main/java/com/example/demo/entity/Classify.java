package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Entity
@Table(name = "tb_class")
public class Classify {
    @Id
    @Column(name = "classid")
    private Integer classId;
    @Column(name = "classname")
    private String className;
    @Column(name = "classtype")
    private Integer classType;
    @Column(name = "userid")
    private Integer userId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
