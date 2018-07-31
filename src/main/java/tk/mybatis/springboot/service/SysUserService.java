package tk.mybatis.springboot.service;

import tk.mybatis.springboot.model.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 获得用户信息
     */
    List<SysUser> findAll();
    SysUser findById(Long userId);
    int inert(SysUser user);
}
