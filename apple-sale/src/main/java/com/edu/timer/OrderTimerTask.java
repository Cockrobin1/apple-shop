package com.edu.timer;

import com.edu.service.IOrderService;

import java.util.Timer;
import java.util.TimerTask;

public class OrderTimerTask extends TimerTask {

    //业务操作类
    private IOrderService orderService;
  //计时器
    private Timer timer;
    //要取消的目标id
    private String oid;

    public OrderTimerTask() {
    }

    //执行取消订单 需要两个参数 一个是当前计时器，失效成功
    //用来取消计时器， service参数就是用来设置订单失效的

    public OrderTimerTask(IOrderService orderService, Timer timer, String oid) {
        this.orderService = orderService;
        this.timer = timer;
        this.oid = oid;
    }

    /**
     * 订单状态为失效
     * 订单设置后还需要关闭计时器
     *
     */
    public void run() {
    //orderservice 在这里需要重新注入一个对象
     boolean bq =  orderService.cancelOrder(oid);

     if (bq){
         //如果成功就取消计时器
         timer.cancel(); }
    }
}
