package com.stdkonjac.onlineledger.entity;

import java.util.Date;

public class LoginRecord {
    private Integer id;
    private String ip;
    private Integer uid;
    private String username;
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LoginRecord{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", date=" + date +
                '}';
    }
}
