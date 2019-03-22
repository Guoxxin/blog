package com.example.demo.repository;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BookRepository extends JpaRepository<Book,Long>
        ,JpaSpecificationExecutor<Book>{
}