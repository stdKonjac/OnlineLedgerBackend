package com.stdkonjac.onlineledger.entity;

public class Category {
    private int id;
    private int uid;
    private String name;
    private int record_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecord_count() {
        return record_count;
    }

    public void setRecord_count(int record_count) {
        this.record_count = record_count;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", record_count=" + record_count +
                '}';
    }
}
