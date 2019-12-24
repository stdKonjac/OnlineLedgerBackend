package com.stdkonjac.onlineledger.entity;

import java.sql.Timestamp;

public class LogoutRecord {
    private Integer id;
    private String ip;
    private Integer uid;
    private String username;
    private Timestamp logoutTime;

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

    public Timestamp getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Override
    public String toString() {
        return "LogoutRecord{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", logoutTime=" + logoutTime +
                '}';
    }
}
