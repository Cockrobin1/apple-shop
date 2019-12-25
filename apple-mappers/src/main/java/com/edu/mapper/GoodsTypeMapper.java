package com.edu.mapper;

import com.edu.pojo.AdminPojo;
import com.edu.pojo.CustomerPojo;
import com.edu.pojo.GoodsTypePojo;

import java.util.List;

public interface GoodsTypeMapper {


    public   List<GoodsTypePojo> queryGoodsTypeThree();

    /**
     * 用户登录
     */
    public CustomerPojo login(CustomerPojo customerPojo);
}
