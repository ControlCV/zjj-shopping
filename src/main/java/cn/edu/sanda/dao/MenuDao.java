package cn.edu.sanda.dao;

import cn.edu.sanda.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单表(Menu)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-07 23:51:59
 */
@Mapper
public interface MenuDao extends BaseMapper<Menu> {



}