package com.example.demo.repository;

import com.example.demo.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:gobs
 * @date:2018/11/29 22:19
 * @description:
 */
public interface PhotoRepository extends JpaRepository<Photo,Integer> {
     List<Photo> findByGalleryId(Integer galleryId);
}
