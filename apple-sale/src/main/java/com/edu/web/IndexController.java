package com.edu.web;

import com.edu.pojo.CustomerPojo;
import com.edu.pojo.GoodsPojo;
import com.edu.pojo.GoodsTypePojo;
import com.edu.pojo.OrderdetailPojo;
import com.edu.service.IIndexService;
import com.edu.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    IIndexService indexService;

@RequestMapping("login")
    public String login(CustomerPojo customerPojo, Model model, HttpSession session){

    if(null == customerPojo){
        model.addAttribute("msgError","登录异常");
        return "forward:login.jsp";
    }
    if(StringUtils.isEmpty(customerPojo.getAname())){
        model.addAttribute("msgError","用户名不能为空");
        return "forward:login.jsp";

    }
    if (StringUtils.isEmpty((customerPojo.getApass()))){
        model.addAttribute("msgError","密码错误");
        return "forward:login.jsp";
    }
    CustomerPojo customer = indexService.login(customerPojo);
    if (null == customer) {
        return "login";
    }
    session.setAttribute("customer",customer);
    return "forward:index";
}






    @RequestMapping("index")
    public String  index(Model model){

        //商品列表 3个
        List<GoodsTypePojo> list = indexService.queryGoodsTypes();
        //6个商品
        List<GoodsPojo> goodsList = indexService.queryGoods();
        model.addAttribute("goodsTypeList",list);
        model.addAttribute("goodsList",goodsList);
        return "index";
    }



}
