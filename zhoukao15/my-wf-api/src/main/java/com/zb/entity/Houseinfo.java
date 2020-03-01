package com.zb.entity;

public class Houseinfo {


    Integer houseid;
    String housedesc;
    Integer typeid;
    Integer monthlyrent;
    String publishdate;
    Housetype housetype;

    public Housetype getHousetype() {
        return housetype;
    }

    public void setHousetype(Housetype housetype) {
        this.housetype = housetype;
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getHousedesc() {
        return housedesc;
    }

    public void setHousedesc(String housedesc) {
        this.housedesc = housedesc;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getMonthlyrent() {
        return monthlyrent;
    }

    public void setMonthlyrent(Integer monthlyrent) {
        this.monthlyrent = monthlyrent;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }
}
