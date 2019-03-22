package com.example.demo.repository;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
import com.example.demo.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

//继承JpaRepositoryspring data jpa 默认预先生成了一些基本的CURD的方法，例如：增、删、改等等
//User为实体类，Integer为主键类型
public interface BlogRepository extends JpaRepository<Blog, Integer>, JpaSpecificationExecutor<Blog> {
    Page<Blog> findByUserId(@Param("userId") Integer userId, Pageable pageable);
    Page<Blog> findByClassNameAndUserId(@Param("className") String className,@Param("userId")Integer userId,Pageable pageable);
    List<Blog> findByBlogId(Integer blogId);
    Page<Blog> findByBlogId(@Param("blogId") Integer blogId, Pageable pageable);



}