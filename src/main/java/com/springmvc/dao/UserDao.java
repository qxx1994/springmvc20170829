package com.springmvc.dao;

import com.springmvc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qxx
 * @create 2017-08-29 9:31
 **/
public interface UserDao {

    /**
     *  根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    public User findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

    /**
     *  获取用户
     * @return
     */
    public List<User> find(User User);

    /**
     *  新增
     * @param User
     */
    public void add(User User);

    /**
     *  修改
     * @param User
     */
    public void update(User User);

    /**
     *  删除
     * @param id
     */
    public void delete(String id);
}
