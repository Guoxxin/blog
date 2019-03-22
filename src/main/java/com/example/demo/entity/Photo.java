package com.example.demo.entity;

import javax.persistence.*;

/**
 * @author:jobs
 * @date:2018/11/29 21:04
 * @description:
 */
@Entity
@Table(name = "tb_photo")
public class Photo {
    @Id
    @Column(name = "photoid")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer photoId;
    @Column(name = "photo")
    private  String photo;
    @Column(name = "photodesc")
    private  String photoDesc;
    @Column(name = "galleryid")
    private Integer galleryId;

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoDesc() {
        return photoDesc;
    }

    public void setPhotoDesc(String photoDesc) {
        this.photoDesc = photoDesc;
    }

    public Integer getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Integer galleryId) {
        this.galleryId = galleryId;
    }
}
