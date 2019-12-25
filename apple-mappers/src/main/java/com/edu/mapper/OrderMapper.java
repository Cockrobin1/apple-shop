package com.edu.mapper;

import com.edu.pojo.OrderPojo;
import com.edu.pojo.OrderdetailPojo;

import java.util.List;

public interface OrderMapper {

    public boolean createOrder(OrderPojo orderPojo);

    public   boolean createOrderDetails(List<OrderdetailPojo> datails);

    public  boolean cancelOrder(String  oid);
    public  boolean apaySuccess(String oid);

    public List<OrderPojo> createDetail(int aid);

    public List<OrderPojo> getUser(int aid);
}