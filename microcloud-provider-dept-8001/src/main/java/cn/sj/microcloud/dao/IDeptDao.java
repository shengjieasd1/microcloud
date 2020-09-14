package cn.sj.microcloud.dao;

import cn.sj.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDao {
    public boolean doCreate(Dept vo);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
