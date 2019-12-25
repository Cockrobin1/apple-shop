package com.edu.service;

import com.edu.pojo.GoodsPojo;

import java.util.List;

public interface IGoodsService {

    /**
     * 根据条件查询商品信息
     * @param goodsPojo
     * @return
     */
    public List<GoodsPojo> queryGoodsBypojo(GoodsPojo goodsPojo);


     public  GoodsPojo queryGoodsById(String gid);
}
