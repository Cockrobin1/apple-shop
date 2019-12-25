package com.edu.pojo;

import java.util.List;

//订单详情表
public class OrderdetailPojo {
    private String  odid;
    private String  oid;
    private String  gid;//s商品id
    private int odnumber;
    private  float odprice;

    private  GoodsPojo goodsPojo;

    public GoodsPojo getGoodsPojo() {
        return goodsPojo;
    }

    public void setGoodsPojo(GoodsPojo goodsPojo) {
        this.goodsPojo = goodsPojo;
    }

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public int getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(int odnumber) {
        this.odnumber = odnumber;
    }

    public float getOdprice() {
        return odprice;
    }

    public void setOdprice(float odprice) {
        this.odprice = odprice;
    }
}
