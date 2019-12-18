package com.stdkonjac.onlineledger.entity;

public class Category {
    private Integer id;
    private Integer uid;
    private String name;
    private Integer recordCount;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", recordCount=" + recordCount +
                '}';
    }
}
