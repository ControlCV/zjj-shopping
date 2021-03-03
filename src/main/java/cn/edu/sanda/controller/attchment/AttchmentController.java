package cn.edu.sanda.controller.attchment;


import cn.edu.sanda.entity.Admin;
import cn.edu.sanda.entity.Attchment;
import cn.edu.sanda.service.AdminService;
import cn.edu.sanda.vo.ResponseVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

@Controller
@RequestMapping(value = {"attchment"})
public class AttchmentController {

    @Autowired
    private AdminService adminService;

    //头像上传
    @ResponseBody
    @RequestMapping(value = {"/headImageUpload"},method = RequestMethod.POST)
    public ResponseVo attchmentHeadImageUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request) {

        ResponseVo<Object> objectResponseVo = new ResponseVo<>();

        try {
            //在文件下面生成文件夹
            // String path = request.getSession().getServletContext().getRealPath("/upload");

            //生成时间
            String sj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            //生成时间文件夹
            String path = "D:\\zjj-graduation-project\\manage\\src\\main\\resources\\static\\file\\"+sj;
            File f = new File(path);
            if(!f.exists()){
                f.mkdirs();
            }

            //获得文件最后一个.的位置
            int ext=file.getOriginalFilename().lastIndexOf(".");
            //获得后缀名
            String suffix = file.getOriginalFilename().substring(ext);
            //生成uuid为新文件名
            String newfilename = UUID.randomUUID().toString()+suffix;
            //上传文件
            File newFile = new File( path+"/"+newfilename);

            file.transferTo(newFile);

            //将文件名存入到数据库
//            UpdateWrapper<Admin> adminQueryWrapper = new UpdateWrapper<>();
//            adminQueryWrapper.eq("admin_account",admin.getAdminAccout()).set("admin_photo",path+"/"+newfilename);
//            adminService.update(adminQueryWrapper);

            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("filePath",path+"/"+newfilename);


            objectResponseVo.setCode("200");
            objectResponseVo.setMsg("头像上传成功");
            objectResponseVo.setData(hashMap);

        } catch (Exception e) {
            e.printStackTrace();
            objectResponseVo.setCode("200");
            objectResponseVo.setMsg("头像上传失败！");
        }

        return objectResponseVo;
    }

}
