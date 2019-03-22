package com.example.demo.controller;

import com.example.demo.Utils.WebSecurityConfig;
import com.example.demo.entity.Guest;
import com.example.demo.service.GusetService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Table;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Controller
public class GuestController {
    @Autowired
    GusetService gusetService;
    @Autowired
    UserService userService;
    @RequestMapping("/guest")
    public String liuyan(Model model,HttpSession session,@RequestParam(value = "page", defaultValue = "0") Integer page,
                         @RequestParam(value = "size", defaultValue = "5") Integer size){
        Integer toUserId=(Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("name",userService.getNickName(toUserId));
        Page<Guest> all=gusetService.findByToUserId(toUserId,page,size);
        model.addAttribute("all",all);
        model.addAttribute("userId",toUserId);
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPages",all.getTotalPages());
        SimpleDateFormat dateFormat=new SimpleDateFormat("yy-MM-dd/HH:mm");
        model.addAttribute("date",dateFormat.format(new Date()));
        return "gbook";
    }
    @RequestMapping("/addGuest")
    public String addGuest(Model model,Guest guest){

        gusetService.addGuest(guest);
        return "redirect:/guest";
    }
    @RequestMapping("/deleteGuest/{guestId}")
    public String delete(@PathVariable Integer guestId){
        gusetService.deleteGuest(guestId);
        return "redirect:/guest";
    }
}
