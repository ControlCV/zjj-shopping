package cn.edu.sanda.service.impl;

import cn.edu.sanda.entity.Admin;
import cn.edu.sanda.dao.AdminDao;
import cn.edu.sanda.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表(Admin)表服务实现类
 *
 * @author makejava
 * @since 2021-02-21 17:37:43
 */
@Service("adminService")
public class AdminServiceImpl  extends ServiceImpl<AdminDao, Admin> implements AdminService {

}