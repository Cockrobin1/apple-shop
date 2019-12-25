package com.edu.entity;

public class AuthEntity {



    public class AuthPojo {
        private int auid; //权限id
        private String auname; //权限名称
        private String aupath; //权限路径
        private short autype; //权限类型
        private int aupid; //权限的父id

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

        public int getAuid() {
            return auid;
        }

        public void setAuid(int auid) {
            this.auid = auid;
        }

        public String getAuname() {
            return auname;
        }

        public void setAuname(String auname) {
            this.auname = auname;
        }

        public String getAupath() {
            return aupath;
        }

        public void setAupath(String aupath) {
            this.aupath = aupath;
        }

        public short getAutype() {
            return autype;
        }

        public void setAutype(short autype) {
            this.autype = autype;
        }

        public int getAupid() {
            return aupid;
        }

        public void setAupid(int aupid) {
            this.aupid = aupid;
        }
    }
}