package com.edu.service.impl;

import com.edu.mapper.OrderMapper;
import com.edu.pojo.GoodsPojo;
import com.edu.pojo.OrderPojo;
import com.edu.pojo.OrderdetailPojo;
import com.edu.service.IOrderService;
import com.edu.util.StringUtils;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
   OrderMapper orderMapper;

    @Override
    public OrderPojo create(int aid, String[] gids, Map<String, GoodsPojo> shopCar) {

        OrderPojo orderPojo = new OrderPojo();
        orderPojo.setAid(aid);//获取商品id
        orderPojo.setAddressId(1); //选中了地址
        orderPojo.setOid(StringUtils.uuid());//获取订单的id;

        //获取单价
        float  total =  getTotalPrice(gids,shopCar);
        orderPojo.setOtotal(total);
        //保存信息
        boolean flag = orderMapper.createOrder(orderPojo);

        if (flag){ //创建订单成功，添加订单详情
            //订单详情
            List<OrderdetailPojo> details =  createOrderDetails(gids,shopCar,orderPojo.getOid());

            //保存订单详情
          boolean b1 = orderMapper.createOrderDetails(details);
          if (b1){
              //需要将订单添加到session里面
              orderPojo.setOrderdetailPojo(details);
              for (String gid : gids) {
                   shopCar.remove(gid);

              }
              return  orderPojo;//返回保存的订单
          }

        }
        return null;
    }

    private List<OrderdetailPojo> createOrderDetails(String[] gids, Map<String, GoodsPojo> shopCar, String oid) {
       List<OrderdetailPojo> list = new ArrayList<OrderdetailPojo>();

       GoodsPojo gp;
       OrderdetailPojo odp;
        for (String gid : gids) {
            //得到购物车里面的一跳商品信息
             gp=shopCar.get(gid);
             //创建一个订单详情
            odp= new OrderdetailPojo();
            odp.setOdid(StringUtils.uuid());//订单详情id
            odp.setOid(oid);//当前订单的id
            odp.setGoodsPojo(gp);
            odp.setOdnumber(gp.getNumber());
            odp.setOdprice(gp.getGprice()*gp.getGdiscount());

            list.add(odp);
        }
            return list;
    }

    //取消目标订单

    @Override
    public boolean cancelOrder(String oid) {
        return orderMapper.cancelOrder(oid);
    }

    @Override
    public boolean apaySuccess(String oid) {
        return  orderMapper.apaySuccess(oid);
    }


    /**
     * 计算当前所有参与结算的商品的总价格
     * @param gids
     * @param shopCar
     * @return
     */
    private float getTotalPrice(String[] gids, Map<String, GoodsPojo> shopCar) {

        float total = 0.0f;

        GoodsPojo gp;
        for(String gid : gids){
            gp = shopCar.get(gid); //获取商品
            total += gp.getGprice() * gp.getGdiscount() * gp.getNumber(); //计算一个商品的总价格并且累加
        }

        return total;
    }

    public List<OrderPojo> createDetail(int aid){
            return  orderMapper.createDetail(aid);
    }

    @Override
    public List<OrderPojo> getUser(int aid) {
        return orderMapper.getUser(aid);
    }
}

