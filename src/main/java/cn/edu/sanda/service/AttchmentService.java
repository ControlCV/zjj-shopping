package cn.edu.sanda.service;

import cn.edu.sanda.entity.Attchment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Attchment)表服务接口
 *
 * @author makejava
 * @since 2020-11-05 23:41:22
 */
public interface AttchmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Attchment queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Attchment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param attchment 实例对象
     * @return 实例对象
     */
    Attchment insert(Attchment attchment);

    /**
     * 修改数据
     *
     * @param attchment 实例对象
     * @return 实例对象
     */
    Attchment update(Attchment attchment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}