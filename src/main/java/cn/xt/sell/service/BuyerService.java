package cn.xt.sell.service;

import cn.xt.sell.dto.OrderDTO;

/**
 * @Auther: xietao
 * @Date: 2018/7/2
 * @Description:
 */
public interface BuyerService {

    // 查询一个订单
    public OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    public OrderDTO cancelOrder(String openid, String orderId);

}
