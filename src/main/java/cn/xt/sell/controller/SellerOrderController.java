package cn.xt.sell.controller;

import cn.xt.sell.dto.OrderDTO;
import cn.xt.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 23:37
 * @Description:
 */
@Controller
@RequestMapping("/seller/order")
public class SellerOrderController {

    @Autowired
    private OrderService orderService;

    /** 订单列表. */
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size,
                             Map<String, Object> map) {
        Page<OrderDTO> orderDTOPage = orderService.findList(new PageRequest(page - 1, size));
        map.put("orderDTOPage", orderDTOPage);
        return new ModelAndView("order/list", map);
    }

}
