package com.springmvc.entity;

import java.io.Serializable;

/**
 * 用户
 *
 * @author qxx
 * @create 2017-08-29 9:29
 **/
public class User {

    /**用户ID*/
    private Integer id;
    /**昵称*/
    private String nickname;
    /**头像*/
    private String headimg;

    public User() {
    }

    public User(Integer id, String nickname, String headimg) {
        this.id = id;
        this.nickname = nickname;
        this.headimg = headimg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
}
