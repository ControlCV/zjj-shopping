package cn.edu.sanda.controller.admin;

import cn.edu.sanda.dao.AdminDao;
import cn.edu.sanda.entity.Admin;
import cn.edu.sanda.service.AdminService;
import cn.edu.sanda.vo.ResponseVo;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户操作界面
 */
@Controller
@RequestMapping(value = {"adminOperate"})
public class AdminOperateController {

    @Autowired
    private AdminDao adminService;

    @ResponseBody
    @RequestMapping("/del")
    public ResponseVo adminOperateDel(Admin admin) {
        ResponseVo<Object> objectResponseVo = new ResponseVo<>();

        System.out.println(admin);

        UpdateWrapper<Admin> adminUpdateWrapper = new UpdateWrapper<>();
        adminUpdateWrapper.eq("admin_accout",admin.getAdminAccout());

        Admin admin1 = new Admin();
        admin1.setAdminStatus("1");
        adminService.update(admin1,adminUpdateWrapper);

        objectResponseVo.setCode("200");
        objectResponseVo.setMsg("成功加入黑名单");
        return objectResponseVo;
    }

}
