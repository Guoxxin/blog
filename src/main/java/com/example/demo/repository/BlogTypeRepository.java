package com.example.demo.repository;

import com.example.demo.entity.BlogType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:gobs
 * @date:2018/12/9 17:47
 * @description:
 */
public interface BlogTypeRepository extends JpaRepository<BlogType,String> {
    List<BlogType> findByUserId(Integer userId);
}
