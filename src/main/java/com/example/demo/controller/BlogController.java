package com.example.demo.controller;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
import com.baidu.ueditor.ActionEnter;
import com.example.demo.Utils.WebSecurityConfig;
import com.example.demo.entity.Blog;
import com.example.demo.entity.BlogType;
import com.example.demo.entity.Classify;
import com.example.demo.entity.Visitor;
import com.example.demo.repository.BlogTypeRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.BlogService;
import com.example.demo.service.ClassifyService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    UserService userService;
    @Autowired
    ClassifyService classifyService;
    @Autowired
    private VisitorRepository visitorRepository;
    @Autowired
    private BlogTypeRepository blogTypeRepository;
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @creator: jobs
     * @date: 2018/11/27 10:16
     * @param: [model, session, map, blog, page, size]
     * @return: java.lang.String
     * @description:显示日志
     */
    @RequestMapping("/blog")
    public String toblog(Model model, HttpSession session, Map<String, String> map, Visitor visitor, @RequestParam(value = "page", defaultValue = "0") Integer page,
                         @RequestParam(value = "size", defaultValue = "7") Integer size) {
        /**
         * @creat: jobs at 2018/12/2 21:13
         * @description:显示日记
         */
        Integer UserId = (Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("name",userService.getNickName(UserId));
        Page<Blog> all = blogService.findByUserId(UserId,page,size);
        System.out.println(UserId);
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPages",all.getTotalPages());
        map.put("nickName", userService.getNickName(UserId));
        //System.out.println(userService.getNickName(UserId));
        model.addAttribute("all", all);
        List<BlogType> blogType=blogTypeRepository.findByUserId(UserId);
        model.addAttribute("blogType",blogType);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd/HH:mm");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        /**
         * @creat: jobs at 2018/12/2 17:42
         * @description:添加访客并更新访问时间
         */
//        visitor.setUserId(UserId);
//        visitor.setDate(df.format(new Date()));
//        visitor.setItem("blog");
//        visitor.setToUserId(UserId);
//        visitorRepository.save(visitor);
//        visitorRepository.deleteByUserIdAndItemAndToUserId(UserId,"blog",UserId);
//        visitor.setUserId(UserId);
//        visitor.setDate(df.format(new Date()));
//        visitor.setItem("blog");
//        visitor.setToUserId(UserId);
//        visitorRepository.save(visitor);
        /**
         * @creat: jobs at 2018/12/2 17:43
         * @description:blog页面显示访客
         */
        List<Visitor> visitorAll=visitorRepository.findByItemAndToUserId("blog",UserId);
        model.addAttribute("visitorAll",visitorAll);
        return "blog";
    }
    @RequestMapping(value = "/blog/{userId}",method=RequestMethod.GET)
    public String toblogUserId(@PathVariable Integer userId, Model model, HttpSession session, Map<String, String> map, Visitor visitor, @RequestParam(value = "page", defaultValue = "0") Integer page,
                         @RequestParam(value = "size", defaultValue = "7") Integer size) {
        /**
         * @creat: jobs at 2018/12/2 21:13
         * @description:显示日记
         */
        Integer UserId=(Integer)session.getAttribute(WebSecurityConfig.SESSION_KEY);
        Page<Blog> all = blogService.findByUserId(userId,page,size);
        System.out.println(userId);
        model.addAttribute("userId",userId);
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPages",all.getTotalPages());
        map.put("nickName", userService.getNickName(userId));
        //System.out.println(userService.getNickName(UserId));
        model.addAttribute("all", all);
        List<BlogType> blogType=blogTypeRepository.findByUserId(userId);
        model.addAttribute("blogType",blogType);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd/HH:mm");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        /**
         * @creat: jobs at 2018/12/2 17:42
         * @description:添加访客并更新访问时间
         */
        visitor.setUserId(UserId);
        visitor.setDate(df.format(new Date()));
        visitor.setItem("blog");
        visitor.setToUserId(userId);
        visitorRepository.save(visitor);
        visitorRepository.deleteByUserIdAndItemAndToUserId(UserId,"blog",userId);
        visitor.setUserId(UserId);
        visitor.setDate(df.format(new Date()));
        visitor.setItem("blog");
        visitor.setToUserId(userId);
        visitorRepository.save(visitor);
        return "perblog";
    }

    /**
     * @creator: jobs
     * @date: 2018/11/27 10:16
     * @param: [session, map]
     * @return: java.lang.String
     * @description:
     */
    @RequestMapping("toAddBlog")
    public String toAddBlog(HttpSession session, Map<String, Integer> map,Model model) {
        Integer userid = (Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        map.put("userid", userid);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd/HH:mm");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        model.addAttribute("date",df.format(new Date()));
        return "addBlog";
    }
    /**
     * @creator: jobs
     * @date: 2018/11/27 10:17
     * @param: [blog]
     * @return: java.lang.String
     * @description:下面的/add和静态网页的action对应
     */
    @RequestMapping("/addBlog")
    public String add(Blog blog,Map<String,String> map) {
        map.put("message", "<script>layer.msg('成功', {icon: 1});</script>");
        blogService.add(blog);
        return "redirect:/index";
    }
    /**
     * @creator: jobs
     * @date: 2018/11/27 10:17
     * @param: []
     * @return: java.lang.String
     * @description:查询日志分类下日志总数
     */
    @RequestMapping("/count")
    //@Query("select classname,(select count(*) from tb_blog where tb_class.classname=tb_blog.classname) as'totalCount' from tb_class")
    public String count(){
        String sql = "select classname,(select count(*) from tb_blog where tb_class.classname=tb_blog.classname) as'totalCount' from tb_class";
        Query query = entityManager.createNativeQuery(sql);
        List objecArraytList = query.getResultList();
        for(int i=0;i<objecArraytList.size();i++) {
            Object[] obj = (Object[]) objecArraytList.get(i);
            //使用obj[0],obj[1],obj[2]...取出属性　　
            System.out.println(obj[0]+":"+obj[1]);
        }
        return "index";
    }
    /**
     * @creator: jobs
     * @date: 2018/11/27 10:17
     * @param: [className, userId, model, session, map, page, size]
     * @return: java.lang.String
     * @description:日志分类
     */
    @RequestMapping(value = "/blogType/{className}",method=RequestMethod.GET)
    public String toBlogType(@PathVariable String className,Model model, HttpSession session, Map<String, String> map,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "7") Integer size){
        Integer UserId = (Integer) session.getAttribute(WebSecurityConfig.SESSION_KEY);
        Page<Blog> all = blogService.findByClassNameAndUserId(className,UserId,page,size);
        System.out.println(UserId);
        map.put("nickName", userService.getNickName(UserId));
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPages",all.getTotalPages());
        //System.out.println(userService.getNickName(UserId));
        model.addAttribute("all", all);
        List<BlogType> blogType=blogTypeRepository.findByUserId(UserId);
        model.addAttribute("blogType",blogType);
        List<Visitor> visitorAll=visitorRepository.findByItemAndToUserId("blog",UserId);
        model.addAttribute("visitorAll",visitorAll);
        return "blog";
    }
    @RequestMapping("/delete/{blogId}")
    public String deleteBlog(@PathVariable Integer blogId){

        blogService.delete(blogId);
        return "redirect:/blog";
    }
    /**
     * @creator: jobs
     * @date: 2018/12/2 21:14
     * @param: [request, response]
     * @return: void
     * @description:图片上传后台
     */
    @RequestMapping(value = "/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/admin/ueditor/jsp";
        try {
            response.setCharacterEncoding("UTF-8");
            String exec = new ActionEnter(request, rootPath).exec();
            System.out.println(exec);
            PrintWriter writer = response.getWriter();
            writer = response.getWriter();
            writer.write(new ActionEnter(request, rootPath).exec());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}