package com.stdkonjac.onlineledger.entity;

import java.util.Date;

public class PaidRecord {
    private Integer id;
    private Integer uid;
    private Double value;
    private Date date;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PaidRecord{" +
                "id=" + id +
                ", uid=" + uid +
                ", value=" + value +
                ", date=" + date +
                ", remark='" + remark + '\'' +
                '}';
    }
}
