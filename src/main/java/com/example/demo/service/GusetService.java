package com.example.demo.service;

import com.example.demo.entity.Guest;
import com.example.demo.repository.GuestRepository;
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
public class GusetService {
    @Autowired
    private GuestRepository guestRepository;

    public Page<Guest> findByToUserId(Integer toUserId,Integer page, Integer size) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.DESC, "date");
        Page<Guest> all = guestRepository.findByToUserId(toUserId,pageable);
        return all;
    }
    public boolean addGuest(Guest guest){
        guestRepository.save(guest);
        return true;
    }
    public boolean deleteGuest(Integer guestId){
        guestRepository.deleteById(guestId);return false;
    }
}
