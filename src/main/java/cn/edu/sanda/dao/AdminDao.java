package cn.edu.sanda.dao;

import cn.edu.sanda.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户信息表(Admin)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-21 17:37:43
 */
@Mapper
public interface AdminDao  extends BaseMapper<Admin> {

}