package com.example.demo.controller;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
import com.example.demo.Utils.FileUtil;
import com.example.demo.Utils.WebSecurityConfig;
import com.example.demo.entity.Classify;
import com.example.demo.entity.Gallery;
import com.example.demo.entity.Photo;
import com.example.demo.repository.PhotoRepository;
import com.example.demo.service.ClassifyService;
import com.example.demo.service.GalleryService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class GalleryController {
    @Autowired
    GalleryService galleryService;
    @Autowired
    ClassifyService classifyService;
    @Autowired
    UserService userService;
    @Autowired
    private PhotoRepository photoRepository;
    @RequestMapping("/gallery")
    public String togallery(Model model, HttpSession session, Map<String, String> map,@RequestParam(value = "page", defaultValue = "0") Integer page,
                            @RequestParam(value = "size", defaultValue = "8") Integer size){
        Integer UserId=(Integer)session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("name",userService.getNickName(UserId));
        Page<Gallery> all = galleryService.findByUserId(UserId,page,size);
        model.addAttribute("all",all);
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPages",all.getTotalPages());
        map.put("nickName",userService.getNickName(UserId));
        List<Classify> classAll=classifyService.findAll();
        model.addAttribute("classAll",classAll);
        return "share";
    }
    @RequestMapping("/readPhoto/{galleryId}")
    public String look(@PathVariable Integer galleryId, Model model,Integer userId, HttpSession session) {
        List<Photo> all = photoRepository.findByGalleryId(galleryId);
        Integer UserId=(Integer)session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("name",userService.getNickName(UserId));
        model.addAttribute("photoall", all);
        //System.out.println("+++++"+commentService.getComtId(blogId));
        //map.put("nickName",userService.getNickName(commentService.getComtId(commentService.getUserId(blogId))));
        //map.put("replynickName",userService.getNickName(commentService.getReplyUserId(commentService.getComtId(blogId))));
        return "infopic";
    }
    @RequestMapping("/toAddPhoto")
    public String toAddPhoto(){
        return "addPhoto";
    }
    @RequestMapping(value = "/addPhoto",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String addPhoto(@RequestParam("file") MultipartFile file){
            if(!file.isEmpty()) {
                // 获取文件名称,包含后缀
                String fileName = file.getOriginalFilename();

                // 存放在这个路径下：该路径是该工程目录下的static文件下：(注：该文件可能需要自己创建)
                // 放在static下的原因是，存放的是静态文件资源，即通过浏览器输入本地服务器地址，加文件名时是可以访问到的
                String path = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/upload/";
                System.out.println(path);
                try {
                    // 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法
                    FileUtil.fileupload(file.getBytes(), path, fileName);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                // 接着创建对应的实体类，将以下路径进行添加，然后通过数据库操作方法写入
                Photo photo = new Photo();
                photo.setPhotoId(1234);
                photo.setPhoto("http://localhost:8084/"+fileName);
                photoRepository.save(photo);

            }

        return "redirect:/gallery";
    }
    @RequestMapping("/about")
    public String toAbout(Model model,HttpSession session){
        Integer UserId=(Integer)session.getAttribute(WebSecurityConfig.SESSION_KEY);
        model.addAttribute("name",userService.getNickName(UserId));
        return "about";
    }
    @RequestMapping("/InfoPic")
    public String toInfoPic(){
        return "infopic";
    }
}
