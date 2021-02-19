package cn.edu.sanda.dao;

import cn.edu.sanda.entity.Attchment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Attchment)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-05 23:41:22
 */
@Mapper
public interface AttchmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Attchment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Attchment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attchment 实例对象
     * @return 对象列表
     */
    List<Attchment> queryAll(Attchment attchment);

    /**
     * 新增数据
     *
     * @param attchment 实例对象
     * @return 影响行数
     */
    int insert(Attchment attchment);

    /**
     * 修改数据
     *
     * @param attchment 实例对象
     * @return 影响行数
     */
    int update(Attchment attchment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}