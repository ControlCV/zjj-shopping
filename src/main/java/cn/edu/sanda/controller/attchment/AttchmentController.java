package cn.edu.sanda.controller.attchment;


import cn.edu.sanda.entity.Admin;
import cn.edu.sanda.entity.Attchment;
import cn.edu.sanda.service.AdminService;
import cn.edu.sanda.vo.ResponseVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
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


    @Value("${file.upload.path}")
    private String filePath;

    @Value("${file.upload.mapping.path}")
    private String mappingPath;

    //头像上传
    @ResponseBody
    @RequestMapping(value = {"/headImageUpload"},method = RequestMethod.POST)
    public ResponseVo attchmentHeadImageUpload(@RequestParam(value = "file",required = false) MultipartFile file) {

        ResponseVo<Object> objectResponseVo = new ResponseVo<>();


        //上传文件不能为空
        if(ObjectUtils.isEmpty(file)){
            objectResponseVo.setCode("500");
            objectResponseVo.setMsg("文件不能为空");
            return objectResponseVo;
        }

        try {
            //在文件下面生成文件夹
            // String path = request.getSession().getServletContext().getRealPath("/upload");

            //生成时间
            String sj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            //生成时间文件夹
            String path =filePath +sj;
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

            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("filePath",mappingPath+sj+"/"+newfilename);


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
