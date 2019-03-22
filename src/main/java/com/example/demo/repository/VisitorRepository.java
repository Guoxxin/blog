package com.example.demo.repository;

import com.example.demo.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
public interface VisitorRepository extends JpaRepository<Visitor,Integer> {
    List<Visitor> findByItemAndToUserId(String item,Integer toUserId);
    List<Visitor> findByUserId(Integer userId);
    @Transactional
    List<Visitor> deleteByUserIdAndItemAndToUserId(Integer userId,String item,Integer toUserId);
    //public Visitor findByUserId(Integer userId);

}
