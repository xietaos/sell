package cn.xt.sell.converter;

import cn.xt.sell.dataobject.OrderMaster;
import cn.xt.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: Administrator
 * @Date: 2018/6/29 12:49
 * @Description: 订单模型转订单传输对象转换器
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
            convert(e)
        ).collect(Collectors.toList());
    }

}
