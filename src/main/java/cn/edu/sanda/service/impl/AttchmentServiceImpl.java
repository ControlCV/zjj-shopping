package cn.edu.sanda.service.impl;

import cn.edu.sanda.entity.Attchment;
import cn.edu.sanda.dao.AttchmentDao;
import cn.edu.sanda.service.AttchmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Attchment)表服务实现类
 *
 * @author makejava
 * @since 2020-11-05 23:41:22
 */
@Service("attchmentService")
public class AttchmentServiceImpl implements AttchmentService {
    @Resource
    private AttchmentDao attchmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Attchment queryById(Integer id) {
        return this.attchmentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Attchment> queryAllByLimit(int offset, int limit) {
        return this.attchmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param attchment 实例对象
     * @return 实例对象
     */
    @Override
    public Attchment insert(Attchment attchment) {
        this.attchmentDao.insert(attchment);
        return attchment;
    }

    /**
     * 修改数据
     *
     * @param attchment 实例对象
     * @return 实例对象
     */
    @Override
    public Attchment update(Attchment attchment) {
        this.attchmentDao.update(attchment);
        return this.queryById(attchment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.attchmentDao.deleteById(id) > 0;
    }
}