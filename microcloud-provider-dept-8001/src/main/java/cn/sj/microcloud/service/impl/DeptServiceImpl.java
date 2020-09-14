package cn.sj.microcloud.service.impl;

import cn.sj.microcloud.dao.IDeptDao;
import cn.sj.microcloud.service.IDeptService;
import cn.sj.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDao deptDao;
    @Override
    public Dept get(long id) {
        return this.deptDao.findById(id);
    }
    
    @Override
    public boolean add(Dept dept) {
        return this.deptDao.doCreate(dept);
    }
    
    @Override
    public List<Dept> list() {
        return this.deptDao.findAll();
    }
}
