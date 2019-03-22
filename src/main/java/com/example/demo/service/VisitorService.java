package com.example.demo.service;

import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
@Service
public class VisitorService {
    @Autowired
    private VisitorRepository visitorRepository;

    public boolean add(Visitor visitor){
        visitorRepository.save(visitor);
        return true;
    }
}
