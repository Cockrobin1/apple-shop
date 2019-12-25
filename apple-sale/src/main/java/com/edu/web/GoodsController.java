package com.edu.web;

import com.edu.pojo.GoodsPojo;
import com.edu.service.IGoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class GoodsController {
    @Autowired
    IGoodsService goodsService;

@RequestMapping("queryGoods")
    private ModelAndView queryGoods(GoodsPojo goodsPojo){


    //将数据进行展示
    ModelAndView mv  = new ModelAndView("goodsList");
    //查询商品列表
    List<GoodsPojo> list = goodsService.queryGoodsBypojo(goodsPojo);

    PageInfo<GoodsPojo> pageInfo=new PageInfo<>(list);


    mv.addObject("pageInfo",pageInfo);//分页
    mv.addObject("goodsPojo",goodsPojo);//查询条件回填

    return mv;//返回商品列表
    }


}
