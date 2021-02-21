package cn.edu.sanda.controller.goods;

import cn.edu.sanda.entity.Goods;
import cn.edu.sanda.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2021-02-13 13:06:46
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;


}