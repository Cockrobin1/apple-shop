package com.edu.mapper;

import com.edu.pojo.GoodsPojo;

import java.util.List;

public interface GoodsMapper {

   /**
    * 查询商品
    * 1.商品类型
    * 2，价格
    * 3， 标签
    * 4，商品类别
    *
    * @param goodsPojo
    * @return
    */
   public List<GoodsPojo> queryGoodsByPojo(GoodsPojo goodsPojo);

   public  GoodsPojo queryGoodsById(String gid);
}