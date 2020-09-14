package cn.sj.microcloud.service;




import cn.sj.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IDeptServiceTest {
    @Resource
    private IDeptService deptService ;
    @Test
    public void testGet() {
        System.out.println(this.deptService.get(1));
    }
    
    @Test
    public void testAdd() {
        Dept dept = new Dept() ;
        dept.setDname("测试部-" + System.currentTimeMillis());
        System.out.println(this.deptService.add(dept));
    }
    
    @Test
    public void testList() {
        System.out.println(this.deptService.list());
    }
    
}