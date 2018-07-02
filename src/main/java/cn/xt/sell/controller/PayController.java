package cn.xt.sell.controller;

import cn.xt.sell.dto.OrderDTO;
import cn.xt.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 22:51
 * @Description:
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public void create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl) {
        // 1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO != null) {

        }
    }

}
