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
@Table(name = "tb_gallery")
public class Gallery {
    @Id
    @Column(name = "galleryid")
    private Integer galleryId;
    @Column(name = "userid")
    private Integer userId;
    @Column(name="desc")
    private String title;
    @Column(name="cover")
    private String cover;
    @Column(name="looknum")
    private String lookNum;
    @Column(name="classname")
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Integer galleryId) {
        this.galleryId = galleryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getLookNum() {
        return lookNum;
    }

    public void setLookNum(String lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
