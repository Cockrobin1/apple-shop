package com.edu.pojo;

import java.util.Date;
import java.util.List;

//订单表
public class OrderPojo {
    private  String oid;
    private  int aid;
    private  int addressId;
    private Date odate; //订单时间
    private  float ototal;//订单总价
    private  String  ostatus;//支付状态 '1:未支付;2:已支付3:已发货;4:超时失效',

     List<OrderdetailPojo> details; // 订单详情

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public float getOtotal() {
        return ototal;
    }

    public void setOtotal(float ototal) {
        this.ototal = ototal;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }


    public List<OrderdetailPojo> getOrderdatailPojo() {
        return details;
    }

    public void setOrderdetailPojo(List<OrderdetailPojo> orderdetailPojo) {
        this.details = orderdetailPojo;
    }


}
