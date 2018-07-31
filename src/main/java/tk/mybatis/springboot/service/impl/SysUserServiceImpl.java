package tk.mybatis.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.springboot.mapper.UserMapper;
import tk.mybatis.springboot.model.SysUser;
import tk.mybatis.springboot.service.SysUserService;

import java.util.List;
@Service
public class SysUserServiceImpl  implements SysUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public SysUser findById(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public int inert(SysUser user) {
        return userMapper.insert(user);
    }
}
