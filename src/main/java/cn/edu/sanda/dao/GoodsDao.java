package cn.edu.sanda.dao;

import cn.edu.sanda.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Goods)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-13 13:06:46
 */
@Mapper
public interface GoodsDao extends BaseMapper<Goods> {

}