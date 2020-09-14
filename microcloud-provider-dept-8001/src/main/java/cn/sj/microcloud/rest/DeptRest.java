package cn.sj.microcloud.rest;

import cn.sj.microcloud.service.IDeptService;
import cn.sj.vo.Dept;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;
    
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id){
        return this.deptService.get(id);
    }
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Object add(@RequestBody Dept dept){
        return this.deptService.add(dept);
    }
    
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public Object list(){
        return this.deptService.list();
    }
}
