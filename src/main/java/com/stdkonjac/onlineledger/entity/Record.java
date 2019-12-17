package com.stdkonjac.onlineledger.entity;

import java.util.Date;

public class Record {
    private int id;
    private int uid;
    private Date date;
    private String category;
    private int type;
    private double cost;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "record{" +
                "id=" + id +
                ", uid=" + uid +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", type=" + type +
                ", cost=" + cost +
                '}';
    }
}
