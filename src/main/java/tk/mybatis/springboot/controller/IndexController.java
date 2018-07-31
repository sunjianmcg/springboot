package tk.mybatis.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.springboot.model.SysUser;
import tk.mybatis.springboot.service.SysUserService;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/users")
    public List<SysUser> users(){
        return sysUserService.findAll();

    }

    @RequestMapping(value="one/{id}",method = RequestMethod.GET)
    public SysUser getUserById(@PathVariable("id") Long id){
        return sysUserService.findById(id);

    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public int insert(SysUser user){
        user.setUserEmail("modifay@173.com");
        return sysUserService.inert(user);
    }


    @RequestMapping(value = "two/{id}/{sid}" , method = RequestMethod.GET)
    public String say(@PathVariable Integer id, @PathVariable Integer sid){
        return "id:" +id + "sid:" + sid;
    }
}
