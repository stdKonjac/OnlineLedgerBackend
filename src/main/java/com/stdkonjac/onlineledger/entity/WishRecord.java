package com.stdkonjac.onlineledger.entity;

public class WishRecord {
    private Integer id;
    private Integer uid;
    private String wish;
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

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "WishRecord{" +
                "id=" + id +
                ", uid=" + uid +
                ", wish='" + wish + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
