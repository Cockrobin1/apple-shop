package com.edu.pojo;

import java.util.List;

//商品表
public class GoodsPojo {
    private  String gid;
    private  String gname;
    private  String gimage;
    private  float gprice =-1;//商品价格
    private  int gtype=-1 ;//商品类型
    private  String gdesc;
    private  float gdiscount;//商品折扣 0.8折
    private  int isdelete = -1;//是否被删除
    private  int glabel = -1;// 热款 折扣
    private  int gsex = -1; // 服饰类别  男 女 同
    private  float pricemin=-1;
    private  float pricemax=-1;
    private  int  number=1;

    private List<OrderdetailPojo> orderdetailPojo;//商品id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPricemin() {
        return pricemin;
    }

    public void setPricemin(float pricemin) {
        this.pricemin = pricemin;
    }

    public float getPricemax() {
        return pricemax;
    }

    public void setPricemax(float pricemax) {
        this.pricemax = pricemax;
    }

    public GoodsTypePojo getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsTypePojo goodsType) {
        this.goodsType = goodsType;
    }

    private  GoodsTypePojo goodsType;

    private  int pageNum = 1;
    private  int pageSize = 3;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public float getGprice() {
        return gprice;
    }

    public void setGprice(float gprice) {
        this.gprice = gprice;
    }

    public int getGtype() {
        return gtype;
    }

    public void setGtype(int gtype) {
        this.gtype = gtype;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public float getGdiscount() {
        return gdiscount;
    }

    public void setGdiscount() {
        this.gdiscount = gdiscount;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public int getGlabel() {
        return glabel;
    }

    public void setGlabel(int glabel) {
        this.glabel = glabel;
    }

    public int getGsex() {
        return gsex;
    }

    public void setGsex(int gsex) {
        this.gsex = gsex;
    }

    public GoodsTypePojo getGoodsTypePojo() {
        return goodsType;
    }

    public void setGoodsTypePojo(GoodsTypePojo goodsTypePojo) {
        this.goodsType = goodsTypePojo;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
