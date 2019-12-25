package com.edu.service.impl;

import com.edu.mapper.AdminMapper;
import com.edu.mapper.GoodsMapper;
import com.edu.mapper.GoodsTypeMapper;
import com.edu.pojo.CustomerPojo;
import com.edu.pojo.GoodsPojo;
import com.edu.service.IIndexService;
import com.edu.pojo.GoodsTypePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IIndexService {
    @Autowired
    GoodsTypeMapper goodsTypeMapper;

    @Autowired
    GoodsMapper goodsMapper;



    public List<GoodsTypePojo> queryGoodsTypes() {
        List<GoodsTypePojo> goodsTypePojos = goodsTypeMapper.queryGoodsTypeThree();
        return goodsTypePojos;
    }

    /**
     * 6个商品
     * @return
     */
    @Override
    public List<GoodsPojo> queryGoods() {

//      PageHelper.startPage();
        List<GoodsPojo> list = goodsMapper.queryGoodsByPojo(null);
        return list;
    }

    @Override
    public CustomerPojo login(CustomerPojo customerPojo) {
        return goodsTypeMapper.login(customerPojo);
    }
}
