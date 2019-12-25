package com.edu.service;

import com.edu.pojo.AdminPojo;
import com.edu.pojo.CustomerPojo;
import com.edu.pojo.GoodsPojo;
import com.edu.pojo.GoodsTypePojo;

import java.util.List;

public interface IIndexService {
    //首页查询三个商品
    public List<GoodsTypePojo> queryGoodsTypes();

    public List<GoodsPojo> queryGoods();

    public CustomerPojo login (CustomerPojo customerPojo);
}
