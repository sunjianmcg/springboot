package tk.mybatis.springboot.mapper;

import tk.mybatis.springboot.model.SysUser;
import java.util.List;

public interface UserMapper {
    /**
     * 获得用户信息
     */
    List<SysUser> selectAll();

    /**
     * 通过用户编号ID获得用户信息
     */
    SysUser selectById(Long userId);

    /**
     * 插入用户信息
     */
    int insert(SysUser user);
}
