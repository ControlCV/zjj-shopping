package cn.edu.sanda.service.impl;

import cn.edu.sanda.entity.Goods;
import cn.edu.sanda.dao.GoodsDao;
import cn.edu.sanda.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2021-02-13 13:06:46
 */
@Service("goodsService")
public class GoodsServiceImpl extends ServiceImpl<GoodsDao,Goods> implements GoodsService  {

}