package cn.edu.sanda.service.impl;

import cn.edu.sanda.dao.MenuDao;
import cn.edu.sanda.entity.Menu;
import cn.edu.sanda.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 菜单表(Menu)表服务实现类
 *
 * @author makejava
 * @since 2020-11-07 23:51:59
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

}