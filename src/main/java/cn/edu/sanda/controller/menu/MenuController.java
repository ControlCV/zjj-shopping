package cn.edu.sanda.controller.menu;

import cn.edu.sanda.service.MenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 菜单表(Menu)表控制层
 *
 * @author makejava
 * @since 2020-11-07 23:51:59
 */
@RestController
@RequestMapping("menu")
public class MenuController {

    @Resource
    private MenuService menuService;



}