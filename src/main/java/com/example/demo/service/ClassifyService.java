package com.example.demo.service;

import com.example.demo.entity.Classify;
import com.example.demo.repository.ClassifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class ClassifyService {
    @Autowired
    private ClassifyRepository classifyRepository;
    public List<Classify> findAll() {
        List<Classify> all = classifyRepository.findAll();
        return all;
    }
}
