package cn.xt.sell.service;

import cn.xt.sell.dto.OrderDTO;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 22:54
 * @Description:
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
