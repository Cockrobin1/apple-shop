package com.edu.entity;

public class RoleEntity {

    private int rid; //角色id
    private String rname; //角色名称
    private String rdesc; //角色描述

    private int[] authids; //权限id

    public int[] getAuthids() {
        return authids;
    }

    public void setAuthids(int[] authids) {
        this.authids = authids;
    }
    private int pageNum =1;

    private int pageSize =3;

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

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc;
    }
}
