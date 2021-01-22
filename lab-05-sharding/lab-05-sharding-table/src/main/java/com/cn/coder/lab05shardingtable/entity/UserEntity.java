package com.cn.coder.lab05shardingtable.entity;

/**
 * @USER wh
 * @DATE 2020/9/14
 * @Description
 */
public class UserEntity {

    private Long id;

    private String userName;

    private String password;

    private String realName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
