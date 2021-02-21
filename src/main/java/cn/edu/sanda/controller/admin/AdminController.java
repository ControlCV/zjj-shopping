package cn.edu.sanda.controller.admin;

import cn.edu.sanda.entity.Admin;
import cn.edu.sanda.entity.Menu;
import cn.edu.sanda.service.AdminService;
import cn.edu.sanda.service.MenuService;
import cn.edu.sanda.utils.TreeNode;
import cn.edu.sanda.utils.TreeNodeBulider;
import cn.edu.sanda.vo.AdminRiderManageRequestVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.ObjectUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 作用：
 * 后台管理员登录的相关controller
 */
@Controller
@RequestMapping(value = {"admin","/"})
public class AdminController {
    @Autowired
    private MenuService menuService;

    @Autowired
    private AdminService adminService;

    //登录首页
    @GetMapping(value = {"/login","/"})
    public String adminLogin() {
        return "/admin/login";
    }

    //控制面板
    @RequestMapping("/index")
    public String adminIndex(HttpServletRequest request) {
        //查询用户的账号权限，暂时没做

        //查询菜单表
        List<Menu> menuList = menuService.list();

        List<TreeNode> nodes = new ArrayList<>();
        //将list组装为权限树
        for (Menu menu: menuList) {
            Integer id = menu.getId();
            Integer pid = menu.getPid();
            String title = menu.getTitle();
            String icon = menu.getIcon();
            String href = menu.getHref();
            Boolean spread = menu.getSpread().equals("0")?true:false;
            nodes.add(new TreeNode(id,pid,title,icon,href,spread));
        }

        List<TreeNode> builder = TreeNodeBulider.builder(nodes, 1);

        System.out.println(builder.toString());

        //返回给前端
        request.getSession().setAttribute("menuList",builder);

        return "/admin/index";
    }

    //骑手管理界面
    @RequestMapping("/riderManage")
    public String adminRiderManage(HttpServletRequest request) {
        return  "/admin/riderManage";
    }


    //查询骑手
    @ResponseBody
    @RequestMapping("/riderManageNumber")
    public List<Admin> adminRiderManageNumber(AdminRiderManageRequestVo riderManageRequestVo) {

        System.out.println(riderManageRequestVo);
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.eq("admin_type","1");

        if(riderManageRequestVo.getAdminAccout()!=null){
            adminQueryWrapper.like("admin_accout",riderManageRequestVo.getAdminAccout());
        }
        if(riderManageRequestVo.getAdminName()!=null){
            adminQueryWrapper.like("admin_name",riderManageRequestVo.getAdminName());
        }
        if(riderManageRequestVo.getAdminPhone()!=null){
            adminQueryWrapper.like("admin_phone",riderManageRequestVo.getAdminPhone());
        }
        if(riderManageRequestVo.getAdminGender()!=null){
            adminQueryWrapper.like("admin_gender",riderManageRequestVo.getAdminGender());
        }
        if(riderManageRequestVo.getAdminAddress()!=null){
            adminQueryWrapper.like("admin_address",riderManageRequestVo.getAdminAddress());
        }

        List<Admin> list = adminService.list(adminQueryWrapper);

        return  list;
    }




}