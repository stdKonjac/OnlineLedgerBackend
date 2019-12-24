package com.stdkonjac.onlineledger.entity;

import java.util.Date;

public class IncomeRecord {
    private Integer id;
    private Integer uid;
    private Date date;
    private String category;
    private String type;
    private Double income;
    private String remark;
    private String ledgerBook;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLedgerBook() {
        return ledgerBook;
    }

    public void setLedgerBook(String ledgerBook) {
        this.ledgerBook = ledgerBook;
    }

    @Override
    public String toString() {
        return "IncomeRecord{" +
                "id=" + id +
                ", uid=" + uid +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", income=" + income +
                ", remark='" + remark + '\'' +
                ", ledgerBook='" + ledgerBook + '\'' +
                '}';
    }
}
