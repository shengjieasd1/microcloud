package cn.sj.microcloud.controller;

import cn.sj.vo.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerDeptController {
    
    public static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/";
    public static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list/";
    public static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/dept/get")
    public Object getDept(long id){
        Dept dept = this.restTemplate.getForObject(DEPT_GET_URL+id,Dept.class);
        return dept;
    }
    
    @RequestMapping(value = "/consumer/dept/list")
    public Object getList(){
        List<Dept> alldepts = this.restTemplate.getForObject(DEPT_LIST_URL,List.class);
        return alldepts;
    }
    
    @RequestMapping(value = "/consumer/dept/add")
    public Object getAdd(Dept dept){
        Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL,dept,Boolean.class);
        return flag;
    }

}
