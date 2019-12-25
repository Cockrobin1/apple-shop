package com.edu.service.impl;

import com.edu.mapper.AdminMapper;
import com.edu.mapper.GoodsMapper;
import com.edu.pojo.GoodsPojo;
import com.edu.service.IGoodsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
     GoodsMapper goodsMapper;


    @Override
    public List<GoodsPojo> queryGoodsBypojo(GoodsPojo goodsPojo) {

        PageHelper.startPage(goodsPojo.getPageNum(),goodsPojo.getPageSize());
        return goodsMapper.queryGoodsByPojo(goodsPojo) ;
    }

    @Override
    public GoodsPojo queryGoodsById(String gid) {
        return goodsMapper.queryGoodsById(gid);
    }


}
