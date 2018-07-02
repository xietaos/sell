package cn.xt.sell.service.impl;

import cn.xt.sell.dto.OrderDTO;
import cn.xt.sell.service.PayService;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/7/2 22:54
 * @Description:
 */
@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private BestPayServiceImpl bestPayService;

    @Override
    public void create(OrderDTO orderDTO) {
        PayRequest payRequest = new PayRequest();
        bestPayService.pay(payRequest);
    }
}
