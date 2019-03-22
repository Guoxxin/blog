package com.example.demo.service;


import com.example.demo.entity.Gallery;
import com.example.demo.entity.Photo;
import com.example.demo.repository.GalleryRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class GalleryService {

    @Autowired
    private GalleryRepostory galleryRepostory;


    public List<Gallery> findAll() {
        List<Gallery> all = galleryRepostory.findAll();
        return all;
    }
    public Page<Gallery> findByUserId(Integer userId,Integer page,Integer size){
        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "userId");
        Page<Gallery> all=galleryRepostory.findByUserId(userId,pageable);
        return all;
    }
}
