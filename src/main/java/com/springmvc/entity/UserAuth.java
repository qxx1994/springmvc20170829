package com.springmvc.entity;

/**
 * Created by qxx on 2018/12/4.
 */
public class UserAuth {

    private Integer id;         //用户序号
    private String loginType;   //登录类型（1:username,2:email,3:phone）
    private String openId;      //用户的唯一标识（手机号号,邮箱地址,用户名或第三方应用的唯一标识）
    private String loginToken;  //登录凭证（站内的保存用户密码，站外的不保存或保存api接口的access_token凭证）

    public UserAuth() {
    }

    public UserAuth(Integer id, String loginType, String openId, String loginToken) {
        this.id = id;
        this.loginType = loginType;
        this.openId = openId;
        this.loginToken = loginToken;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }
}
