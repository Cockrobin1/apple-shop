package com.edu.web;

import com.edu.code.ResponseShopCar;
import com.edu.pojo.GoodsPojo;
import com.edu.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class ShopController {

    @Autowired
    IGoodsService goodsService;
    /**
     * 添加商品到购物车
     * @param session
     * @param gid
     * @return
     */

    @RequestMapping("addShopCar")
    public ResponseShopCar addShopCar(HttpSession session, String  gid){
        //获取购物车
        Map<String , GoodsPojo> shopCar= (Map<String, GoodsPojo>) session.getAttribute("shopCar");

        if(null == shopCar){ //说明这个用户是第一次添加
            shopCar=new HashMap<>();  //创建一个新的购物车
        }
        //判断购物车是否当前有添加商品
        GoodsPojo goodsPojo = shopCar.get(gid);
        if (null == goodsPojo){
           //没有商品 1、查询商品id  2.添加
            goodsPojo  =   goodsService.queryGoodsById(gid);
          shopCar.put(gid,goodsPojo);
        }else {
            //已经存在商品 进行加一
            goodsPojo.setNumber(goodsPojo.getNumber()+1);
        }
        //添加成功了  将当前购物车添加到session中
        session.setAttribute("shopCar",shopCar);
        //构建返回参数
        ResponseShopCar rsc = new ResponseShopCar();
       //计算 总价格  当前商品的数量和价格
        rsc.setCurrentNumber(goodsPojo.getNumber());
        rsc.setCurrentPrice(goodsPojo.getNumber()*goodsPojo.getGprice());
//当前商品的总数量和总价格
        if(shopCar.size()==1){
            rsc.setTotal(goodsPojo.getNumber());
            rsc.setTotalPrice(goodsPojo.getNumber()*goodsPojo.getGprice());
        }else {

            putTotalAndPrice(shopCar,rsc);
        }

        return rsc;
    }


    /**
     * 减少购物车
     * @param session
     * @param gid
     * @return
     */
    @RequestMapping("subShopCar")
    public ResponseShopCar subShopCar(HttpSession session, String  gid){
        ResponseShopCar rsc = new ResponseShopCar();

        //获取购物车
        Map<String , GoodsPojo> map= (Map<String, GoodsPojo>) session.getAttribute("shopCar");
  if(map == null){
      rsc.setResultCode("00001");
      rsc.setResultMsg("异常");
      return rsc;
  }
  //获取目标商品
    GoodsPojo goodsPojo =  map.get(gid);
    if(null == goodsPojo){  //商品不再购物车里
        rsc.setResultCode("00002");
        rsc.setResultMsg("不存在");
        return rsc;
    }
  //对商品进行减的处理
        if(goodsPojo.getNumber()>1){ //多余的商品 减一
            goodsPojo.setNumber(goodsPojo.getNumber()-1);
            //当前数据的总数和总价
            rsc.setCurrentNumber(goodsPojo.getNumber());
            rsc.setCurrentPrice(goodsPojo.getNumber()*goodsPojo.getGprice());
        }else {  //只有一个商品就移除
          rsc.setResultCode("00009");
          map.remove(gid); //吧目标移除
        }

        putTotalAndPrice(map,rsc);  //当前的总数量
        return rsc;
    }


    /**
     * 移除购物车
     *
     * @param session
     * @param
     * @return
     */
   @RequestMapping("removeShopCar")
    public void removeShopCar(HttpSession session, HttpServletResponse response) throws IOException {
      session.removeAttribute("shopCar");
       response.sendRedirect("shopcart.jsp");
    }

    /**
     * 计算当前的总价和总数量
     * @param shopCar
     * @param rsc
     */
    private void putTotalAndPrice(Map<String, GoodsPojo> shopCar, ResponseShopCar rsc) {

       Set<String> keys =   shopCar.keySet();
       int total=0;
       float price=0.0f;

       //计算总数量和总价格
       GoodsPojo gp = null;
        for (String key : keys) {
            gp=shopCar.get(key); //获取商品信息
            total+=gp.getNumber();//对每个商品进行累加
            price+=gp.getNumber()*gp.getGprice();//对每个商品价格进行累加
        }
      rsc.setTotal(total);
      rsc.setTotalPrice(price);
    }



}
