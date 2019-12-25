package com.edu.service;

import com.edu.pojo.GoodsPojo;
import com.edu.pojo.OrderPojo;
import com.edu.pojo.OrderdetailPojo;

import java.util.List;
import java.util.Map;

public interface IOrderService {


    /**
     * 生成订单
     * @return
     */
    public OrderPojo create(int aid, String[] gids, Map<String ,GoodsPojo> shopCar);

    /**
     * 讲订单取消 设置为失效
     * @param oid
     * @return
     */
     public   boolean cancelOrder(String oid);

     // 支付成功，需要调用方法
     public  boolean apaySuccess(String  oid);

    public List<OrderPojo> createDetail(int aid);
    //个人信息
    public List<OrderPojo> getUser(int aid);
}
