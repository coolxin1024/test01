package com.zky.entity;

/**
 * 用户信息类
 */
public class UserInfo {
    /**
     * 用户ID
     */
    private int userid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 登录密码
     */
    private String password;

    /**
     * 构造器
     */
    public UserInfo() {
    }

    public UserInfo(int userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    /**
     * Setter、Getter
     */
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 重写toString
     */
    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
