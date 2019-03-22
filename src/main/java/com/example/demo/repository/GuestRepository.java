package com.example.demo.repository;

import com.example.demo.entity.Guest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
public interface GuestRepository extends JpaRepository<Guest,Integer> {
    Page<Guest> findByToUserId(@Param("toUserId") Integer toUserId, Pageable pageable);
}
