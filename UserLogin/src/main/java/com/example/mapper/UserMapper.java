package com.example.mapper;

import com.example.entity.User;

/**
 * @author sweet
 */

public interface UserMapper {
    /**
     * @return
     * @Author: sweet
     * @Description: 根据主键删除用户
     * @Date: 2020/4/7 12:00
     * @Param
     */
    int deleteById(Integer id);

    /**
     * @return
     * @Author: sweet
     * @Description: 新增用户
     * @Date: 2020/4/7 12:00
     * @Param
     */
    int insertUser(User user);

    /**
     * @return
     * @Author: sweet
     * @Description: 根据id查询用户
     * @Date: 2020/4/7 12:01
     * @Param
     */
    User selectById(Integer id);

    /**
     * @return
     * @Author: sweet
     * @Description: 根据用户名查询密码
     * @Date: 2020/4/7 22:06
     * @Param
     */
    User selectByUserName(String username);

    /**
     * @return
     * @Author: sweet
     * @Description: 根据id删除用户
     * @Date: 2020/4/7 12:01
     * @Param
     */
    int updateById(User user);
}